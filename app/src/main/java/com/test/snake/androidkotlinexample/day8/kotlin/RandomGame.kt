package com.test.snake.androidkotlinexample.day8.kotlin

import java.util.*

/**
 * Created by snake on 17. 11. 6.
 */

// IntelliJ에서 해보기
fun 랜덤게임(){

    //자바의 커맨드창에서 문자열 입력받는 클래스
    val sc = Scanner(System.`in`)

    // 랜덤 숫자만들기
    // 구글링: java 랜덤함수
    val rnd = Random()

    // 0부터 99까지 
    val 숨긴번호 = rnd.nextInt(100)

    var num = -1
    do {
        println("숫자는?")
        num = sc.nextInt()

        if (num > 숨긴번호) {
            println(">>큽니다.")

        } else if (num < 숨긴번호) {
            println(">>적어요.")
        }

    } while (num != 숨긴번호)

    println("정답입니다.")
}

// 미션 1: 몇번째 물어보는 것인지도 출력한다.