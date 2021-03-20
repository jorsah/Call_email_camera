package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val name = intent.getStringExtra("name")
        val surname = intent.getStringExtra("surname")
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")

        val call = findViewById<Button>(R.id.callBt)

        call.setOnClickListener {
            call.text = name
        }
    }
}