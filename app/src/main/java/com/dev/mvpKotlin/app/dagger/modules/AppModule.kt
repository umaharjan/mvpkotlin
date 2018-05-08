package com.dev.mvpKotlin.app.dagger.modules

import android.app.Application
import android.content.Context
import com.dev.mvpKotlin.app.dagger.AppScope

import dagger.Module
import dagger.Provides



@AppScope
@Module
open class AppModule(application: Application) {

    private val context: Context = application.applicationContext

    @Provides
    @AppScope
    fun context(): Context {
        return context
    }
}