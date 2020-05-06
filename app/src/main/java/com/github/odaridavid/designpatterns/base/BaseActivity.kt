package com.github.odaridavid.designpatterns.base

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.odaridavid.designpatterns.R
import com.github.odaridavid.designpatterns.helpers.SdkUtils

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        matchStatusBarWithBackground()
        super.onCreate(savedInstanceState)
    }

    private fun matchStatusBarWithBackground() {
        if (SdkUtils.versionFrom(Build.VERSION_CODES.M)) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = getColor(R.color.colorPrimary)
        }
    }

}