package com.example.androidstep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class StudentActivity : AppCompatActivity(){

    var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        initializeDefaultFragment()
    }

    fun initializeDefaultFragment(){
        if(currentFragment == null){
            currentFragment = StudentsFragment()
            displayFragment(currentFragment!!)
        }
    }

    fun displayFragment(fragment: Fragment){

        this.currentFragment = fragment
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        supportFragmentManager.executePendingTransactions()
        fragmentTransaction.add(
            R.id.relativelayout_activity_students_fragment_container,
            fragment!!,
            fragment?.javaClass?.name ?: "")

        fragmentTransaction.addToBackStack("Name")
        fragmentTransaction.commit()
    }
}