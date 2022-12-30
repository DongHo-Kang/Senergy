package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.activity_dynamic.btn_heart_icon
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_dynamic.btn_add_icon as btn_add_icon1
import kotlinx.android.synthetic.main.activity_dynamic.btn_bell_icon as btn_bell_icon1
import kotlinx.android.synthetic.main.activity_dynamic.btn_reminder as btn_reminder1
import kotlinx.android.synthetic.main.activity_dynamic.btn_user_icon as btn_user_icon1
import kotlinx.android.synthetic.main.activity_dynamic.btn_wishlist as btn_wishlist
import kotlinx.android.synthetic.main.activity_main2.btn_chat_icon as btn_chat_icon1

class Dynamic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic)

        btn_skyway_golf.setOnClickListener{

            val intent = Intent(this,Information_skywaygolf::class.java) //btn_skyway_golf 누르면 information_skywaygolf로 넘어감
            startActivity(intent)
        }

        button10.setOnClickListener{

            val intent = Intent(this,Information_skywaygolf::class.java) //button 10 누르면 information_skywaygolf로 넘어감
            startActivity(intent)
        }

        btn_back.setOnClickListener{
            
            val intent = Intent(this,Main::class.java) //뒤로가기 누르면 main2로 넘어감
            startActivity(intent)
        }

        btn_home.setOnClickListener{
            
            val intent = Intent(this,Main::class.java) //홈화면으로 이동
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