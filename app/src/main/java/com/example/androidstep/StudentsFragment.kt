package com.example.androidstep

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentsFragment : Fragment(){

    var rootView: View? = null

    var students: ArrayList<Student> = ArrayList()

    var recyclerViewStudents: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView= LayoutInflater.from(context).inflate(
            R.layout.students_fragment,
            container,
            false)
        initializeData()
        initializeLayoutManager()
        return rootView
    }

    fun initializeLayoutManager(){
        recyclerViewStudents?.layoutManager = LinearLayoutManager(context)
    }


    fun initializeData(){
        students.add(Student("Vasya", "Good Student"))
        students.add(Student("John", "Bad Student"))
        students.add(Student("Log", "Average Student"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }
}