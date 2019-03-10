package com.example.calculator.ui.main

import android.util.Log
import com.example.calculator.data.Api
import javax.inject.Inject

class MainPresenter @Inject constructor(val api: Api) {
    fun doSomething() {
        Log.i("TEST", "doSomething:() $api")
    }


}