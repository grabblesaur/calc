package com.example.calculator.di.component

import com.example.calculator.di.module.ApiModule
import com.example.calculator.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}