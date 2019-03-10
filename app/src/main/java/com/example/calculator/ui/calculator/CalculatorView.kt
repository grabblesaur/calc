package com.example.calculator.ui.calculator

import java.math.BigDecimal

interface CalculatorView {
    fun showResult(result: BigDecimal)
}