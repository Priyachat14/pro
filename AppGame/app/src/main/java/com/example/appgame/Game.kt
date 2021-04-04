package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        imageButton1.setOnClickListener {
            startActivity(Intent(this,mode::class.java))
        }

        imageButton2.setOnClickListener {
            startActivity(Intent(this,FruitM::class.java))
        }

        imageButton3.setOnClickListener {
            startActivity(Intent(this,KonoM::class.java))
        }

        Go.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}