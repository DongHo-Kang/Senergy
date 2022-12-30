package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.activity_dynamic.btn_back
import kotlinx.android.synthetic.main.activity_dynamic.btn_home
import kotlinx.android.synthetic.main.activity_reservation.*

class Reservation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reservation)

        btn_back.setOnClickListener {

            val intent = Intent(this, Planner1::class.java) //btn_back 누르면 Planner1로 넘어감
            startActivity(intent)
        }
        btn_home.setOnClickListener {

            val intent = Intent(this, Main::class.java) //btn_back 누르면 Dynamic로 넘어감
            startActivity(intent)
        }

        btn_pay.setOnClickListener{

            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }


    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUI()
        }
    }
    //네비게이션 하단바 없애기
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