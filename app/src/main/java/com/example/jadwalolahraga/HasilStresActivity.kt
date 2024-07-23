package com.example.jadwalolahraga

import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HasilStresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_stres)

        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val progressText: TextView = findViewById(R.id.progress_text)
        val selesaiButton: Button = findViewById(R.id.button_selesai)

        // Contoh persentase stres, ini bisa didapat dari intent extras atau kalkulasi lainnya
        val stresPersentase = 80

        progressBar.progress = stresPersentase
        progressText.text = "$stresPersentase%"

        selesaiButton.setOnClickListener {
            // Handle the "Selesai" button click
            finish()
        }
    }
}
