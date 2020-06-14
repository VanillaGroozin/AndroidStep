package com.example.androidstep

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var submitBtn: Button? = null
    var changeHwBtn: Button? = null
    var loginField: TextView? = null
    var passField: TextView? = null
    var resultField: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeListeners()
    }
    private fun initializeViews(){
        submitBtn = findViewById(R.id.submitBtn)
        changeHwBtn = findViewById(R.id.toAnotherHwBtn)
        loginField = findViewById(R.id.loginField)
        passField  = findViewById(R.id.passwordField)
        resultField  = findViewById(R.id.headText)
    }
    private fun initializeListeners(){
        submitBtn!!.setOnClickListener(View.OnClickListener {
            if (loginField?.text.toString().toLowerCase() == R.string.login.toString() &&
                passwordField.text.toString() == R.string.password.toString()) {
                resultField!!.text = "It is so sad =(";
            }
            resultField!!.text = "It is so sad =(";
        })

        changeHwBtn!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        })
    }
}