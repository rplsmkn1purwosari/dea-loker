package com.example.loker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_1.*


class daftar_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_1)

        btnDaftar1.setOnClickListener {
            val intent = Intent (this,informasidiri::class.java)
            startActivity(intent)
        }
    }


}
