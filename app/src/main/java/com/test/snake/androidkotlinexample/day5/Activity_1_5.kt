package com.test.snake.androidkotlinexample.day5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_1_5.*

class Activity_1_5 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1_5)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/
        editText.setOnFocusChangeListener() {
            v, hasFocus ->
            if (hasFocus) {
                editText.setText("")
            }
        }

    }

    // 미션 1: XML에서 EditText editText를 edt로 바꾸고 코틀린 소스코드도 edt로 고쳐실행하기

    // 미션 2:
    // super.onCreate(savedInstanceState) 다음라인에 setUpUI()라는 함수를 호출한다.
    // 당연히 setUpUI()함수는 새롭게 코딩한다. - 18, 24 라인의 코드를 그대로가져다 사용한다.

    // 힌트: setText()
    // 미션 3:
    // editText에 포커싱이 되면 "입력하세요"라고 보여주기. 19번 라인의 hasFocus를 bGotFocus로 바꾸어서
    // 코딩해보기
}
