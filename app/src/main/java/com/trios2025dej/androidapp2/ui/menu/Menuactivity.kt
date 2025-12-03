package com.trios2025dej.androidapp2.ui.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast
import com.trios2025dej.androidapp2.R
import com.trios2025dej.androidapp2.data.model.MenuItem
import com.trios2025dej.androidapp2.ui.adapters.MenuAdapter
import com.trios2025dej.androidapp2.data.CartManager
import android.content.Intent
import com.trios2025dej.androidapp2.ui.cart.CartActivity

class MenuActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        recyclerView = findViewById(R.id.recyclerMenu)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Load menu list
        val menuItems = listOf(
            MenuItem("Coffee", 1.99, R.drawable.ic_coffee),
            MenuItem("Donut", 1.49, R.drawable.ic_donut),
            MenuItem("Breakfast Wrap", 3.99, R.drawable.ic_breakfast),
            MenuItem("Sandwich", 4.99, R.drawable.ic_sandwich)
        )

        adapter = MenuAdapter(menuItems) { item ->
            CartManager.addItem(item)
            Toast.makeText(this, "${item.name} added to cart", Toast.LENGTH_SHORT).show()
        }

        recyclerView.adapter = adapter

        // Navigate to cart when “View Cart” button is clicked
        findViewById<android.widget.Button>(R.id.btnViewCart).setOnClickListener {
            startActivity(Intent(this, CartActivity::class.java))
        }
    }
}



