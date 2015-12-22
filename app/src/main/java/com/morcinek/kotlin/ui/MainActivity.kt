package com.morcinek.kotlin.ui

import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.morcinek.kotlin.R
import javax.inject.Inject

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var locationManager: LocationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}
