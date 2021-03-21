package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
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
        val email1 = intent.getStringExtra("email")


        val callBt = findViewById<Button>(R.id.callBt)
        val emailBt = findViewById<Button>(R.id.emailBt)
        val cameraBt = findViewById<Button>(R.id.cameraBt)

        callBt.setOnClickListener {
            val intent1 = Intent()
            val uri = Uri.parse("tel:$phone")
            intent1.action = Intent.ACTION_VIEW
            intent1.data = uri
            startActivity(intent1)
        }

        emailBt.setOnClickListener {
            val email = Intent(Intent.ACTION_SEND)
            email.putExtra(Intent.EXTRA_EMAIL, arrayOf(email1))
            email.putExtra(Intent.EXTRA_SUBJECT, "$name $surname")
            email.putExtra(Intent.EXTRA_TEXT,"fdsa")
            email.type = "message/rfc822"
            startActivity(Intent.createChooser(email, "Choose an Email client :"))
        }

        cameraBt.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cameraIntent)
        }
    }
}