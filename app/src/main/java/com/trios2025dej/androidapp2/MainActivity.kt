package com.trios2025dej.androidapp2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMenu = findViewById<Button>(R.id.btnMenu)
        val btnCart = findViewById<Button>(R.id.btnCart)

        // Navigate to Menu screen
        btnMenu.setOnClickListener {
            val i = Intent(this, MenuActivity::class.java)
            startActivity(i)
        }

        // Navigate to Cart screen
        btnCart.setOnClickListener {
            val i = Intent(this, CartActivity::class.java)
            startActivity(i)
        }
    }
}
