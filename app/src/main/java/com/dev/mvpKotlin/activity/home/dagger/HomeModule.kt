package com.dev.mvpKOtlin.activity.home.dagger

import android.support.v7.app.AppCompatActivity
import com.dev.mvpKotlin.activity.home.mvp.HomeModel
import com.dev.mvpKotlin.activity.home.mvp.HomePresenter
import com.dev.mvpKotlin.activity.home.mvp.HomeView
import com.dev.mvpKotlin.app.dagger.modules.AppActivity
import dagger.Module
import dagger.Provides


@Module
class HomeModule(private val appCompatActivity: AppCompatActivity) {

    @AppActivity
    @Provides
    fun homeView(): HomeView {
        return HomeView(appCompatActivity)
    }

    @AppActivity
    @Provides
    fun homePresenter(homeView: HomeView, homeModel: HomeModel): HomePresenter {
        return HomePresenter(homeView, homeModel)
    }

    @AppActivity
    @Provides
    fun homeModel(): HomeModel {
        return HomeModel(appCompatActivity)
    }

}