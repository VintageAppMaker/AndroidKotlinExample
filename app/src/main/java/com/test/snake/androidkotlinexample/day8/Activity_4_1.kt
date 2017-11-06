package com.test.snake.androidkotlinexample.day8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_4_1.*
import java.util.ArrayList

class Activity_4_1 : AppCompatActivity() {

    // 초기화 영역
    private var button: Button? = null
    private val mNumberList = ArrayList<Int>()

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_1)

        addListenerOnButton()
    }

    fun addListenerOnButton() {

        btnMemory.setOnClickListener{
            calculateNumber()
        }

    }

    // 인터넷 검색에서 찾은 평형계산법
    // 3.305785 제곱미터가 1평임
    private fun calculateNumber() {
        val per = 3.305785
        val sDisplyNumber : String  = txtNumber.text.toString()
        val nNumber: Double
        nNumber = sDisplyNumber.toDouble()
        val nResult = per * nNumber
        ShowMessage(String.format("%,d 제곱미터", Math.round(nResult)))
        txtNumber.setText("")
    }

    fun OnPress(v: View) {
        val btn = v as Button
        val str = btn.text.toString()

        // 미션 1: c이면 문자열을 지우고 나가기
        //        if(str.equals()){
        //
        //        };


        // 미션 2: 숫자단위가 6단위이상 입력 못하게 하기
        //        if(str.???){
        //
        //        };

        // 미션 3: 제곱미터를 평으로 계산하기

        val sDisplyNumber = txtNumber.getText() as String
        txtNumber.setText(sDisplyNumber + str)
    }

    // Message를 출력한다.
    private fun ShowMessage(str: String) {
        Toast.makeText(applicationContext, str, Toast.LENGTH_LONG).show()
    }
}
