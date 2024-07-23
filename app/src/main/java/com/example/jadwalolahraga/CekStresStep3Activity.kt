package com.example.jadwalolahraga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class CekStresStep3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek_stres_step3)

        val kembaliButton: Button = findViewById(R.id.button_kembali)
        kembaliButton.setOnClickListener {
            // Handle the "Kembali" button click
            Toast.makeText(this, "Kembali", Toast.LENGTH_SHORT).show()
        }

        val lanjutButton: Button = findViewById(R.id.button_lanjut)
        lanjutButton.setOnClickListener {
            // Handle the "Lanjut" button click
            Toast.makeText(this, "Lanjut", Toast.LENGTH_SHORT).show()
        }
    }
}
