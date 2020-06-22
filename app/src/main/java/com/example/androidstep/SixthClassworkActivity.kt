package com.example.androidstep

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.activity_sixth_classwork.*

class SixthClassworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth_classwork)

        val apiVersion = AppCompatTextView(this)
        apiVersion.textSize = 25f
        apiVersion.gravity = Gravity.CENTER;
        apiVersion.text = "version: " + Build.VERSION.RELEASE

        sixth_classwork_view.addView(apiVersion)
    }
}