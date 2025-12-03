package com.trios2025dej.androidapp2.data

import com.trios2025dej.androidapp2.data.model.MenuItem

object CartManager {
    private val cartItems = mutableListOf<MenuItem>()

    fun addItem(item: MenuItem) {
        cartItems.add(item)
    }

    fun getItems(): List<MenuItem> = cartItems

    fun clearCart() {
        cartItems.clear()
    }
}
