package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dynamic.*
import kotlinx.android.synthetic.main.activity_reservation.*

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        btn_pay.setOnClickListener {

            val intent = Intent(this, Payment_confirmation::class.java) //btn_back 누르면 Planner1로 넘어감
            startActivity(intent)
        }

    }
}