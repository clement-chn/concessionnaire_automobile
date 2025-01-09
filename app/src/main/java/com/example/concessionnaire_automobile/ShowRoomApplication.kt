package com.example.concessionnaire_automobile

import android.app.Application

class ShowRoomApplication : Application() {
    companion object{
        lateinit var instance: ShowRoomApplication
            private set
        lateinit var carsDatabase: CarsDatabase
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        carsDatabase = CarsDatabase.getDatabaste(applicationContext)
    }
}