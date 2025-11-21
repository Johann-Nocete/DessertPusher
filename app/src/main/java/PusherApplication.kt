package com.example.dessertpusher

import android.app.Application
import timber.log.Timber

class PusherApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Initialize Timber
        Timber.plant(Timber.DebugTree())
    }
}
