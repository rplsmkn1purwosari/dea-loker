package com.example.loker

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_in.*

class sign_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btnSignIn.setOnClickListener {
            val email = textInputEmail.text.toString()
            val password = textInputPassword.text.toString()
            val namadepan = namaDepan.text.toString()
            val namabelakang = namaBelakang.text.toString()
            val nisn = NISN.text.toString()


            Log.d("SignIn", "Email is " + email)
            Log.d("SignIn", "Password:$password")

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val progressDialog = ProgressDialog(
                this,
                R.style.Theme_MaterialComponents_Light_Dialog
            )
            progressDialog.isIndeterminate = true
            progressDialog.setMessage("Authenticating...")
            progressDialog.show()
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    if (!it.isSuccessful) {
                        return@addOnCompleteListener
                        val intent = Intent(this, sign_in::class.java)
                        startActivity(intent)
                    } else
                        Log.d("Main", "Succesfully created user with uid: ${it.result!!.user.uid}")
                    Toast.makeText(this, "Succesfully Create an Account", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()

                }
                .addOnFailureListener {
                    Log.d("Main", "Failed to create Account: ${it.message}")
                    Toast.makeText(this, "Email/Password incorrect", Toast.LENGTH_SHORT).show()
                }
        }
    }
}
