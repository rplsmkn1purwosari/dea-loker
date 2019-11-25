package com.example.loker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar3.*
import kotlinx.android.synthetic.main.activity_informasidiri.*

class daftar3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar3)

        btnSelesai.setOnClickListener {
            val intent= Intent (this, Dashboard::class.java)
            startActivity(intent)

        }

    }
}
