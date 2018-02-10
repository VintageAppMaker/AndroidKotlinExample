package com.test.snake.androidkotlinexample.day9

import android.app.Service
import android.content.Intent
import android.net.Uri
import android.os.Handler
import android.os.IBinder
import android.os.Message
import android.util.Log

class MainService : Service() {

    override fun onBind(intent: Intent): IBinder? {
        // TODO: Return the communication channel to the service.
        throw UnsupportedOperationException("Not yet implemented")
    }

    // 누군가 startService()를 호출하면 호출되는 서비스에서는 이곳부터 실행됨.
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent != null){
            LogCountInfo()
        }
        return super.onStartCommand(intent, flags, startId)
    }

    // 3초간격으로 handleMessage()를 호출한다.
    internal var handler: Handler? = null
    var nCount = 0
    private fun LogCountInfo() {
        handler = object : Handler() {
            override fun handleMessage(msg: Message) {
                Log.d("ALLTEST", String.format("service count-->%d", nCount++))
                if (nCount == 10) {

                    val url = "https://vintageappmaker.tumblr.com/"
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(intent)

                }

                if (nCount < 100) {
                    handler!!.sendEmptyMessageDelayed(0, 3000)
                }

            }
        }

        handler!!.sendEmptyMessage(0)
    }
    /*
    미션 1: 30초 이후부터  Log.d("ALLTEST", String.format("service count-->%d", nCount++));가 실행되지 않게 한다.
    미션 2: i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);를 주석처리하고 실행.
    */
}
