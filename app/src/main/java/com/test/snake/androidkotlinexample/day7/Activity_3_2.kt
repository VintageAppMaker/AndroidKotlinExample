package com.test.snake.androidkotlinexample.day7

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_3_2.*

class Activity_3_2 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_2)

        button.setOnClickListener(){
            val i = Intent(this, Activity_3_2_second::class.java)
            i.putExtra("message", "hi")
            startActivity(i)
        }
    }

    /*
     * 미션 1: "test"라는 이름으로 "테스트"라는 값을 보내고 호출된 Activity에서 setTitle로 보여준다. .
     * 힌트 : Intent의 put, get의 이해
    * */
}
