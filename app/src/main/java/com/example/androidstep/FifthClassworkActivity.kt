package com.example.androidstep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class FifthClassworkActivity : AppCompatActivity() {
    var toSecondTask: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_classwork)
        initializeViews()
        initializeListeners()
    }
    private fun initializeViews(){
        toSecondTask = findViewById(R.id.toSecondTask)
    }
    private fun initializeListeners(){
        toSecondTask!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FifthClassworkActivity1::class.java)
            intent.putExtra("info", "info")
            startActivity(intent)
        })
    }
}