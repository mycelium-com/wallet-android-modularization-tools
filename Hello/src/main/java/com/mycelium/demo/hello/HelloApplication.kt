package com.mycelium.demo.hello

import android.app.Application
import com.mycelium.modularizationtools.CommunicationManager

class HelloApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CommunicationManager.init(this)
    }
}