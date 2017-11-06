package com.test.snake.androidkotlinexample.day5

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_1_4.*

class Activity_1_4 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_4)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/
        txtTitle.setOnClickListener(){
            txtTitle.setBackgroundColor(Color.RED)
            txtTitle.setText("동적변경")
            txtTitle.setTextColor(Color.WHITE)
            txtTitle.setTextSize(48f)
        }

        // 미션 1: XML에서 버튼 TextView를 txtTitle로 바꾸고 코틀린 소스코드도 txtDisplay로 고쳐실행하기
        // 미션 2:
        // super.onCreate(savedInstanceState) 다음 라인에 setUpUI()라는 함수를 호출한다.
        // 당연히 setUpUI()함수는 새롭게 코딩한다. - 19, 25 라인의 코드를 그대로가져다 사용한다.

    }
}
