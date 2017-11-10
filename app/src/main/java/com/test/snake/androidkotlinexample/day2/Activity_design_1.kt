package com.test.snake.androidkotlinexample.day2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_design_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_1)
    }

    // 힌트:
    // 좌측 프로젝트 메뉴에서
    // - res/layout/activity_design_1.xml 파일을 더블클릭한다.
    // 또는 위의 소스에서 setContentView(R.layout.activity_design_1)에서
    // activity_design_1를 좌측 ctrl 키를 누르며 마우스를 클릭한다.
    // 그러면 화면을 디자인할 수 있는 에디터로 이동한다
    // 여기에서 하단 [Design]탭을 선택하여 디자인 모드로 설정한다.

    // 미션 1:
    // 첫번째 버튼의 속성인 background에 설정된 배경관련 파일을 조작해본다.
    // http://angrytools.com/android/button/ 에서 디자인한다.

    // 미션 2:
    // 두번째 버튼의 배경색과 글자크기를 조절한다. 원하는 색과 크기로...

    // 미션 3:
    // 세번째는 텍스트이다. 글자색과 정렬(지금은 중앙정렬이다)을 죄측으로 바꾼다.

}
