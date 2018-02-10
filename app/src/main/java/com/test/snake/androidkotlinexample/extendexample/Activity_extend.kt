package com.test.snake.androidkotlinexample.extendexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_extend.*
import org.json.JSONException
import org.json.JSONObject
import java.util.concurrent.ExecutionException

class Activity_extend : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_extend)

        btnHTTP.setOnClickListener {
            ShowSimpleInfo()
        }
    }

    // 1. https://openweathermap.org/에서 계정등록!
    // 2. API 사용
    // 3. JSON 파싱
    private fun ShowSimpleInfo() {
        // 1. 날씨 웹페이지에 들려 정보를 긁어온다.
        val http = MyHttpRequest(applicationContext)
        // eb8e2c1eaec9fdbb42ca9b3cd43b373f
        val sUrl = "http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metric&appid=eb8e2c1eaec9fdbb42ca9b3cd43b373f"

        try {
            val nResultCode = http.execute(sUrl, "GET").get()
            if (nResultCode == MyHttpRequest.REQUEST_FAIL) return

            // 2. 가져온 문자열(JSON)을 처리한다.
            val sJson = http.string
            val json = JSONObject(sJson)

            val json_weather = json.getJSONArray("weather")
            val json_item = json_weather.getJSONObject(0)

            val sToday = json_item.getString("description")
            val sStatus = json_item.getString("main")

            // 최소, 최대 온도구한다.
            val json_main = json.getJSONObject("main")

            val sMin = json_main.getString("temp_min")
            val sMax = json_main.getString("temp_max")

            Toast.makeText(applicationContext, "$sToday\n최소:$sMin 최대:$sMax", Toast.LENGTH_LONG).show()
            //txtWeather.setText(sToday);

            // 3. 날씨와 비슷한 이미지를 설정한다.
            Toast.makeText(applicationContext, sStatus, Toast.LENGTH_LONG).show()

        } catch (e: InterruptedException) {
            e.printStackTrace()
        } catch (e: ExecutionException) {
            e.printStackTrace()
        } catch (e: JSONException) {
            e.printStackTrace()
        }

    }

    /*
    미션 1: https://openweathermap.org/에서 계정등록! 및 자신의 등록키로 소스바꾸기
    미션 2: 날씨정보에 따라 화면에 이미지 보여주기
  */
}
