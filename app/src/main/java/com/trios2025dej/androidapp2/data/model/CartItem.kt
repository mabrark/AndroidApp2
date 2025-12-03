package com.trios2025dej.androidapp2

data class CartItem(
    val menuItem: MenuItem,
    var quantity: Int = 1
) {
    val totalPrice: Double
        get() = menuItem.price * quantity
}
