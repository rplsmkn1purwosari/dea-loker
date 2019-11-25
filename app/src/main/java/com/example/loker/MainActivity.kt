package com.example.loker

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnLogin.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Tolong Masukkan Email dan Password Anda", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
//
//

//            if (email=="admin01@gmail.com" || password == "admin01"){
            val progressDialog = ProgressDialog(
                this,
                R.style.Theme_MaterialComponents_Light_Dialog
            )
//                progressDialog.isIndeterminate = true
//                progressDialog.setMessage("Loading...")
//                progressDialog.show()
//                val intent = Intent (this,Dashboard::class.java)
//                startActivity(intent)
//                finish()
//            }

            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {

                    if (!it.isSuccessful) {
                        return@addOnCompleteListener
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else
                        Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, daftar_1::class.java)
                    startActivity(intent)
                }
                .addOnFailureListener {
                    Log.d("Main", "Failed Login: ${it.message}")
                    Toast.makeText(this, "Email/Password Salah", Toast.LENGTH_SHORT).show()
                    progressDialog.hide()

                }



            }
        daftarLink.setOnClickListener {
            val intent = Intent(this, sign_in::class.java)
            startActivity(intent)
        }
    }
}
