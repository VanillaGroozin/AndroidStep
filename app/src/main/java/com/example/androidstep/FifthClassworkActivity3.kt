package com.example.androidstep

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class FifthClassworkActivity3 : AppCompatActivity() {
    var questions = initializeQuestions()
    var totalQuest:QuestionUseCase? = null;
    var totalResult:Int = 0
    var textViewQuest: TextView? = null
    var textViewResult:TextView? = null
    var buttonAnswer1: Button? = null
    var buttonAnswer2: Button? = null
    var buttonAnswer3: Button? = null
    var buttonAnswer4: Button? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_classwork3)
        initializeViews()
        initiateQuest()
        initializeListeners()
    }

    private fun initializeQuestions():ArrayList<QuestionUseCase>{
        var questions = ArrayList<QuestionUseCase>()
        questions.add(QuestionUseCase("1?", arrayListOf("1","2","3","4"),"1"))
        questions.add(QuestionUseCase("2?", arrayListOf("1","2","3","4"),"2"))
        questions.add(QuestionUseCase("3?", arrayListOf("1","2","3","4"),"3"))
        questions.add(QuestionUseCase("4?", arrayListOf("1","2","3","4"),"4"))
        return questions;
    }

    private fun initializeViews(){
        textViewQuest = findViewById(R.id.fifthClassWork3_text_view_quest)
        buttonAnswer1 = findViewById(R.id.fifthClassWork3_button_answer1)
        buttonAnswer2 = findViewById(R.id.fifthClassWork3_button_answer2)
        buttonAnswer3 = findViewById(R.id.fifthClassWork3_button_answer3)
        buttonAnswer4 = findViewById(R.id.fifthClassWork3_button_answer4)
        textViewResult = findViewById(R.id.fifthClassWork3_text_view_result)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initiateQuest(){
        buttonAnswer1?.setBackgroundColor(getColor(R.color.grey))
        buttonAnswer2?.setBackgroundColor(getColor(R.color.grey))
        buttonAnswer3?.setBackgroundColor(getColor(R.color.grey))
        buttonAnswer4?.setBackgroundColor(getColor(R.color.grey))
        if(questions.count()>0){
            var quest = questions.first();
            textViewQuest!!.setText(quest.quest)
            buttonAnswer1!!.setText(quest.answers[0])
            buttonAnswer2!!.setText(quest.answers[1])
            buttonAnswer3!!.setText(quest.answers[2])
            buttonAnswer4!!.setText(quest.answers[3])
            totalQuest=quest;
        } else {
            textViewQuest!!.visibility = View.INVISIBLE
            buttonAnswer1!!.visibility = View.INVISIBLE
            buttonAnswer2!!.visibility = View.INVISIBLE
            buttonAnswer3!!.visibility = View.INVISIBLE
            buttonAnswer4!!.visibility = View.INVISIBLE
            textViewResult?.setText("Количество правильных ответов = $totalResult")
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun initializeListeners(){
        buttonAnswer1?.setOnClickListener(View.OnClickListener {
            if(buttonAnswer1?.text.toString()==totalQuest?.result){
                buttonAnswer1?.setBackgroundColor(getColor(R.color.green))
                totalResult+=1;
            }else{
                buttonAnswer1?.setBackgroundColor(getColor(R.color.red))
                if(buttonAnswer2?.text.toString()==totalQuest?.result)buttonAnswer2?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer3?.text.toString()==totalQuest?.result)buttonAnswer3?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer4?.text.toString()==totalQuest?.result)buttonAnswer4?.setBackgroundColor(getColor(R.color.green))
            }
            Handler().postDelayed({
                questions.remove(totalQuest)
                initiateQuest()
            }, 2000)
        })

        buttonAnswer2?.setOnClickListener(View.OnClickListener {
            if(buttonAnswer2?.text.toString()==totalQuest?.result){
                buttonAnswer2?.setBackgroundColor(getColor(R.color.green))
                totalResult+=1;
            }else{
                buttonAnswer2?.setBackgroundColor(getColor(R.color.red))
                if(buttonAnswer1?.text.toString()==totalQuest?.result)buttonAnswer1?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer3?.text.toString()==totalQuest?.result)buttonAnswer3?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer4?.text.toString()==totalQuest?.result)buttonAnswer4?.setBackgroundColor(getColor(R.color.green))
            }
            Handler().postDelayed({
                questions.remove(totalQuest)
                initiateQuest()
            }, 2000)
        })

        buttonAnswer3?.setOnClickListener(View.OnClickListener {
            if(buttonAnswer3?.text.toString()==totalQuest?.result){
                buttonAnswer3?.setBackgroundColor(getColor(R.color.green))
                totalResult+=1;
            }else{
                buttonAnswer3?.setBackgroundColor(getColor(R.color.red))
                if(buttonAnswer1?.text.toString()==totalQuest?.result)buttonAnswer1?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer2?.text.toString()==totalQuest?.result)buttonAnswer2?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer4?.text.toString()==totalQuest?.result)buttonAnswer4?.setBackgroundColor(getColor(R.color.green))
            }
            Handler().postDelayed({
                questions.remove(totalQuest)
                initiateQuest()
            }, 2000)
        })

        buttonAnswer4?.setOnClickListener(View.OnClickListener {
            if(buttonAnswer4?.text.toString()==totalQuest?.result){
                buttonAnswer4?.setBackgroundColor(getColor(R.color.green))
                totalResult+=1;
            }else{
                buttonAnswer4?.setBackgroundColor(getColor(R.color.red))
                if(buttonAnswer1?.text.toString()==totalQuest?.result)buttonAnswer1?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer3?.text.toString()==totalQuest?.result)buttonAnswer3?.setBackgroundColor(getColor(R.color.green))
                if(buttonAnswer2?.text.toString()==totalQuest?.result)buttonAnswer2?.setBackgroundColor(getColor(R.color.green))
            }
            Handler().postDelayed({
                questions.remove(totalQuest)
                initiateQuest()
            }, 2000)
        })
    }
}