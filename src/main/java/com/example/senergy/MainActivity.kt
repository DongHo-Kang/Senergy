package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View




//메인화면
class MainActivity : AppCompatActivity() {


    //뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        //그릴 xml 뷰 파일을 연결 시켜준다.
        setContentView(R.layout.activity_main)

        btn_sign.setOnClickListener{
            // var: 변수 값이 언제든지 변경 될 수 있다.
            // val: 자바에서는 final 값이 변경되지 못하는 변수.

            val intent = Intent(this,Main::class.java) // 다음화면으로 이동하기 위한 인텐트 객체 생성
            startActivity(intent)
        }



    }
    //네비게이션 하단바 없애기
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUI()
        }
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        val decorView = window.decorView
        decorView.systemUiVisibility =
            (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY // Set the content to appear under the system bars so that the
                    // content doesn't resize when the system bars hide and show.
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN // Hide the nav bar and status bar
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }
}