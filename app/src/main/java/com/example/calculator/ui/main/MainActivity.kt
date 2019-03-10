package com.example.calculator.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import com.example.calculator.di.Application
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Application.getComponent().inject(this)
        initViews()
    }

    private fun initViews() {
        Log.i("TEST", "$presenter")
        presenter.doSomething()
    }

}