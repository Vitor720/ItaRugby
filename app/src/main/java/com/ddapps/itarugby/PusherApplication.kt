package com.ddapps.itarugby

import android.app.Application
import com.facebook.appevents.AppEventsLogger
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import timber.log.Timber
import com.facebook.FacebookSdk

class PusherApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // TIMBER LOG DEBUGGER
        Timber.plant(Timber.DebugTree())

        // SOCIAL LOGIN CODE
        AppEventsLogger.activateApp(this)

        //FIREBASE
        FirebaseApp.initializeApp(this)
    }

}