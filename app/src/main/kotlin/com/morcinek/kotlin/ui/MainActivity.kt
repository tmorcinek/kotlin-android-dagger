package com.morcinek.kotlin.ui

import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.*
import com.morcinek.kotlin.MainApplication
import com.morcinek.kotlin.R
import javax.inject.Inject

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
public class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var locationManager: LocationManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        (application as MainApplication).component.inject(this)

        mainText.text = locationManager.toString();
    }

}
