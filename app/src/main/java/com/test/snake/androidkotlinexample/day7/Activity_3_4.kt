package com.test.snake.androidkotlinexample.day7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_3_4.*

class Activity_3_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_4)
    }

    // 버튼이 클릭되었을 때, 호출되는 함수(메소드)
    // XML 프로퍼티에서 onClick에 아래의 메소드를 지정해준다.
    // 함수형은 반드시 fun 이름(v:View) {}로 해야 한다.
    fun OnPress(v: View) {
        val btn = v as Button
        val str = btn.text.toString()

        // XML 프로퍼티의 tag값을 가져온다. getText()
        val sDisplyNumber = txtNumber.getText() as String
        txtNumber.setText(sDisplyNumber + str)
    }
}
