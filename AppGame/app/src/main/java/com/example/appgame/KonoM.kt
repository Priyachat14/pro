package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fruit_m.*
import kotlinx.android.synthetic.main.activity_fruit_m.btn_g
import kotlinx.android.synthetic.main.activity_kono_m.*

class KonoM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kono_m)

        btnc.setOnClickListener {
            startActivity(Intent(this,kono1::class.java))
        }
        btnl.setOnClickListener {
            startActivity(Intent(this,kono2::class.java))
        }

        btng.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }
    }
}