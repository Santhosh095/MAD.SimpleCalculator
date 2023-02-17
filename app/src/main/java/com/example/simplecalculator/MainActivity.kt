package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("NAME_SHADOWING")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1: EditText = findViewById(R.id.editTextNumber2)
        val num2: EditText = findViewById(R.id.editTextNumber3)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val rstbtn: Button = findViewById(R.id.button)
        val sol: TextView = findViewById(R.id.textView4)

        btn1.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x + y
            sol.text = res.toString()
        }
        btn2.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x - y
            sol.text = res.toString()
        }
        btn3.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x * y
            sol.text = res.toString()
        }
        btn4.setOnClickListener {
            val x = num1.text.toString().toInt()
            val y = num2.text.toString().toInt()
            val res = x / y
            sol.text = res.toString()
        }
        rstbtn.setOnClickListener {
            sol.text = ""
        }
    }
}