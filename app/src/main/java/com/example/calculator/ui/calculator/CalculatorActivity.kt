package com.example.calculator.ui.calculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import kotlinx.android.synthetic.main.activity_calculator.*
import java.math.BigDecimal

class CalculatorActivity : AppCompatActivity(), CalculatorView {

    private val TAG = CalculatorActivity::class.java.simpleName

    private var currentOperation: OperationType =
        OperationType.PLUS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        initViews()
    }

    private fun initViews() {

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            currentOperation = when (checkedId) {
                R.id.plusRadioButton -> OperationType.PLUS
                R.id.minusRadioButton -> OperationType.MINUS
                R.id.multiplyRadioButton -> OperationType.MULTIPLY
                R.id.divideRadioButton -> OperationType.DIVIDE
                else -> OperationType.PLUS
            }
        }

        calculateButton.setOnClickListener {
            val leftValue = leftValueEditText.text.toString().toBigDecimalOrNull()
            val rightValue = rightValueEditText.text.toString().toBigDecimalOrNull()
            if (leftValue != null && rightValue != null) {
                calculate(leftValue, rightValue)
            }
        }
    }

    private fun calculate(leftValue: BigDecimal, rightValue: BigDecimal) {
        Log.i(TAG, "leftValue = $leftValue, currentOperation = $currentOperation, rightValue = $rightValue")
        val result = when (currentOperation) {
            OperationType.PLUS -> plus(leftValue, rightValue)
            OperationType.MINUS -> minus(leftValue, rightValue)
            OperationType.MULTIPLY -> multiply(leftValue, rightValue)
            OperationType.DIVIDE -> divide(leftValue, rightValue)
        }
        showResult(result)
    }

    private fun plus(leftValue: BigDecimal, rightValue: BigDecimal): BigDecimal {
        return leftValue + rightValue
    }

    private fun minus(leftValue: BigDecimal, rightValue: BigDecimal): BigDecimal {
        return leftValue - rightValue
    }

    private fun multiply(leftValue: BigDecimal, rightValue: BigDecimal): BigDecimal {
        return leftValue * rightValue
    }

    private fun divide(leftValue: BigDecimal, rightValue: BigDecimal): BigDecimal {
        return leftValue / rightValue
    }

    override fun showResult(result: BigDecimal) {
        resultTextView.text = "$result"
    }
}