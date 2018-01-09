package com.test.snake.androidkotlinexample.day7

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_3_2.*

class Activity_3_2 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3_2)

        button.setOnClickListener(){
            val i = Intent(this, Activity_3_2_second::class.java)
            i.putExtra("message", "hi")
            startActivity(i)
        }
    }

    /*
     * 미션 1: "test"라는 이름으로 "테스트"라는 값을 보내고 호출된 Activity에서 setTitle로 보여준다. .
     * 힌트 : Intent의 put, get의 이해
     * 미션 2: 로그인 기능 구현
     *        - Activity에서 ID(EditText), Password(EditText), 확인버튼(Button)을
     *          입력받게 디자인 한다(아마도 설명을 위해 TextView도 필요할 것임).
     *        - 확인버튼을 누르면, 입력받은 값을 보여주는 새로운 Activity를 띄운다.
     *          새로운 Activity에서는 "ID는 XXX Password는 XXX 입니다"를 출력하되
     *          바로 전에 입력된 값을 출력하게 한다.
     *          참고: https://gist.github.com/adsloader/243c5b5b13c580e7f4291dccbfa80da7
    * */
}
