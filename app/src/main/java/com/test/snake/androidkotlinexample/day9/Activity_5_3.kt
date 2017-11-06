package com.test.snake.androidkotlinexample.day9

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_5_3.*

class Activity_5_3 : AppCompatActivity() {


    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5_3)
        setSupportActionBar(toolbar)

        // 타이틀을 변경
        // XML에서 직접 바꿀수도 있지않을까?.
        toolbar_layout.title = "청첩장입니다. "

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            // 미션 1: 내용을 자신이 원하는 것으로 바꾸고
            //         버튼을 눌렀을 때, "신라호델"이 나오도록 한다.
            // 힌트 1: 구글지도에서 신라호텔 검색 후, 주소창에서 주소를 보다보면 .... 위치정보있음.
            // 미션 2: 버튼이미지와 색상을 바꾸어본다.
            // 미션 3: 청첩장안에 사진을 붙여본다
            // content_activity_5_3에서 ImageView를 추가하고 원하는 사진을 붙여본다.
            //(청첩장에 글과 함께 보통 부부의 사진을 붙이기도 하니까...)
        }
    }
}
