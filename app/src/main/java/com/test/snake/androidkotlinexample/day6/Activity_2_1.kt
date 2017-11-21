package com.test.snake.androidkotlinexample.day6

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

// 주의: 상속을 Activity에서 했음.!!!
class Activity_2_1 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_1)
    }

    // 미션1: Tittle Bar를 없애기(Activity 상속, setContentView이전에 코딩)
    // 미션2: 전체화면으로 만들기 (Activity 상속, setContentView 이후 코딩)
    // 미션3: 배경을 투명으로 만들기 -> (Activity 상속, XML 수정)
    // 미션4: 화면방향(orientation) 고정하기

}
