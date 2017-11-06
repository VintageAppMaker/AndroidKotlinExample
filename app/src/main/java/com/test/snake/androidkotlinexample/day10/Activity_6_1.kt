package com.test.snake.androidkotlinexample.day10

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_6_1.*

class Activity_6_1 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6_1)

        setUpUI()
    }

    private fun setUpUI() {

        // webview client 객체를 넘긴다.
        wbMain.setWebViewClient(WebClient())
        // 브라우저 세팅을 가져온다.
        val set = wbMain.getSettings()
        // 자바스크립트를 실행가능하게
        set.setJavaScriptEnabled(true)
        // 줌인아웃을 불가능하게
        set.setBuiltInZoomControls(false)

        // Zoom 버튼의 보여지기 설정  -> Pinch로 Zoom을 가능하게 할 수도 있음
        // 아래와 같이하면
        // setBuiltInZoomControls(true)
        // set.setDisplayZoomControls(false);

        btnNaver.setOnClickListener{
            // 이동한다.
            wbMain.loadUrl("http://www.naver.com")
        }

        btnGoogle.setOnClickListener {
            // 이동한다.
            wbMain.loadUrl("http://www.google.com")
        }

        btnMyHome.setOnClickListener(View.OnClickListener {
            // 이동한다.
            wbMain.loadUrl("http://blog.naver.com/adsloader")
        })
    }

    // webview에서 필요한 클래스
    internal inner class WebClient : WebViewClient() {
        // URL을 요청했다면...
        override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
            view.loadUrl(url)
            return true
        }
    }

    /*
    미션 1: pinch(손가락으로 줌인아웃) 기능 구현. -> 소스내의 주석처리된 부분 참조
    미션 2: 82번 라인  view.loadUrl(url);을 주석처리.
    */
}

