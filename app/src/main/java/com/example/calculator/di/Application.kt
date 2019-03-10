package com.example.calculator.di

import android.app.Application
import com.example.calculator.di.component.AppComponent
import com.example.calculator.di.component.DaggerAppComponent

class Application : Application() {

    companion object {
        private lateinit var component: AppComponent

        fun getComponent(): AppComponent {
            return component
        }
    }

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder()
            .build()
    }


}