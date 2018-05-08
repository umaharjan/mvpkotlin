package com.dev.mvpKotlin.activity.home.mvp

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.FrameLayout
import com.dev.mvpKotlin.R


class HomeView (private val  appCompatActivity: AppCompatActivity):FrameLayout(appCompatActivity){

    init {

        View.inflate(appCompatActivity, R.layout.activity_home, this)


    }
}