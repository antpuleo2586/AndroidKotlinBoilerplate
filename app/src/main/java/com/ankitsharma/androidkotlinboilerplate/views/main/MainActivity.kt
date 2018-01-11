package com.ankitsharma.androidkotlinboilerplate.views.main

import android.os.Bundle
import android.widget.Toast
import com.ankitsharma.androidkotlinboilerplate.R
import com.ankitsharma.androidkotlinboilerplate.common.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
