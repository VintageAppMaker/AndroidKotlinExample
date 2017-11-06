package com.test.snake.androidkotlinexample.day7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_3_2_second : AppCompatActivity() {

    // 화면이 처음 생성될 떄 호출되는 메소드(함수)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_2_second)
    }

    // 화면이 핸드폰에서 보일 떄 호출되는 메소드(함수)
    override fun onStart() {
        super.onStart()

        // 값이 없으면 리턴
        val i = intent ?: return

        val sMessage = i.getStringExtra("message")
        // 화면의 타이틀바에 값을 지정한다.
        title = sMessage
    }

    /*
     * 미션 2: onStart에서 이전 Activity에서 보낸 값과
     *         함께  "를 받았습니다"를 같이 붙여서 title에 출력하게 한다.
     * 힌트 : Intent의 put, get의 이해
    * */
}
