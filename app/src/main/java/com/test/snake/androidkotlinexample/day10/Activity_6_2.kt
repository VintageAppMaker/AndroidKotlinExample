package com.test.snake.androidkotlinexample.day10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_6_2.*

class Activity_6_2 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6_2)

        setUpUI()
    }

    // 초기실행시 해야할 일
    private fun setUpUI() {
        setWebViewUI()

        // 주소로 이동
        btnGo.setOnClickListener{
            wbMain.loadUrl(edtURL.getText().toString())
        }

        // 바로 앞으로 이동
        btnNext.setOnClickListener{
            wbMain.goForward()
        }

        // 바로 전으로 이동
        btnPrev.setOnClickListener{
            wbMain.goBack()
        }

    }

    private fun setWebViewUI() {

        // 무조건해야 한다. 웹페이지 진행상황을 관리하는 클래스
        wbMain.setWebViewClient(WebClient())

        // 세팅을 가져오고 설정한다.
        val set = wbMain.getSettings()

        // 자바스크립틀을 사용가능하게 하고 zoom을 false한다.
        set.setJavaScriptEnabled(true)
        set.setBuiltInZoomControls(false)

        // 이동한다.
        wbMain.loadUrl("http://vintageappmaker.tumblr.com/")
    }

    private inner class WebClient : WebViewClient() {

        // URL 호출하기 전...
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            prgLoading.setVisibility(View.VISIBLE)
            return super.shouldOverrideUrlLoading(view, url)
        }

        // webpage를 모두 읽었을 때,
        override fun onPageFinished(view: WebView, url: String) {
            prgLoading.setVisibility(View.GONE)
            super.onPageFinished(view, url)
        }
    }

    /*
    미션 1: Activity의 onBackPress를 오버라이드해서 back 버튼을 누를 시, 이전 주소로 이동한다.
    hint: 커서를 Activity 내에 어딘가에 이동 후, ctrl +o를 누르면 오버라이드 함수들이 나옴.
          이곳에서 onBackPress를 입력하면 자동으로 선택가능.
    */
}
