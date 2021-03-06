package com.example.androidstep

import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class ForthClassworkActivity : AppCompatActivity() {
    var callBtn: Button? = null;
    var cameraBtn: Button? = null;

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth_classwork)
        initializeElements()
        initializeEventListeners()
    }


    fun initializeElements() {
        callBtn = findViewById(R.id.button_activity_make_call)
        cameraBtn = findViewById(R.id.button_activity_open_camera)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initializeEventListeners() {
        callBtn?.setOnClickListener(View.OnClickListener {
            if (!initiateCheckPermissionCallPhone())
                initiateRequestPermissionsCallPhone()
            else
                initiateCallPhone("7716975513")
        })

        cameraBtn?.setOnClickListener(View.OnClickListener {
            if (!initiateCheckPermissionCamera())
                initiateRequestPermissionsCamera()
            else
                initiateCamera()
        })
    }


    fun initiateCallPhone(phone: String) {
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phone"))
        startActivity(intent)
    }

    fun initiateCamera() {
        val values = ContentValues()
        values.put(MediaStore.Images.Media.TITLE, "New Picture")
        values.put(MediaStore.Images.Media.DESCRIPTION, "From the Camera")

        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        intent.putExtra(MediaStore.EXTRA_OUTPUT, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(intent, 103)
    }



    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateRequestPermissionsCallPhone() {
        requestPermissions(Array(1) { android.Manifest.permission.CALL_PHONE }, 101)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateRequestPermissionsCamera() {
        requestPermissions(Array(1) { android.Manifest.permission.CAMERA }, 102)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateCheckPermissionCallPhone(): Boolean {
        return checkSelfPermission(android.Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateCheckPermissionCamera(): Boolean {
        return checkSelfPermission(android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            101 -> {
                if (grantResults.isNotEmpty()) {
                    initiateCallPhone("7716975513")
                }
            }
            102 -> {
                if (grantResults.isNotEmpty()) {
                    initiateCamera()
                }
            }
        }
    }
}