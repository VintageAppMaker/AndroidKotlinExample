package com.test.snake.androidkotlinexample.day9

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_5_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5_1)


        startService(Intent(this, MainService::class.java))
    }
}
