package com.example.jadwalolahraga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class CekStresStep4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek_stres_step4)

        val kembaliButton: Button = findViewById(R.id.button_kembali)
        kembaliButton.setOnClickListener {
            // Handle the "Kembali" button click
            Toast.makeText(this, "Kembali", Toast.LENGTH_SHORT).show()
        }

        val lihatHasilButton: Button = findViewById(R.id.button_lihat_hasil)
        lihatHasilButton.setOnClickListener {
            // Handle the "Lihat Hasil" button click
            Toast.makeText(this, "Lihat Hasil", Toast.LENGTH_SHORT).show()
        }
    }
}
