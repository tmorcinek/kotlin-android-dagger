package com.morcinek.kotlin.dagger

import com.morcinek.kotlin.dagger.modules.AndroidModule
import com.morcinek.kotlin.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Copyright 2015 Tomasz Morcinek. All rights reserved.
 */
@Singleton
@Component(modules = arrayOf(AndroidModule::class))
public interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}
