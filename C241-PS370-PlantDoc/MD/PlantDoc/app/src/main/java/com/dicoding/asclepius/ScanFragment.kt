package com.dicoding.asclepius

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.dicoding.asclepius.databinding.FragmentNewsBinding
import com.dicoding.asclepius.databinding.FragmentScanBinding
import com.dicoding.asclepius.predict.helper.PepperbellNew
import com.dicoding.asclepius.view.result.ResultActivity
import com.yalantis.ucrop.UCrop
import java.io.File

class ScanFragment : Fragment(), PepperbellNew.ClassifierListener {

    private lateinit var binding: FragmentScanBinding

    private var currentImageUri: Uri? = null
    private lateinit var launcherGallery: ActivityResultLauncher<PickVisualMediaRequest>
    private var cameraResultLauncher: ActivityResultLauncher<Intent>? = null

    private lateinit var pepperbellNew: PepperbellNew

    companion object {
        const val CAMERA_X_RESULT = 200
        private const val TAG = "NewsFragment"
        private const val REQUEST_CAMERA_PERMISSION = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize PepperbellNew
        pepperbellNew = PepperbellNew(requireContext(), this)

        // Initialize the gallery launcher
        launcherGallery =
            registerForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
                if (uri != null) {
                    moveToCrop(uri)
                    currentImageUri = uri
                    showImage()
                } else {
                    showToast(getString(R.string.failed_to_pick_image))
                }
            }

        // Initialize the camera result launcher
        cameraResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == AppCompatActivity.RESULT_OK) {
                    val photoFile = result.data?.getSerializableExtra("picture") as? File
                    val isBackCamera = result.data?.getBooleanExtra("isBackCamera", true) ?: true
                    if (photoFile != null) {
                        val photoUri = Uri.fromFile(photoFile)
                        moveToCrop(photoUri)
                        currentImageUri = photoUri
                        showImage()
                    } else {
                        showToast(getString(R.string.failed_to_take_photo))
                    }
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentScanBinding.inflate(inflater, container, false)

        binding.galleryButton.setOnClickListener { startGallery() }
        binding.cameraXButton.setOnClickListener { startCameraWithPermissionCheck() }
        binding.analyzeButton.setOnClickListener { analyzeImage() }

        return binding.root
    }

    private fun startGallery() {
        launcherGallery.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }

    private fun startCameraWithPermissionCheck() {
        if (ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            startCamera()
        } else {
            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.CAMERA),
                REQUEST_CAMERA_PERMISSION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CAMERA_PERMISSION) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                startCamera()
            } else {
                showToast(getString(R.string.failed_to_take_photo))
            }
        }
    }

    private fun startCamera() {
        val intent = Intent(requireContext(), CameraActivity::class.java)
        cameraResultLauncher?.launch(intent)
    }

    private fun moveToCrop(uri: Uri) {
        UCrop.of(
            uri,
            Uri.fromFile(requireContext().cacheDir.resolve("${System.currentTimeMillis()}.jpg"))
        )
            .start(requireContext(), this)
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d(TAG, "onActivityResult")
        if (resultCode == AppCompatActivity.RESULT_OK && requestCode == UCrop.REQUEST_CROP) {
            currentImageUri = UCrop.getOutput(data!!)
            showImage()
        } else if (resultCode == UCrop.RESULT_ERROR) {
            val errorMessage = UCrop.getError(data!!)?.message.toString()
            showToast(errorMessage)
            Log.e(TAG, errorMessage)
        }
    }

    private fun showImage() {
        currentImageUri?.let {
            binding.previewImageView.setImageURI(it)
        }
        updateButtonStatus()
    }

    private fun analyzeImage() {
        Log.d(TAG, "analyzeImage called")
        currentImageUri?.let { uri ->
            Log.d(TAG, "currentImageUri is $uri")
            pepperbellNew.classifyStaticImage(uri)
        } ?: run {
            Log.d(TAG, "currentImageUri is null")
            showToast("No image selected")
        }
    }

    private fun updateButtonStatus() {
        binding.analyzeButton.isEnabled = currentImageUri != null
    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

    override fun onError(error: String) {
        Log.e(TAG, "Error: $error")
        showToast(error)
    }

    override fun onResults(results: String?, inferenceTime: Long) {
        Log.d(TAG, "Results: $results")
        val intent = Intent(activity, ResultActivity::class.java)
        intent.putExtra(ResultActivity.EXTRA_IMAGE_URI, currentImageUri.toString())
        intent.putExtra(ResultActivity.EXTRA_RESULT, results) // Mengirimkan label langsung
        startActivity(intent)
    }

}