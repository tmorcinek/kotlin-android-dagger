package com.morcinek.kotlin

import android.app.Application
import com.morcinek.kotlin.dagger.modules.AndroidModule
import com.morcinek.kotlin.dagger.ApplicationComponent
import com.morcinek.kotlin.dagger.DaggerApplicationComponent


/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
class MainApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        this.component = DaggerApplicationComponent.builder().androidModule(AndroidModule(this)).build()
    }
}