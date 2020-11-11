package com.example.apppersonajes

import android.app.Application
import com.example.apppersonajes.di.CharacterComponent
import com.example.apppersonajes.di.DaggerCharacterComponent


class CharacterApp : Application() {

    lateinit var appComponent: CharacterComponent

    override fun onCreate() {
        super.onCreate()

        appComponent=DaggerCharacterComponent.create()

    }
}