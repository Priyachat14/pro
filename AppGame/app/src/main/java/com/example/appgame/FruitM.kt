package com.example.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fruit_m.*
import kotlinx.android.synthetic.main.activity_mode.*
import kotlinx.android.synthetic.main.activity_mode.btn_cm
import kotlinx.android.synthetic.main.activity_mode.btn_gb
import kotlinx.android.synthetic.main.activity_mode.btn_lm

class FruitM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_m)

        btn_c.setOnClickListener {
            startActivity(Intent(this,fruit1::class.java))
        }
        btn_l.setOnClickListener {
            startActivity(Intent(this,fruit2::class.java))
        }

        btn_g.setOnClickListener {
            startActivity(Intent(this,Game::class.java))
        }
    }
}
