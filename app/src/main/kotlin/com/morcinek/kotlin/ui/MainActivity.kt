package com.morcinek.kotlin.ui

import android.location.LocationManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.morcinek.kotlin.MainApplication
import com.morcinek.kotlin.R
import kotlinx.android.synthetic.main.main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.toast
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
        (application as MainApplication).component.inject(this)

        mainText.text = locationManager.toString();

        button.setOnClickListener({
            alert("This is a warning dialog") {
                positiveButton(android.R.string.ok) {
                    toast("Ok Clicked")
                }
                negativeButton(android.R.string.cancel)
            }.show()
        })
    }

}
