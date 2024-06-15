package com.uti.pm_panduan_cabai

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        // Tambahkan kode untuk membuat tombol dan listener klik di sini
        val cvInputData1: CardView = findViewById(R.id.cdview1)
        cvInputData1.setOnClickListener {
            val intent = Intent(this, c_rawitActivity::class.java)
            startActivity(intent)
        }
        // Tambahkan kode untuk membuat tombol dan listener klik di sini
        val cvInputData2: CardView = findViewById(R.id.cdview2)
        cvInputData2.setOnClickListener {
            val intent = Intent(this, c_kritingActivity::class.java)
            startActivity(intent)
        }
        val cvInputData3: CardView = findViewById(R.id.cdview3)
        cvInputData3.setOnClickListener {
            val intent = Intent(this, c_gendotActivity::class.java)
            startActivity(intent)
        }
    }
}