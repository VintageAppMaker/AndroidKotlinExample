package com.test.snake.androidkotlinexample.day3_4

import android.os.Bundle
import com.test.snake.androidkotlinexample.R

class Activity_coding_test_kotlin : MyActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coding_test_kotlin)

        /*=======================================*/
        // TO-Do: 여기서부터 우리가 코딩!
        /*=======================================*/

        firstTest()

    }

    // 화면에 0부터 10까지 문자찍는 예제
    private fun firstTest() {
        var nIndx  = 10;
        for(i in (0 ..nIndx)){

            var sName  = "번호는 "
            write("번호는 $i 입니다." )
        }
    }

}
