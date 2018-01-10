package com.test.snake.androidkotlinexample.day8

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_4_3.*
import java.util.*

class Activity_4_3 : AppCompatActivity() {

    // 전역적으로 숨긴번호를 선언한다.
    // 클래스에서는 멤버필드라고 한다.
    var 숨긴번호 : Int = 0;

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4_3)

        // 1. 랜덤 숫자만들기
        // 구글링: java 랜덤함수
        val rnd  = Random()
        숨긴번호 = rnd.nextInt(100)

        // 2. 버튼이 눌려졌을 때!!
        btnGuess.setOnClickListener {
            // EditText의 값을 가져와 저장하기
            var 입력값 = edtNumber.text.toString()

            if (입력값.toInt() > 숨긴번호) {
                txtResult.setText("숫자가 큽니다.")

            } else if (입력값.toInt() < 숨긴번호) {
                txtResult.setText("숫자가 작습니다.")

            } else {
                txtResult.setText("맞추셨습니다 $숨긴번호")
            }
        }
    }
    /*
    미션 1: 0부터 49까지 안의 숫자로 맞춘다.
    미션 2: 10번이하로 맞출기회를 준다. -> 10번이 넘으면 화면을 종료한다(finish())
    힌트 2: 맞추는 횟수를 관리하는
        변수 선언,
        버튼을 누를 때마다 증가,
        10회인지 비교.
        10회가 넘으면 종료

    미션 3: 10번동안 입력된 기록을 TextView에 보여준다.(문자열 붙이기)
*/

}
