package com.trios2025dej.androidapp2.ui.cart

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trios2025dej.androidapp2.R
import com.trios2025dej.androidapp2.data.model.MenuItem
import com.trios2025dej.androidapp2.ui.adapters.CartAdapter

class CartActivity : AppCompatActivity() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var checkoutButton: Button
    private lateinit var titleText: TextView

    private lateinit var cartAdapter: CartAdapter
    private val cartItems = mutableListOf<MenuItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        // Initialize views
        cartRecyclerView = findViewById(R.id.recyclerCart)
        checkoutButton = findViewById(R.id.btnCheckout)
        titleText = findViewById(R.id.txtCartTitle)

        // Receive cart list from MenuActivity
        val receivedList = intent.getSerializableExtra("cartItems") as? ArrayList<MenuItem>
        if (receivedList != null) {
            cartItems.addAll(receivedList)
        }

        // RecyclerView setup
        cartAdapter = CartAdapter(cartItems)
        cartRecyclerView.layoutManager = LinearLayoutManager(this)
        cartRecyclerView.adapter = cartAdapter

        // Checkout functionality
        checkoutButton.setOnClickListener {
            titleText.text = "Order Placed!"
            cartItems.clear()
            cartAdapter.notifyDataSetChanged()
        }
    }
}
