package com.test.snake.androidkotlinexample.day3_4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_coding_test_kotlin.*

/**
 * Created by snake on 17. 11. 5.
 */
open class MyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    open fun write( s : String ){
        var sMsg = txtResult.text.toString()
        txtResult.setText( sMsg + s + "\n" )
    }

    open fun write( n : Float ){
        var sMsg = txtResult.text.toString()
        txtResult.setText( sMsg + n.toString() + "\n" )
    }

    open fun write( n : Int ){
        var sMsg = txtResult.text.toString()
        txtResult.setText( sMsg + n.toString() + "\n" )
    }

    open fun write( n : Double ){
        var sMsg = txtResult.text.toString()
        txtResult.setText( sMsg + n.toString() + "\n" )
    }
}