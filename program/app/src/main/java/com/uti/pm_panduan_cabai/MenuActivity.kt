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
        val cvInputData: CardView = findViewById(R.id.cdview1)
        cvInputData.setOnClickListener {
            val intent = Intent(this, c_rawitActivity::class.java)
            startActivity(intent)
        }
    }
}