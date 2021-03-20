package com.example.myapplication
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "CutPasteId")
    lateinit var score1:TextView
    lateinit var score2:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val p1et = findViewById<EditText>(R.id.p1et)
        val p2et = findViewById<EditText>(R.id.p2et)

        score1 = findViewById<TextView>(R.id.score1)
        score2 = findViewById<TextView>(R.id.score2)
        val player1 = findViewById<TextView>(R.id.player1)
        val player2 = findViewById<TextView>(R.id.player2)

        val button = findViewById<Button>(R.id.button)



        button.setOnClickListener {
            player1.text = p1et.text.toString()
            player2.text = p2et.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("p1",player1.text.toString())
            intent.putExtra("p2",player2.text.toString())
            intent.putExtra("sc1",score1.text.toString())
            intent.putExtra("sc2",score2.text.toString())
            startActivityForResult(intent,1)
            if(p1et.text.isNotEmpty()){
                p1et.isClickable = false
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && resultCode == RESULT_OK) {
            score1.text = data?.getStringExtra("score_1")
            score2.text = data?.getStringExtra("score_2")
        }
    }
}