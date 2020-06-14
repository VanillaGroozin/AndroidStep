package com.example.androidstep

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class second : AppCompatActivity() {
    var changeHwBtn: Button? = null
    var listView: ListView? = null
    var chk1: CheckBox? = null
    var chk2: CheckBox? = null
    var chk3: CheckBox? = null
    var chk4: CheckBox? = null
    var chk5: CheckBox? = null
    var chk6: CheckBox? = null
    var chk7: CheckBox? = null
    var chk8: CheckBox? = null
    var chk9: CheckBox? = null
    var chk10: CheckBox? = null
    var chk11: CheckBox? = null
    var chk12: CheckBox? = null
    var chk13: CheckBox? = null
    var chk14: CheckBox? = null
    var chk15: CheckBox? = null

    var checkBtn: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initializeViews()
        initializeListeners()
    }

    private fun initializeViews() {
        changeHwBtn = findViewById(R.id.toAnotherHwBtn)

        chk1 = findViewById(R.id.chk1)
        chk2 = findViewById(R.id.chk2)
        chk3 = findViewById(R.id.chk3)
        chk4 = findViewById(R.id.chk4)
        chk5 = findViewById(R.id.chk5)
        chk6 = findViewById(R.id.chk6)
        chk7 = findViewById(R.id.chk7)
        chk8 = findViewById(R.id.chk8)
        chk9 = findViewById(R.id.chk9)
        chk10 = findViewById(R.id.chk10)
        chk11 = findViewById(R.id.chk11)
        chk12 = findViewById(R.id.chk12)
        chk13 = findViewById(R.id.chk13)
        chk14 = findViewById(R.id.chk14)
        chk15 = findViewById(R.id.chk15)

        checkBtn = findViewById(R.id.checkBtn)

        chk1!!.text = getRandomProduct()
        chk2!!.text = getRandomProduct()
        chk3!!.text = getRandomProduct()
        chk4!!.text = getRandomProduct()
        chk5!!.text = getRandomProduct()
        chk6!!.text = getRandomProduct()
        chk7!!.text = getRandomProduct()
        chk8!!.text = getRandomProduct()
        chk9!!.text = getRandomProduct()
        chk10!!.text = getRandomProduct()
        chk11!!.text = getRandomProduct()
        chk12!!.text = getRandomProduct()
        chk13!!.text = getRandomProduct()
        chk14!!.text = getRandomProduct()
        chk15!!.text = getRandomProduct()
    }

    private fun initializeListeners() {
        changeHwBtn!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })

        checkBtn!!.setOnClickListener(View.OnClickListener {
            checkChkBox(chk1)
            checkChkBox(chk3)
            checkChkBox(chk4)
            checkChkBox(chk5)
            checkChkBox(chk6)
            checkChkBox(chk7)
            checkChkBox(chk8)
            checkChkBox(chk9)
            checkChkBox(chk10)
            checkChkBox(chk11)
            checkChkBox(chk12)
            checkChkBox(chk13)
            checkChkBox(chk14)
            checkChkBox(chk15)
        })
    }

    private fun checkChkBox(chk: CheckBox?) {
        if (chk!!.isChecked) {
            chk!!.setTextColor(Color.parseColor("#FF0000"))
        }
    }

    private fun getRandomProduct(): String {
        val products = arrayOf(
            "Хлеб", "Барсик", "Мурзик", "Мурка", "Васька",
            "Томасина", "Кристина", "Пушок", "Дымка", "Кузя",
            "Китти", "Масяня", "Симба"
        )
        return products[(0..products.size).random()];
    }
}