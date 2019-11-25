package com.example.loker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_informasidiri.*


class informasidiri : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasidiri)

        btnDaftar2.setOnClickListener {
           val intent= Intent (this, daftar3::class.java)
            startActivity(intent)

        }

    }


}
