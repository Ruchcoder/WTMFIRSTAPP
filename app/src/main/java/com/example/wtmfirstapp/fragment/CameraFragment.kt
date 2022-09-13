package com.example.wtmfirstapp.fragment

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.wtmfirstapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.lang.Exception

class CameraFragment : Fragment() {
    private lateinit var cameraPreview:PreviewView
    private lateinit var takePhotoBtn: FloatingActionButton
    private lateinit var imageCaptured:ImageCapture

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){

        cameraPreview = view.findViewById(R.id.camera_preview)
        takePhotoBtn = view.findViewById(R.id.take_photo_btn)



        if (allPermissionsGranted()){
            val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())

            cameraProviderFuture.addListener({
                //bind to lifecycle
                val cameraProvider=cameraProviderFuture.get()
                val preview = Preview.Builder().build()
                preview.setSurfaceProvider(cameraPreview.surfaceProvider)
                imageCaptured = ImageCapture.Builder().build()

                //select the camera to use
                val cameraSelected = CameraSelector.DEFAULT_BACK_CAMERA

                try{
                    cameraProvider.unbindAll()

                    cameraProvider.bindToLifecycle(
                        this,
                        cameraSelected,
                        preview,
                        imageCaptured
                    )

                } catch (e: Exception){
                    Log.e("SneakChat", "Camera Binding Failed $e")

                    Toast.makeText(requireContext(), "Camera Binding unsuccessful", Toast.LENGTH_LONG).show()

                }

            },  ContextCompat.getMainExecutor(requireContext()))
        }

        else {

            ActivityCompat.requestPermissions(
                requireActivity(),
                arrayOf(Manifest.permission.CAMERA),
                111
            )
        }
    }

    private fun allPermissionsGranted(): Boolean {
        return ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED

    }

}

