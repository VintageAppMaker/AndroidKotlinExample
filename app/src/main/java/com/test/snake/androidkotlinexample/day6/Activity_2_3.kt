package com.test.snake.androidkotlinexample.day6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import android.R.menu
import android.content.Intent
import android.util.Log


class Activity_2_3 : AppCompatActivity() {

    var nLineNumber = 0

    // Activity가 생성될 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_3)

        Log.d("ALLTEST", String.format("\n%d: onCreate", nLineNumber++))
    }

    // 내 activity 맨앞으로 왔을 때
    public override fun onResume() {
        super.onResume()
        Log.d("ALLTEST", String.format("%d: onResume", nLineNumber++))
    }

    // 내 activity 맨앞에 뭔가가 있을 때
    public override fun onStop() {
        super.onStop()
        Log.d("ALLTEST", String.format("%d: onStop", nLineNumber++))
    }

    // Activity가 최초실행될 때
    public override fun onStart() {
        super.onStart()
        Log.d("ALLTEST", String.format("%d: onStart", nLineNumber++))
    }

    // Activity가 완전히 종료될 때
    public override fun onDestroy() {
        super.onDestroy()
        Log.d("ALLTEST", String.format("%d: onDestroy", nLineNumber++))
    }

}

// 미션 1: Activity에 TextView(txtDisplay)를 하나만들고 Log.d에 출력했던 내용을 그곳(txtDisplay)에
// 보이게 한다. 이전 출력내용도 보여주어야 한다.
// 힌트 1:
//      문자열 변수를 만들고
//      메시지를 추가할 떄마다 문자열변수 = 문자열변수 + 새로운메시지 + "\n"
//      txtDisplay.text =  문자열변수 하면된다.

// 미션 2: 문자열이 너무많다. 스크롤되게 하려면 어떻게 해야 하는가?

