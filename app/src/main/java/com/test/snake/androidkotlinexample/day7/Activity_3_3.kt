package com.test.snake.androidkotlinexample.day7

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_3_3.*

class Activity_3_3 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_3)

        setUpUI()
    }

    // UI를 설정하는 메소드
    private fun setUpUI() {
        button.setOnClickListener{
            // SMS 보내기
            val uri = Uri.parse("smsto:" + "01011112222")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "여기가 문자!!")
            startActivity(intent)
        }

        button2.setOnClickListener{
            // 인터넷이동
            //val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + 114))
            //startActivity(intent)
            val uri = Uri.parse("http://vintageappmaker.tumblr.com/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        button3.setOnClickListener{
            // 지도이동
            val uri = Uri.parse("geo: 37.5310091, 127.0261659")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        button4.setOnClickListener{
            // 마켓으로 이동하기
            val uri = Uri.parse("market://details?id=com.psw.moringcall")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }

    /*
    미션 1: 자신의 집주소로 지도를 이동시켜보기.
    미션 2: button의 이름을 btn1, btn2, btn3, btn4로 바꾸기.
    힌트: XML에서 똑같이 ID 값을 수정해야 에러가 안남.
    */
}
