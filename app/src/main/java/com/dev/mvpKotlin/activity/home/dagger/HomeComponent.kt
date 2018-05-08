package com.dev.mvpKotlin.activity.home.dagger

import com.dev.mvpKOtlin.activity.home.dagger.HomeModule

import com.dev.mvpKotlin.activity.home.HomeActivity
import com.dev.mvpKotlin.app.dagger.AppComponent
import com.dev.mvpKotlin.app.dagger.modules.AppActivity

import dagger.Component


@AppActivity
@Component(modules = [(HomeModule::class)], dependencies = [(AppComponent::class)])
interface HomeComponent {
    fun inject(homeActivity: HomeActivity)
}