package com.dev.mvpKotlin.app

import android.app.Activity
import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

import com.dev.mvpKotlin.BuildConfig
import com.dev.mvpKotlin.app.dagger.AppComponent
import com.dev.mvpKotlin.app.dagger.DaggerAppComponent
import com.dev.mvpKotlin.app.dagger.modules.AppModule
import com.dev.mvpKotlin.appUtils.AppConstants
import timber.log.Timber


class MVPKotlinApplication: Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
        }
        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {
                override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
                    super.log(priority, AppConstants.LOG_TAG, message, t)
                }
            })
        }
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    fun get(activity: Activity): MVPKotlinApplication {
        return activity.application as MVPKotlinApplication
    }

    fun appComponent(): AppComponent? {
        return appComponent
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

}