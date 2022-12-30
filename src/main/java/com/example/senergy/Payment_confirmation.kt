package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.activity_dynamic.btn_back
import kotlinx.android.synthetic.main.activity_dynamic.btn_home
import kotlinx.android.synthetic.main.activity_payment_confirmation.*

class Payment_confirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_confirmation)

        btn_back.setOnClickListener {

            val intent = Intent(this, Planner1::class.java) //btn_back 누르면 Planner1로 넘어감
            startActivity(intent)
        }
        btn_home.setOnClickListener {

            val intent = Intent(this, Main::class.java) //btn_back 누르면 Dynamic로 넘어감
            startActivity(intent)
        }
        btn_home2.setOnClickListener {

            val intent = Intent(this, Main::class.java) //btn_back 누르면 Dynamic로 넘어감
            startActivity(intent)
        }

    }
}