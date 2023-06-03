package com.example.exam_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NumberText = findViewById(R.id.txtNumber)
        NextNumber = findViewById(R.id.btnNextNumber)
    }

    lateinit var NumberText: TextView
    lateinit var NextNumber: Button
    var counter = 0

    fun btnNextClick(view: View) {
        counter = if (counter < 10) nextEvenNumber(counter) else 2 //если меньше 10 - залетаем в другой метод, иначе начинаем с двойки
        NumberText.text = counter.toString()
    }

    private  fun nextEvenNumber(current: Int): Int { //current - текущее значение счетчика
        return if (current % 2 == 0) current + 2 else current + 1
        //если текущее число делится без остатка, то увеличиваем на 2, иначе увеличиваем на 1,
        //чтобы получить ближайщее четное число
    }
}