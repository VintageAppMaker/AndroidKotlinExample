package com.test.snake.androidkotlinexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.test.snake.androidkotlinexample.day10.Activity_6_1
import com.test.snake.androidkotlinexample.day10.Activity_6_2
import com.test.snake.androidkotlinexample.day10.Activity_6_3
import com.test.snake.androidkotlinexample.day11.Activity_7_1
import com.test.snake.androidkotlinexample.day11.Activity_7_2
import com.test.snake.androidkotlinexample.day2.Activity_design_1
import com.test.snake.androidkotlinexample.day2.Activity_design_2
import com.test.snake.androidkotlinexample.day3_4.Activity_coding_test_kotlin
import com.test.snake.androidkotlinexample.day3_4.Activity_oneSource_kotlin
import com.test.snake.androidkotlinexample.day5.*
import com.test.snake.androidkotlinexample.day6.Activity_2_1
import com.test.snake.androidkotlinexample.day6.Activity_2_2
import com.test.snake.androidkotlinexample.day6.Activity_2_3
import com.test.snake.androidkotlinexample.day7.Activity_3_1
import com.test.snake.androidkotlinexample.day7.Activity_3_2
import com.test.snake.androidkotlinexample.day7.Activity_3_3
import com.test.snake.androidkotlinexample.day7.Activity_3_4
import com.test.snake.androidkotlinexample.day8.Activity_4_1
import com.test.snake.androidkotlinexample.day8.Activity_4_2
import com.test.snake.androidkotlinexample.day8.Activity_4_3
import com.test.snake.androidkotlinexample.day9.Activity_5_1
import com.test.snake.androidkotlinexample.day9.Activity_5_3
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    // 리스트별 설명
    var lst = arrayOf<String>(
            "2일 [1]\n커스텀디자인버튼 예제",   "2일 [2]\n테마입히기",
            "3,4일[1]:\n코틀린 코딩테스트", "3,4일[2]:\n" + "생존필수 코틀린 문법 및 소스(print문 출력)",
            "5일[1]:\nXML없이 화면 만들기", "5일[2]:\njava식 코딩", "5일[3]:\nButton",
            "5일[4]:\nTextView", "5일[5]:\nEditText",
            "6일[1]:\nActivity 속성", "6일[2]:\n덧셈뺄셈", "6일[3]:\nActivity의 생명주기(Logcat)",
            "7일[1]:\n다른 Activity 띄우기", "7일[2]:\nActivity에 값보내기", "7일[3]:\nIntent 몇줄로 괜찮은 기능만들기...",
            "7일[1]:\n계산기 UI",
            "8일[1]:\n평형계산기", "8일[2]:\nTabbed Activity 활용", "8일[3]:\n숫자맞추기 게임",
            "9일[1]:\n서비스 실행(logcat)", "8일[2]:\nScrolling Activity 활용",
            "10일[1]:\nWebView 예제 1", "10일[2]:\nWebView 예제 2", "10일[3]:\nNavigation Drawer Activity 활용",
            "11일[1]:\n카드공유앱", "11일[2]:\n주사위 게임"
    )

    // 리스트에 맞는 Acitivity 배열
    var lstClass = arrayOf(
            Activity_design_1::class.java, Activity_design_2::class.java,
            Activity_coding_test_kotlin::class.java, Activity_oneSource_kotlin::class.java,
            Activity_1_1::class.java, Activity_1_2::class.java,
            Activity_1_3::class.java, Activity_1_4::class.java, Activity_1_5::class.java,
            Activity_2_1::class.java, Activity_2_2::class.java, Activity_2_3::class.java,
            Activity_3_1::class.java, Activity_3_2::class.java, Activity_3_3::class.java,
            Activity_3_4::class.java,
            Activity_4_1::class.java, Activity_4_2::class.java, Activity_4_3::class.java,
            Activity_5_1::class.java, Activity_5_3::class.java,
            Activity_6_1::class.java, Activity_6_2::class.java, Activity_6_3::class.java,
            Activity_7_1::class.java, Activity_7_2::class.java
    )

    var adapter:  ArrayAdapter<*>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListView()
    }

    // ListView에 추가
    fun setListView() {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lst)
        listView.setAdapter(adapter)

        listView.setOnItemClickListener{ parent, view, position, id ->
            startActivity( Intent (this@MainActivity, lstClass[position] ))
        }
    }


}
