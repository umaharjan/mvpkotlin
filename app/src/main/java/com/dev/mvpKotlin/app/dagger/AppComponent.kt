package com.dev.mvpKotlin.app.dagger

import android.content.Context
import com.dev.mvpKotlin.app.dagger.AppScope
import com.dev.mvpKotlin.app.dagger.modules.AppModule


import dagger.Component



@AppScope
@Component(modules = [(AppModule::class)])
interface AppComponent {

    fun context(): Context

}