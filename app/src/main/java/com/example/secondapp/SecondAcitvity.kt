package com.example.secondapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondAcitvity : AppCompatActivity() {

    lateinit var text_email : TextView
    lateinit var text_password : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second_acitvity)

        text_email = findViewById(R.id.text_email)
        text_password = findViewById(R.id.text_password)

        val email = intent.getStringExtra("Email")
        val password = intent.getStringExtra("Password")

        text_email.text = "Email : "+email
        text_password.text = "Password : "+password

    }
}