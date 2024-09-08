package com.example.signuppage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val btnGoogle = findViewById<Button>(R.id.btnGoogle)
        val tvLogIn = findViewById<TextView>(R.id.tvLogIn)

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        btnGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)
        }

        tvLogIn.setOnClickListener {
            val intent = Intent(applicationContext,Loginpage::class.java)
            startActivity(intent)
        }

    }
}
