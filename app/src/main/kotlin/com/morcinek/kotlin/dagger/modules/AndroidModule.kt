package com.morcinek.kotlin.dagger.modules

import android.content.Context
import android.content.Context.LOCATION_SERVICE
import android.location.LocationManager
import com.morcinek.kotlin.MainApplication
import com.morcinek.kotlin.dagger.ForApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
@Module
class AndroidModule(private val application: MainApplication) {

    @Provides
    @Singleton
    @ForApplication
    fun provideApplicationContext(): Context {
        return application
    }

    @Provides
    @Singleton
    fun provideLocationManager(): LocationManager {
        return application.getSystemService(LOCATION_SERVICE) as LocationManager
    }
}