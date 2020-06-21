package com.example.androidstep

class QuestionUseCase {
    var quest:String = ""
    var answers:ArrayList<String> = ArrayList<String>()
    var result: String = ""

    constructor(quest: String, answers: ArrayList<String>, result: String) {
        this.quest = quest
        this.answers = answers
        this.result = result
    }

    fun checkResult(result: String):Boolean{
        return this.result == result;
    }
}