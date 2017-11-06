package com.test.snake.androidkotlinexample.day7

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_3_1 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_1)

        // Activity를 실행한다.
        val intent = Intent(this, Activity_3_1_second::class.java)
        startActivity(intent)

        // 지금 activity를 종료한다.
        finish()
    }

    /*
    미션 1: 버튼을 만들고 버튼 클릭 시, Activity_3_1_second를 화면에 띄운다.
    xml에 버튼을 하나 만들고
    버튼의 setOnClickListener 함수를 사용하여
    16, 20줄 내용을 코딩한다.

    */

}
