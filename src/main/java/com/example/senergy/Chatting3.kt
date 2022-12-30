package com.example.senergy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_dynamic.*

class Chatting3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting3)

        btn_back.setOnClickListener{

            val intent = Intent(this,Chatting1::class.java) //뒤로가기 누르면 main2로 넘어감
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
        btn_bell_icon.setOnClickListener{

            val intent = Intent(this, Reminder::class.java)
            startActivity(intent)
        }
    }
}
