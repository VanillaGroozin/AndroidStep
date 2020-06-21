package com.example.androidstep

import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class FifthClassworkActivity2 : AppCompatActivity() {
    private var cameraBtn: Button? = null
    private var imageResult:ImageView? = null
    private var imageUri: Uri? = null
    private val REQUEST_IMAGE_CAPTURE = 1

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_classwork2)
        initializeElements()
        initializeEventListeners()
    }

    private fun initializeElements() {
        cameraBtn = findViewById(R.id.camera_shot_button)
        imageResult = findViewById(R.id.camera_shot_imageview)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initializeEventListeners() {
        cameraBtn?.setOnClickListener(View.OnClickListener {
                takePictureIntent()
        })
    }

    private fun takePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK){
            imageResult?.setImageURI(imageUri)
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageResult!!.setImageBitmap(imageBitmap)
        }
    }
}