package com.example.signuppage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val btnSignUpGoogle = findViewById<Button>(R.id.btnSignUpGoogle)
        btnSignUpGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)
        }

        val login=findViewById<TextView>(R.id.tvLogin)
        login.setOnClickListener {
            val intent = Intent(applicationContext,Loginpage::class.java)
            startActivity(intent)
        }


        val etName = findViewById<EditText>(R.id.etName)
        btnSignUp.setOnClickListener {
            val name = etName.text.toString()
            val intent = Intent(applicationContext, Profile::class.java)
            intent.putExtra("name_key", name)
        }

        val etEmail = findViewById<EditText>(R.id.etEmail)
        btnSignUp.setOnClickListener {
            val Email = etName.text.toString()
            val intent = Intent(applicationContext, Profile::class.java)
            intent.putExtra("Email_key", Email)
            startActivity(intent)
        }
    }
}
