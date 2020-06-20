package com.example.androidstep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FifthClassworkActivity1 : AppCompatActivity() {

    var passField: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_classwork1)

        passField = findViewById(R.id.importedText)
        passField!!.text = intent.getStringExtra("info")
    }
}