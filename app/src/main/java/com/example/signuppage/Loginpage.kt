package com.example.signuppage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginpage)


        val button = findViewById<Button>(R.id.btnLoginGoogle)
        button.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)
        }

        val link = findViewById<TextView>(R.id.tvSignUp)
        link.setOnClickListener{
            val intent = Intent(applicationContext, SignUp::class.java)
            startActivity(intent)
        }


        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val etName = findViewById<EditText>(R.id.etName)
        btnLogin.setOnClickListener {
            val name = etName.text.toString()
            val intent = Intent(applicationContext, Profile::class.java)
            intent.putExtra("name_key", name)
            startActivity(intent)
        }

    }
}