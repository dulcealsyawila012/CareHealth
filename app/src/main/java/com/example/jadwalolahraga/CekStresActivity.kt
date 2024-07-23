package com.example.jadwalolahraga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class CekStresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cek_stres)

        val mulaiButton: Button = findViewById(R.id.mulai_button)
        mulaiButton.setOnClickListener {
            Toast.makeText(this, "Mulai Test Stres", Toast.LENGTH_SHORT).show()
        }
    }
}
