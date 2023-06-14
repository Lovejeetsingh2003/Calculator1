package com.example.calculator

import android.annotation.SuppressLint
import android.app.admin.FactoryResetProtectionPolicy
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etFirst : EditText
    lateinit var etSecond : EditText
    lateinit var tvNumber: TextView
    lateinit var btnAdd : Button
    lateinit var btnMin : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var btnReset : Button
    var  show = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirst = findViewById(R.id.etFirst)
        etSecond = findViewById(R.id.etSecond)
        tvNumber = findViewById(R.id.tvNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnMin= findViewById(R.id.btnMin)
        btnMul = findViewById(R.id.btnMul)
        btnDiv = findViewById(R.id.btnDiv)
        btnReset = findViewById(R.id.btnReset)

        tvNumber.text = show.toString()
        btnAdd.setOnClickListener {
            val value1 = etFirst.text.toString().toInt()
            val value2 = etSecond.text.toString().toInt()
            show = value1 + value2
            tvNumber.text = show.toString()
        }
        btnMin.setOnClickListener {
            val value1 = etFirst.text.toString().toInt()
            val value2 = etSecond.text.toString().toInt()
            show = value1 - value2
            tvNumber.text = show.toString()
        }
        btnMul.setOnClickListener {
            val value1 = etFirst.text.toString().toInt()
            val value2 = etSecond.text.toString().toInt()
            show = value1 * value2
            tvNumber.text = show.toString()
        }
        btnDiv.setOnClickListener {
            val value1 = etFirst.text.toString().toInt()
            val value2 = etSecond.text.toString().toInt()
            show = value1 / value2
            tvNumber.text = show.toString()
        }
        btnReset.setOnClickListener {
            show = 0
            etFirst.text.clear()
            etSecond.text.clear()
            tvNumber.text = show.toString()
        }
    }
}