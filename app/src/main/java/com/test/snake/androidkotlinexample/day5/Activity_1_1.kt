package com.test.snake.androidkotlinexample.day5

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class Activity_1_1 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_1_1)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/

        // 코드로 화면을 그리는 노가다 예제
        // 레아아웃을 생성 및 오리엔테이션 및 색상지정

        // LinearLayout형 변수를 선언
        // 배경을 다크그레이로 설정
        // 방향을 버티컬(세로)로 지정
        val ln: LinearLayout
        ln = LinearLayout(this)
        ln.setBackgroundColor(Color.DKGRAY)
        ln.orientation = LinearLayout.VERTICAL

        // TextView와 Button을 생성
        val txtTest = TextView(this)
        txtTest.text = "코딩으로 만든 텍스트 "
        txtTest.setTextColor(Color.WHITE)

        val btn = Button(this)
        btn.text = "코딩으로 만든 버튼 "

        // 텍스트를 붙인다.
        ln.addView(txtTest)

        // 버튼을 붙인다.
        ln.addView(btn)

        // 만든 화면을 Activity에 붙인다.
        setContentView(ln)
        //setContentView(R.layout.activity_main);
    }

    // 힌트: setContentVIew()는 화면을 구성하는 View만 넘겨주면된다.
    // 미션 1:
    // Activity 화면에 Button(btn)만 보이게 하기
    // 미션 2:
    // Activity 화면에 TextView(txtTest)의 색상을 red로 바꾸어보기
    // 미션 3:
    // super.onCreate(savedInstanceState) 다음 라인에 setUpUI()라는 함수를 호출한다.
    // 당연히 setUpUI()함수는 새롭게 코딩한다. - 27, 47 라인의 코드를 그대로가져다 사용한다.

}
