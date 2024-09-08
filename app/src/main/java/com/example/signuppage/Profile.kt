package com.example.signuppage

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)

        val tvDisplayname = findViewById<TextView>(R.id.etName)
        val name = intent.getStringExtra("name_key")
        tvDisplayname.text = name


        val tvDisplayEmail = findViewById<TextView>(R.id.etEmail)
        val Email = intent.getStringExtra("Email_key")
        tvDisplayEmail.text = Email
    }
}
