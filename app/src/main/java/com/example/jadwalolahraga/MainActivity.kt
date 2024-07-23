package com.example.jadwalolahraga

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHome: LinearLayout = findViewById(R.id.nav_home)
        val navMenu: LinearLayout = findViewById(R.id.nav_menu)
        val navPesan: LinearLayout = findViewById(R.id.nav_pesan)
        val navFavorite: LinearLayout = findViewById(R.id.nav_favorite)
        val navProfil: LinearLayout = findViewById(R.id.nav_profil)
        val llCekStress: LinearLayout = findViewById(R.id.ll_cek_stress) // Tambahkan ini

        navHome.setOnClickListener {
            Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
        }

        navMenu.setOnClickListener {
            Toast.makeText(this, "Menu Clicked", Toast.LENGTH_SHORT).show()
        }

        navPesan.setOnClickListener {
            Toast.makeText(this, "Pesan Clicked", Toast.LENGTH_SHORT).show()
        }

        navFavorite.setOnClickListener {
            Toast.makeText(this, "Favorite Clicked", Toast.LENGTH_SHORT).show()
        }

        navProfil.setOnClickListener {
            Toast.makeText(this, "Profil Clicked", Toast.LENGTH_SHORT).show()
        }

        llCekStress.setOnClickListener {
            val intent = Intent(this, CekStresActivity::class.java)
            startActivity(intent)
        }
    }
}
