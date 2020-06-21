package com.example.androidstep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class FifthClassworkActivity : AppCompatActivity() {
    var toFirstTask: Button? = null
    var toSecondTask: Button? = null
    var toThirdTask: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_classwork)
        initializeViews()
        initializeListeners()
    }
    private fun initializeViews(){
        toFirstTask = findViewById(R.id.toFirstTask)
        toSecondTask = findViewById(R.id.toSecondTask)
        toThirdTask = findViewById(R.id.toThirdTask)
    }
    private fun initializeListeners(){
        toFirstTask!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FifthClassworkActivity1::class.java)
            intent.putExtra("info", "info")
            startActivity(intent)
        })

        toSecondTask!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FifthClassworkActivity2::class.java)
            startActivity(intent)
        })

        toThirdTask!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, FifthClassworkActivity3::class.java)
            startActivity(intent)
        })
    }
}