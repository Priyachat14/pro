package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_mode.*

class mode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mode)

        btn_cm.setOnClickListener {
            startActivity(Intent(this,Tokyo1::class.java))
        }
        btn_lm.setOnClickListener {
            startActivity(Intent(this,tokyo2::class.java))
        }

        btn_gb.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }
    }
}