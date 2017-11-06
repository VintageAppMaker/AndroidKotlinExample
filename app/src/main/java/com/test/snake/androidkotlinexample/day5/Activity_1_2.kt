package com.test.snake.androidkotlinexample.day5

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.snake.androidkotlinexample.R

// Java 스타일의 가장 기초적인 Activity 코딩법
class Activity_1_2 : AppCompatActivity() {

    // 1. 클래스의 멤버필드로 정의
    var btnOk : Button? = null

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_2)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/

        var btnOk = findViewById<Button>(R.id.btnOk) as Button
        btnOk.setOnClickListener(View.OnClickListener {
            btnOk.setText("Click~~!!")
            btnOk.setTextColor(Color.parseColor("#333333"))
            btnOk.setBackgroundColor(Color.parseColor("#FFFF33"))
        })

        // 힌트: click 했는지 안했는 지 비교하는 변수를 관리하면 됨.
        // 미션 1: 버튼을 처음 누르면 "빨강"으로 텍스트를 보이며 빨강색 처리, 또 한번 누르면
        // 원래색으로 복귀. 그리고 또 누르면 빨강"으로 텍스트를 보이며 빨강색 처리를 반복하게 구현.
        // 미션 2:
        // super.onCreate(savedInstanceState) 다음 라인에 setUpUI()라는 함수를 호출한다.
        // 당연히 setUpUI()함수는 새롭게 코딩한다. - 25, 31 라인의 코드를 그대로가져다 사용한다.
    }
}
