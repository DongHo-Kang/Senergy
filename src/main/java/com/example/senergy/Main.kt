package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btn_sign
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btn_heart_icon
import kotlinx.android.synthetic.main.activity_main2.btn_reminder
import kotlinx.android.synthetic.main.activity_main2.btn_wishlist
import kotlinx.android.synthetic.main.activity_dynamic.btn_chat_icon as btn_chat_icon1
import kotlinx.android.synthetic.main.activity_main2.btn_add_icon as btn_add_icon1
import kotlinx.android.synthetic.main.activity_main2.btn_bell_icon as btn_bell_icon
import kotlinx.android.synthetic.main.activity_main2.btn_user_icon as btn_user_icon1

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn_dynamic.setOnClickListener {
            // var: 변수 값이 언제든지 변경 될 수 있다.
            // val: 자바에서는 final 값이 변경되지 못하는 변수.

            val intent = Intent(this, Dynamic::class.java) // 다음화면으로 이동하기 위한 인텐트 객체 생성
            startActivity(intent)
        }
        btn_add_icon.setOnClickListener{

            val intent = Intent(this, Posting1::class.java)
            startActivity(intent)
        }
        btn_chat_icon.setOnClickListener{

            val intent = Intent(this, Chatting1::class.java)
            startActivity(intent)
        }
        btn_user_icon.setOnClickListener{

            val intent = Intent(this, Myprofile::class.java)
            startActivity(intent)
        }
        btn_heart_icon.setOnClickListener{

            val intent = Intent(this, Wishlist::class.java)
            startActivity(intent)

        }
        btn_wishlist.setOnClickListener{

            val intent = Intent(this, Wishlist::class.java)
            startActivity(intent)

        }

        btn_bell_icon.setOnClickListener{

            val intent = Intent(this, Reminder::class.java)
            startActivity(intent)
        }
        btn_reminder.setOnClickListener{

            val intent = Intent(this, Reminder::class.java)
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