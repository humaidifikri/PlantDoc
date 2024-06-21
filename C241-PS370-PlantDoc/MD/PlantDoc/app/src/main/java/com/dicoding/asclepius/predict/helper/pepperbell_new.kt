package com.dicoding.asclepius.predict.helper

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.SystemClock
import android.util.Log
import com.dicoding.asclepius.predict.api.ApiConfig
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.ByteArrayOutputStream

class PepperbellNew(
    private val context: Context,
    private val classifierListener: ClassifierListener?,
    private val modelName: String = ""
) {

    fun classifyStaticImage(imageUri: Uri) {
        val bitmap = uriToBitmap(imageUri) ?: return
        uploadImage(bitmap)
    }

    private fun uploadImage(bitmap: Bitmap) {
        val byteArrayOutputStream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)
        val imageBytes = byteArrayOutputStream.toByteArray()

        val requestFile = RequestBody.create("image/jpeg".toMediaTypeOrNull(), imageBytes)
        val body = MultipartBody.Part.createFormData("file", "image.jpg", requestFile)

        val apiService = ApiConfig.getApiService()
        val startTime = SystemClock.uptimeMillis()
        apiService.predict(body).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                val inferenceTime = SystemClock.uptimeMillis() - startTime
                if (response.isSuccessful) {
                    val result = response.body()?.string()
                    classifierListener?.onResults(result, inferenceTime)
                } else {
                    classifierListener?.onError(response.errorBody()?.string() ?: "Unknown error")
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                classifierListener?.onError(t.message ?: "Network request failed")
            }
        })
    }

    private fun uriToBitmap(uri: Uri): Bitmap? {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri)
            BitmapFactory.decodeStream(inputStream)
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e(TAG, e.message.toString())
            null
        }
    }

    interface ClassifierListener {
        fun onError(error: String)
        fun onResults(results: String?, inferenceTime: Long)
    }

    companion object {
        private const val TAG = "PepperbellNew"
    }
}
