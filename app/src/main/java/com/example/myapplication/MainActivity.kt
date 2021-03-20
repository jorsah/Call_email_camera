package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "CutPasteId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val name = findViewById<EditText>(R.id.nameET)
        val surname = findViewById<EditText>(R.id.surnameET)
        val phone = findViewById<EditText>(R.id.phoneET)
        val email = findViewById<EditText>(R.id.emailET)




        button.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("name",name.text.toString())
            intent.putExtra("surname",surname.text.toString())
            intent.putExtra("phone",phone.text.toString())
            intent.putExtra("email",email.text.toString())
            startActivity(intent)
        }
    }

}