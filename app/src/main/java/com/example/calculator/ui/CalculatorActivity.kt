package com.example.calculator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        initViews()
    }

    private fun initViews() {
        calculateButton.setOnClickListener {

        }
    }

    private fun calculate(leftValue: String, rightValue: String) {

    }
}