package com.trios2025dej.androidapp2

object CartManager {

    private val _items = mutableListOf<CartItem>()
    val items: List<CartItem> get() = _items

    fun addToCart(menuItem: MenuItem) {
        val existing = _items.find { it.menuItem.id == menuItem.id }
        if (existing != null) {
            existing.quantity++
        } else {
            _items.add(CartItem(menuItem, 1))
        }
    }

    fun increaseQuantity(menuItemId: Int) {
        val existing = _items.find { it.menuItem.id == menuItemId }
        if (existing != null) {
            existing.quantity++
        }
    }

    fun decreaseQuantity(menuItemId: Int) {
        val existing = _items.find { it.menuItem.id == menuItemId }
        if (existing != null) {
            existing.quantity--
            if (existing.quantity <= 0) {
                _items.remove(existing)
            }
        }
    }

    fun clearCart() {
        _items.clear()
    }

    fun getTotalPrice(): Double {
        return _items.sumOf { it.totalPrice }
    }

    fun isEmpty(): Boolean = _items.isEmpty()
}
