package com.test.snake.androidkotlinexample.day6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_2_2.*

class Activity_2_2 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_2)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/

        // + 버튼을 눌렀을 때
        btnPlus.setOnClickListener{
            // 숫자값을 가져오기
            var first   = firstNumber.text.toString()
            var second  = secondNumber.text.toString()

            // 문자열을 숫자로 변형하는 방법은 ?
            // toInt()

            // 덧셈을 해서 값을 가져온다.
            var result = addNumber(first.toInt(), second.toInt())

            // 숫자를 문자열로 바꾸는 방법은?
            // toString()
            // result.toString()

            // 미션 2: 아래코드에서 result의 값이 출력되도록 한다.
            // txtResult에 값을 출력한다.
            txtResult.setText("미션: + 결과")

        }

        // - 버튼을 눌렀을 때
        // 미션 3: + 버튼을 눌렀을 때를 참고삼아
        // - 를 눌렀을 때 처리할 코드를 구현한다.
        btnMinus.setOnClickListener {
            // 숫자값을 가져오기

            // 뺄셈을 해서 값을 가져온다.

            // txtResult에 값을 출력한다.
            txtResult.setText("미션: + 결과")

        }

    }

    // 빼기 함수(메소드)
    private fun subNumber(i: Int, i1: Int) : Int{
        // 미션 1: 뺀 결과값을 리턴한다.
        return 0;
    }

    // 더하기 함수(메소드)
    private fun addNumber(i: Int, i1: Int) : Int{
        // 미션 1: 더한 결과값을 리턴한다.
        return 0;
    }
}
