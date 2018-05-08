package com.dev.mvpKotlin.appUtils

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager


object AppUtils {
    fun hideKeyboard(appCompatActivity: AppCompatActivity){
        val view = appCompatActivity.currentFocus
        val imm = appCompatActivity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun hideKeyboardOnStartUp(appCompatActivity: AppCompatActivity) {
        appCompatActivity.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }

}