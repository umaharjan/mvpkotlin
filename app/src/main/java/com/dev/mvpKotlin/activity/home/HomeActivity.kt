package com.dev.mvpKotlin.activity.home

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dev.mvpKOtlin.activity.home.dagger.HomeModule
import com.dev.mvpKotlin.activity.home.dagger.DaggerHomeComponent

import com.dev.mvpKotlin.activity.home.mvp.HomePresenter
import com.dev.mvpKotlin.activity.home.mvp.HomeView

import com.dev.mvpKotlin.app.MVPKotlinApplication

import javax.inject.Inject


class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var homeView: HomeView
    @Inject
    lateinit var homePresenter: HomePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mvpKotlinApplication = MVPKotlinApplication()
        DaggerHomeComponent.builder()
                .appComponent(mvpKotlinApplication.get(this).appComponent)
                .homeModule(HomeModule(this))
                .build()
                .inject(this)
        setContentView(homeView)
        homePresenter.onCreateView()
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, HomeActivity::class.java))
        }
    }

}