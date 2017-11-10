package com.test.snake.androidkotlinexample.day2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_design_0 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_design_0)
    }

    // 힌트:
    // 좌측 프로젝트 메뉴에서
    // - res/layout/activity_design_0.xml 파일을 더블클릭한다.
    // 또는 위의 소스에서 setContentView(R.layout.activity_design_0)에서
    // R.layout.activity_design_0를 좌측 ctrl 키를 누르며 마우스를 클릭한다.
    // 그러면 화면을 디자인할 수 있는 에디터로 이동한다
    // 여기에서 하단 [Design]탭을 선택하여 디자인 모드로 설정한다.

    // 미션 1:
    // 좌측 상단의 팔렛트에서 원하는 위젯(화면을 구성하는 단위)을 선택한 후,
    // Drag & Drop으로 중앙에 있는 빈화면을 디자인해본다.

    // 미션 2:
    // App을 실행하면 위치가 이상함. Layout(위젯을 배치하는 밑판)에서 설정을 해주어야 함.
    // 위젯을 선택하고 사방의 꼭지점들을 레이아웃의 사방에 연결해본다.

    // 미션 3:
    // Button을 하나 끌어다놓고 중앙에 위치시킨 후, "Center BUtton"이라고 표시한다.

    // 미션 4:
    // 화면 하단탭의 Text를 누른 후, 화면우측에 있는 preview를 누른다.
    // 그리고 미션 3에서 만들었던 버튼을 Drag & Drop하며 위치를 바꾸어 본다.

}
