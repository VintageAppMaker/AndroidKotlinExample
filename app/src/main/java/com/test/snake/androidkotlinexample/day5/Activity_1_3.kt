package com.test.snake.androidkotlinexample.day5

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_1_3.*

class Activity_1_3 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_3)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/

        // XML에 지정한 ID가 우리가 알지도 못하는 사이에 변수로 지정되어
        // 메모리에 적제되어버렸다. btnOk는 Button형 변수임.
        btnOk.setOnClickListener(){
            btnOk.setText("Click~~!!")
            btnOk.setTextColor(Color.parseColor("#333333"))
            btnOk.setBackgroundColor(Color.parseColor("#FFFF33"))
        }

        // 미션 1: XML에서 버튼 id를 btnYes로 바꾸고 코틀린 소스코드도 btnYes로 고쳐 실행하기
        // 미션 2:
        // super.onCreate(savedInstanceState) 다음 라인에 setUpUI()라는 함수를 호출한다.
        // 당연히 setUpUI()함수는 새롭게 코딩한다. - 22, 27 라인의 코드를 그대로가져다 사용한다.

    }
}
