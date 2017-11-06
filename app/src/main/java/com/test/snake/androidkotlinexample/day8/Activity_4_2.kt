package com.test.snake.androidkotlinexample.day8

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_4_2.*

class Activity_4_2 : AppCompatActivity() {

    // 네비게이션 메뉴를 눌렀을 때, 실행되는 클래스
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        // 눌러진 메뉴아이템이....
        when (item.itemId) {

            // navigation_home라면
            R.id.navigation_home -> {
                // R.drawable.crazy로 이미지를 지정
                img.setImageResource(R.drawable.crazy)
                return@OnNavigationItemSelectedListener true
            }

            // navigation_dashboard라면
            R.id.navigation_dashboard -> {
                // R.drawable.bhistory로 이미지를 지정
                img.setImageResource(R.drawable.bhistory)
                return@OnNavigationItemSelectedListener true
            }

            // navigation_notifications라면
            R.id.navigation_notifications -> {
                // R.drawable.buttonshape로 이미지를 지정
                img.setImageResource(R.drawable.buttonshape)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_2)

        // 하단의 네비게이션 메뉴를 눌렀을 때, 이벤트를 처리하도록 등록
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    /*
    미션 1: 메뉴를 5개로 늘린다. 누를 때 마다, 자신이 원하는 이미지를 보이도록 한다.
    힌트 : 하단 메뉴는 navigation.xml에서 고친다. 메뉴에 사용된 이미지는 Vector Asset에서 만든 것
    */
}
