package com.example.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSports = findViewById<Button>(R.id.btnsports)
        btnSports.setOnClickListener {
            val intent1 = Intent(this, Sports::class.java)
            startActivity(intent1)
        }
        val btnMusic = findViewById<Button>(R.id.btnmusic)
        btnMusic.setOnClickListener {
            val intent = Intent(this, Music::class.java)
            startActivity(intent)
        }
        val btnTheater = findViewById<Button>(R.id.btntheater)
        btnTheater.setOnClickListener {
            val intent = Intent(this, Theater::class.java)
            startActivity(intent)
        }
        val btnArt = findViewById<Button>(R.id.btnart)
        btnArt.setOnClickListener {
            val intent = Intent(this, Art::class.java)
            startActivity(intent)
        }
    }
}