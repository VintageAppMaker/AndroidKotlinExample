package com.test.snake.androidkotlinexample.day9

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    // 지정된 Intent를 받으면
    // 무덤에서도 일어난다. <- 실행되고 있지 않아도 안드로이드가 바로 살리고 실행시켜버린다는 것임
    // 3~5초내에 모든 기능을 수행해야 한다.
    // 그래서 일반적으로는 이곳에서 startService()로 Service만 호출하고
    // 원하는 기능은 서비스에서 구현한다.
    override fun onReceive(context: Context, intent: Intent) {
        //Toast.makeText(context, "Unlock~~~", Toast.LENGTH_LONG).show()
    }

    /*
   미션 1: 이곳에서 startService()로 MainService를 호출해본다.
   밑의 코드를 구현하고 실행한다.

   context.startService( Intent( context, MainService::class.java) )

   결과는...--;

   */
}
