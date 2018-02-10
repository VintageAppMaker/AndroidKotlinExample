package com.test.snake.androidkotlinexample.day11

import android.Manifest
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import com.test.snake.androidkotlinexample.R
import kotlinx.android.synthetic.main.activity_7_1.*
import java.io.File
import java.io.FileOutputStream
import android.support.v4.app.ActivityCompat
import android.content.pm.PackageManager
import android.os.Build

class Activity_7_1 : AppCompatActivity() {

    // 화면이 생성될 때 실행되는 함수(메소드)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7_1)

        // 퍼미션을 사용자가 눈으로 손으로 확인하게 하는 함수
        // 구글정책임. 구글이 정책으로 만들면 개발자는 무조건해야 함.
        grantExternalStoragePermission()

        // 버튼을 가져오고. click 핸들러를 구현한다.
        btnShare.setOnClickListener{
            // EditText의 화면을 File로 저장하고
            // 저장된 파일을 공유한다.
            val f = SaveImage()
            ShareImage(f)
        }

        // 버튼을 가져오고. click 핸들러를 구현한다.
        btnClear.setOnClickListener{
            // EditText의 배경과 Text를 지운다.
            DeleteTextAndImageFile()
        }

        // 버튼을 가져오고. click 핸들러를 구현한다.
        btnImage.setOnClickListener{
            SelectBackground()
        }

    }


    // 0. 마시멜로우 버전 이후부터는 정책상 반드시 해야 하는 과정
    private fun grantExternalStoragePermission(): Boolean {

        // 마시멜로우 버전 이상...
        if (Build.VERSION.SDK_INT >= 23) {

            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                return true
            } else {
                // 퍼미션이 허락되어있지 않다면 허락을 요청하는 창을 띄운다
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 1)
                return false
            }

        } else {
            return true
        }

    }

    // 2. EditText의 화면을 File로 저장하는 메소드 구현
    fun SaveImage(): File {

        // EditText를 가져와 et에 저장한다.
        val et = editText1

        // Android에서 반드시하라고 하는 규격임. EditText의 이미지를 가져가려면
        // 아래 2개의 메소드를 실행하며 true 값을 넘겨주어야 함.
        et.isDrawingCacheEnabled = true
        et.buildDrawingCache(true)

        // et(EditText)의 메소드인 getDrawingCache()를 호출하고 그 결과값을
        // Bitmap 클래스의 createBitmap()을 호출한다.
        // 결과값은 Bitmap 객체이다.
        val b = Bitmap.createBitmap(et.drawingCache)

        // Bitmap 객체 b를 얻었으므로 bt의 화면메모리를 다시 닫아야 한다.
        // 아래의 코드는 반드시 실행되어야 한다.
        et.isDrawingCacheEnabled = false
        et.buildDrawingCache(false)

        // 경로명을 만든다.
        val file_path = Environment.getExternalStorageDirectory().absolutePath + "/campandroid"

        // 파일객체를 가져오고
        val dir = File(file_path)

        // 경로(파일)이 존재하는가?
        if (!dir.exists())
            dir.mkdirs() // 없다면 새롭게 생성

        // 경로명에 포함된 test.png이라는 이름의 파일을 생성
        val file = File(dir, "test.png")

        // 파일쓰기위한 fOut 객체
        val fOut: FileOutputStream
        try {

            // 객체생성
            fOut = FileOutputStream(file)
            // Bitmap을 압축 png 85%로 ...
            b.compress(Bitmap.CompressFormat.PNG, 85, fOut)
            // 파일쓰기
            fOut.flush()
            // 파일닫기
            fOut.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // 파일을 넘겨준다.
        return file
    }

    // 4. EditText의 배경을 바꾸는 메소드 구현
    fun SelectBackground() {
        val items = arrayOf<CharSequence>("하트", "곰", "천사")
        val Images = intArrayOf(R.drawable.heart, R.drawable.bear, R.drawable.angel)

        // Dialog를 만들어주는 builder를 생성.
    	val builder = AlertDialog.Builder(this)
        // Dialog의 타이틀바 지정
        builder.setTitle("배경설정")
        // item의 값을 넣고 리스트로 보여주며 선택 시, 행동을 지정
    	.setItems(items) { dialog, index ->
            // click이 되었을 경우,
            // EditText를 가져온다.
            val et = editText1
            // 선택된 리스트 번호에 맞는 Images 배열내의 이미지 ID 값을 가져온다.
            // 그리고 setBackgroundResource로 EditText인 et의 배경을 바꾼다.
            et.setBackgroundResource(Images[index])

            // Dialog를 종료한다.
            dialog.dismiss()
        }

        // Dialog 생성 및 show <- 보이기
    	val dialog = builder.create()
        dialog.show()

    }

    //3. 파일을 공유하는 메소드 구현
    fun ShareImage(f: File) {

        // 파일정보를 uri로 만든다.
        val uri = Uri.fromFile(f)

        // "image/*" type으로 지정하고 action은 Intent.ACTION_SEND인 Intent를 만든다.
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "image/*"

        // 추가정보를 저장한다.
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "")
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "")

        // 파일정보를 저장한다.
        intent.putExtra(Intent.EXTRA_STREAM, uri)

        // 저장된 intent 정보로 Activity를 실행한다.
        startActivity(Intent.createChooser(intent, "Share Cover Image"))
    }


    // 5. EditText의 글자와 배경이미지를 지운다.
    fun DeleteTextAndImageFile() {

        // 경로명 설정
        val file_path = Environment.getExternalStorageDirectory().absolutePath + "/campandroid"
        val dir = File(file_path)

        // 경로명 + 파일명
        val file = File(dir, "test.png")

        try {
            // 지우기 <-- Error가 발생할 수 있으므로 try catch안에 코딩해야 한다.
            file.delete()
        } catch (e: Exception) {

        }

        // EditText의 문자를 지운다.
        val et = editText1
        et.setText("")
    }

    /*
    미션 1: 자신이 원하는 이미지로 6개이상 배경으로 만들기
    미션 2: 공유시에 커서를 안보이게 하기
    힌트 2: 구글링 Android EditText Carret hide
   */

}
