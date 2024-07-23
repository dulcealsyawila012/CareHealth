package com.example.jadwalolahraga

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MenuFiturOlahragaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_fitur_olahraga)

        val jadwalButton: Button = findViewById(R.id.tombol_jadwal)
        jadwalButton.setOnClickListener {
            val intent = Intent(this, TanggalJadwalOlahragaActivity::class.java)
            startActivity(intent)
        }
    }
}
