package com.myweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "PDnmIgc1XeFZ7pdH"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}