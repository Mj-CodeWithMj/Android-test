package com.example.secondapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txt_email : EditText
    lateinit var txt_password : EditText
    lateinit var btn_login : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        txt_email = findViewById(R.id.txt_email)
        txt_password = findViewById(R.id.txt_password)
        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            startActivity(Intent(this@MainActivity,SecondAcitvity::class.java)
                .putExtra("Email",txt_email.text.toString())
                .putExtra("Password",txt_password.text.toString()))
            finish()
        }

    }
}