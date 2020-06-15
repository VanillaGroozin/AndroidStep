package com.example.androidstep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class StudentsActivity : AppCompatActivity() {
    val StudentSort = StudentSortUseCase()
    var studentsDb = ArrayList<String>()
    var sortStudentsByNameBtn: Button? = null
    var sortStudentsByRandomBtn: Button? = null
    var studentList: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_students)
        createStudentsDb()
        initializeViews()
        initializeListeners()
        fillStudentsList(studentsDb)
    }

    private fun createStudentsDb(){
        studentsDb.add("Marleen Charlesworth")
        studentsDb.add("Giuseppe Fulton")
        studentsDb.add("Carlee Ruggerio")
        studentsDb.add("Florene Beach")
        studentsDb.add("Vince Ashcroft")
        studentsDb.add("Jettie Secord")
        studentsDb.add("Eddie Onan")
        studentsDb.add("Lela Selfridge")
        studentsDb.add("Vaughn Wedding")
        studentsDb.add("Sol Vargo")
        studentsDb.add("Aariz Strickland")
        studentsDb.add("Heena Conrad")
        studentsDb.add("Christy Nolan")
        studentsDb.add("Damon Santos")
        studentsDb.add("Aniela Galindo")
    }

    private fun initializeViews() {
        studentList = findViewById(R.id.textview_activity_students_list)
        sortStudentsByRandomBtn = findViewById(R.id.button_activity_students_sort_random)
        sortStudentsByNameBtn = findViewById(R.id.button_activity_students_sort_byname)
    }

    private fun initializeListeners(){
        sortStudentsByRandomBtn!!.setOnClickListener(View.OnClickListener {
            fillStudentsList(StudentSort.initiateSortStudentsRandom(studentsDb))
        })

        sortStudentsByNameBtn!!.setOnClickListener(View.OnClickListener {
            fillStudentsList(StudentSort.initiateSortStudentsByName(studentsDb))
        })
    }

    private fun fillStudentsList(students: ArrayList<String>) {
        studentList!!.text = null
        for (student in students){
            studentList!!.text = studentList!!.text.toString() + student + '\n'
        }
    }
}