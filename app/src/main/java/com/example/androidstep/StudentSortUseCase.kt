package com.example.androidstep

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class StudentSortUseCase {

    fun initiateSortStudentsByName(students: ArrayList<String>): ArrayList<String> {
        return ArrayList(students.sorted());
    }

    fun initiateSortStudentsRandom(students: ArrayList<String>):ArrayList<String> {
        return ArrayList(students.shuffled());
    }
}