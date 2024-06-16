package com.uti.pm_panduan_cabai

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // EditText untuk username dan password
        val usernameEditText = findViewById<EditText>(R.id.eduser)
        val passwordEditText = findViewById<EditText>(R.id.edpass)

        // Set nilai default untuk username dan password
        usernameEditText.setText("")
        passwordEditText.setText("")

        // Tombol login
        val loginButton = findViewById<Button>(R.id.login)

        // Tambahkan listener klik pada tombol login
        loginButton.setOnClickListener {
            // Dapatkan nilai username dan password dari EditText
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Lakukan validasi pada username dan password
            if (username == "admin" && password == "admin") {
                // Jika username dan password benar, lanjutkan ke aktivitas utama
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {
                // Jika username dan password salah, tampilkan pesan kesalahan
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }