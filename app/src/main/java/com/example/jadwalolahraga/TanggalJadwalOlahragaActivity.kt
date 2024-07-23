package com.example.jadwalolahraga

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class TanggalJadwalOlahragaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanggal_jadwal_olahraga)

        val submitButton: Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            val tanggalInput: EditText = findViewById(R.id.tanggal_input)
            val jamInput: EditText = findViewById(R.id.jam_input)
            val jenisOlahragaSpinner: Spinner = findViewById(R.id.jenis_olahraga_spinner)
            val durasiSpinner: Spinner = findViewById(R.id.durasi_spinner)

            val tanggal = tanggalInput.text.toString()
            val jam = jamInput.text.toString()
            val jenisOlahraga = jenisOlahragaSpinner.selectedItem.toString()
            val durasi = durasiSpinner.selectedItem.toString()

            Toast.makeText(this, "Jadwal disimpan: $tanggal $jam $jenisOlahraga $durasi", Toast.LENGTH_LONG).show()
        }
    }
}
