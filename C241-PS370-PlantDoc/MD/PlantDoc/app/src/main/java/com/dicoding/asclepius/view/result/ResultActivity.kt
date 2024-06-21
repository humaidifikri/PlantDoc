package com.dicoding.asclepius.view.result

import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.asclepius.R
import com.dicoding.asclepius.data.database.ClassificationResult
import com.dicoding.asclepius.databinding.ActivityResultBinding
import com.dicoding.asclepius.predict.helper.PepperbellNew
import com.dicoding.asclepius.util.ViewModelFactory
import org.json.JSONException
import org.json.JSONObject

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    private lateinit var pepperbellNew: PepperbellNew
    private val viewModel: ResultViewModel by viewModels {
        ViewModelFactory.getInstance(this)
    }

    private var result: ClassificationResult? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        if (intent.hasExtra(EXTRA_IMAGE_URI)) {
            val imageUri = Uri.parse(intent.getStringExtra(EXTRA_IMAGE_URI))
            imageUri?.let {
                binding.resultImage.setImageURI(it)
            }

            if (intent.hasExtra(EXTRA_RESULT)) {
                val resultJson = intent.getStringExtra(EXTRA_RESULT)
                resultJson?.let {
                    val label = extractLabelFromJson(it)
                    updateView(imageUri, label)
                    result = ClassificationResult(
                        timestamp = System.currentTimeMillis(),
                        imageUri = imageUri.toString(),
                        label = label
                    )
                }
            }

            binding.btnAction.setOnClickListener {
                result?.let { viewModel.insert(it) }
                finish()
            }
        } else if (intent.hasExtra(EXTRA_RESULT)) {
            result = if (Build.VERSION.SDK_INT >= 33) {
                intent.getParcelableExtra(EXTRA_RESULT, ClassificationResult::class.java)
            } else {
                @Suppress("DEPRECATION")
                intent.getParcelableExtra(EXTRA_RESULT)
            }

            result?.let {
                updateView(Uri.parse(it.imageUri), it.label)
                binding.btnAction.setOnClickListener {
                    viewModel.delete(result!!)
                    finish()
                }
            }
            binding.btnAction.text = getString(R.string.delete)
        }
    }

    private fun extractLabelFromJson(json: String): String {
        try {
            val jsonObject = JSONObject(json)
            if (jsonObject.has("result")) {
                return jsonObject.getString("result")
            } else {
                Log.e("ResultActivity", "JSON object does not contain 'result' key")
                return "Unknown"
            }
        } catch (e: JSONException) {
            Log.e("ResultActivity", "Error parsing JSON: ${e.message}")
            return "Unknown"
        }
    }

    private fun updateView(imageUri: Uri, label: String) {
        binding.resultImage.setImageURI(imageUri)
        binding.resultText.text = label
    }

    companion object {
        const val EXTRA_IMAGE_URI = "extra_image_uri"
        const val EXTRA_RESULT = "extra_result"
        const val EXTRA_INFERENCE_TIME = "extra_inference_time"
    }
}
