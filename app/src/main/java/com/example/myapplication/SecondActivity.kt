package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val p1 = findViewById<TextView>(R.id.player_1)
        val p2 = findViewById<TextView>(R.id.player_2)
        val sc1 = findViewById<TextView>(R.id.score_1)
        val sc2 = findViewById<TextView>(R.id.score_2)

        val b1 = findViewById<Button>(R.id.b1)
        val b2 = findViewById<Button>(R.id.b2)
        val b3 = findViewById<Button>(R.id.b3)
        val b4 = findViewById<Button>(R.id.b4)
        val b5 = findViewById<Button>(R.id.b5)
        val b6 = findViewById<Button>(R.id.b6)
        val b7 = findViewById<Button>(R.id.b7)
        val b8 = findViewById<Button>(R.id.b8)
        val b9 = findViewById<Button>(R.id.b9)

        sc1.text = intent.getStringExtra("sc1")
        sc2.text = intent.getStringExtra("sc2")
        p1.text = intent.getStringExtra("p1")
        p2.text = intent.getStringExtra("p2")

        var click = 0

        val listX = mutableListOf<Int>()
        val listO = mutableListOf<Int>()
        val winList1 = listOf(1,2,3)
        val winList2 = listOf(4,5,6)
        val winList3 = listOf(7,8,9)
        val winList4 = listOf(1,4,7)
        val winList5 = listOf(2,5,8)
        val winList6 = listOf(3,6,9)
        val winList7 = listOf(3,5,7)
        val winList8 = listOf(1,5,9)

        b1.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(1)
                b1.text = "X"
                b1.setTextColor(R.color.red)
            }else{
                listO.add(1)
                b1.text = "O"
                b1.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b1.isClickable = false
        }
        b2.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(2)
                b2.text = "X"
                b2.setTextColor(R.color.red)
            }else{
                listO.add(2)
                b2.text = "O"
                b2.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b2.isClickable = false
        }
        b3.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(3)
                b3.text = "X"
                b3.setTextColor(R.color.red)
            }else{
                listO.add(3)
                b3.text = "O"
                b3.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b3.isClickable = false
        }
        b4.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(4)
                b4.text = "X"
                b4.setTextColor(R.color.red)
            }else{
                listO.add(4)
                b4.text = "O"
                b4.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b4.isClickable = false
        }
        b5.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(5)
                b5.text = "X"
                b5.setTextColor(R.color.red)
            }else{
                listO.add(5)
                b5.text = "O"
                b5.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b5.isClickable = false
        }
        b6.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(6)
                b6.text = "X"
                b6.setTextColor(R.color.red)
            }else{
                listO.add(6)
                b6.text = "O"
                b6.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b6.isClickable = false
        }
        b7.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(7)
                b7.setTextColor(R.color.red)
                b7.text = "X"
            }else{
                listO.add(7)
                b7.text = "O"
                b7.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b7.isClickable = false
        }
        b8.setOnClickListener {
            ++click
            if (click % 2 == 1){
                listX.add(8)
                b8.setTextColor(R.color.red)
                b8.text = "X"
            }else{
                listO.add(8)
                b8.text = "O"
                b8.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b8.isClickable = false
        }
        b9.setOnClickListener {
            ++click
            if (click % 2 == 1) {
                listX.add(9)
                b9.setTextColor(R.color.red)
                b9.text = "X"
            } else {
                listO.add(9)
                b9.text = "O"
                b9.setTextColor(R.color.blue)
            }
            if(listX.containsAll(winList1) || listX.containsAll(winList2) || listX.containsAll(winList3) || listX.containsAll(winList4) ||
                    listX.containsAll(winList5) ||listX.containsAll(winList6) || listX.containsAll(winList7) || listX.containsAll(winList8)){
                sc1.text = "${sc1.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if(listO.containsAll(winList1) || listO.containsAll(winList2) || listO.containsAll(winList3) || listO.containsAll(winList4) ||
                    listO.containsAll(winList5) ||listO.containsAll(winList6) || listO.containsAll(winList7) || listO.containsAll(winList8)){
                sc2.text = "${sc2.text.toString().toInt()+1}"
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            if (click == 9){
                val intent = Intent()
                intent.putExtra("score_1", sc1.text.toString())
                intent.putExtra("score_2", sc2.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }
            b9.isClickable = false
        }
    }
}