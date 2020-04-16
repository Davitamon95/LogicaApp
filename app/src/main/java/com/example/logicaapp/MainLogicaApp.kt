package com.example.logicaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainLogicaApp : AppCompatActivity() {
    var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    submitbutton.setOnClickListener { onButtonPress() }
}

    /**
     *Methode om bij een buttonpress checkanswer uit te voeren en
     * het aantal goede antwoorden eerst op nul zetten
     */
private fun onButtonPress() {
    correctAnswers = 0
    checkAnswer()
}

    /**
     *Methode om aantal goede antwoorden te tellen als correctanswers
     * Maakt toast message aan met aantal goede antwoorden
     */
private fun checkAnswer() {
    if (A1.text.toString() == "T" || A1.text.toString() == "t") {
        correctAnswers++
    }

    if (A2.text.toString() == "F" || A2.text.toString() == "f") {
        correctAnswers++
    }

    if (A3.text.toString() == "F" || A3.text.toString() == "f") {
        correctAnswers++
    }

    if (A4.text.toString() == "F" || A4.text.toString() == "f") {
        correctAnswers++
    }

    Toast.makeText(this, getString(R.string.ToastMessage) + " $correctAnswers", Toast.LENGTH_SHORT).show()
}
}
