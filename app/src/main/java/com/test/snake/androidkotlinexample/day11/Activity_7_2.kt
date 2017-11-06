package com.test.snake.androidkotlinexample.day11

import android.media.Image
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import com.test.snake.androidkotlinexample.R

import kotlinx.android.synthetic.main.activity_7_2.*
import kotlinx.android.synthetic.main.content_activity_7_2.*
import java.util.*

class Activity_7_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7_2)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->

            val 주사위값 = 주사위를굴려라()

            Snackbar.make(view, "주사위 번호는 $주사위값", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()

            txtResult.setText("$주사위값")
            //txtResult.setText(문자로주사위만들기(주사위값))
            //주사위배경만들기(주사위값)
        }
    }

    fun 주사위를굴려라() : Int {
        // 1. 랜덤 숫자만들기
        // 구글링: java 랜덤함수
        val rnd  = Random()
        val 번호 = rnd.nextInt(6) + 1

        return 번호
    }

    // 버그가 있습니다.
    fun 문자로주사위만들기(num : Int) : String {
        val items = arrayOf<String>("*", "**", "***", "****", "*****", "******")
        return items[num ]
    }

    // txtResult의 이미지배경을 설정한다.
    fun 주사위배경만들기(num : Int) {
        //hint 1: txtResult.setBackgroundResource()
        //hint 2: drawable ID를 기준으로 배열만들기
        //     val Images = intArrayOf(아이디, 아이디, 아이디...)

        // 이곳에 구현하세요 !!!!
    }

    /*
    미션 1: 버그를 잡자!. 28번 줄의 주석을 풀고 문자로주사위만들기()의 버그잡기
    미션 2: 29번 줄의 주석을 풀고 주사위배경만들기() 함수를 구현하기
            이미지는 알아서 6개 지정하기
  */

}
