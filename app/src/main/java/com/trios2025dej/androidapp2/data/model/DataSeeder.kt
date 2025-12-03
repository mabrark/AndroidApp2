package com.trios2025dej.androidapp2.data

import com.trios2025dej.androidapp2.R
import com.trios2025dej.androidapp2.data.model.Category
import com.trios2025dej.androidapp2.data.model.MenuItem

object DataSeeder {

    val categories = listOf(
        Category("Coffee", R.drawable.ic_coffee),
        Category("Donuts", R.drawable.ic_donut),
        Category("Breakfast", R.drawable.ic_breakfast),
        Category("Sandwiches", R.drawable.ic_sandwich)
    )

    val menuItems = listOf(
        MenuItem(
            id = 1,
            name = "Original Blend Coffee",
            price = 1.99,
            description = "Freshly brewed premium Tims coffee.",
            imageRes = R.drawable.ic_coffee,
            category = "Coffee"
        ),
        MenuItem(
            id = 2,
            name = "Double Double",
            price = 2.19,
            description = "Coffee with two creams and two sugars.",
            imageRes = R.drawable.ic_coffee,
            category = "Coffee"
        ),
        MenuItem(
            id = 3,
            name = "Chocolate Dip Donut",
            price = 1.49,
            description = "Soft donut dipped in chocolate glaze.",
            imageRes = R.drawable.ic_donut,
            category = "Donuts"
        ),
        MenuItem(
            id = 4,
            name = "Boston Cream",
            price = 1.49,
            description = "Iconic donut with creamy chocolate filling.",
            imageRes = R.drawable.ic_donut,
            category = "Donuts"
        ),
        MenuItem(
            id = 5,
            name = "Bagel BELT",
            price = 5.49,
            description = "Bagel with bacon, egg, lettuce, and tomato.",
            imageRes = R.drawable.ic_breakfast,
            category = "Breakfast"
        ),
        MenuItem(
            id = 6,
            name = "Farmer's Wrap",
            price = 6.19,
            description = "Egg, sausage, hash brown, and cheese wrap.",
            imageRes = R.drawable.ic_breakfast,
            category = "Breakfast"
        ),
        MenuItem(
            id = 7,
            name = "Ham & Cheese Sandwich",
            price = 5.99,
            description = "Classic ham & cheese on your choice of bread.",
            imageRes = R.drawable.ic_sandwich,
            category = "Sandwiches"
        ),
        MenuItem(
            id = 8,
            name = "Turkey Bacon Club",
            price = 6.99,
            description = "Turkey, bacon, lettuce, and tomato on a bun.",
            imageRes = R.drawable.ic_sandwich,
            category = "Sandwiches"
        )
    )

    fun getItemsByCategory(category: String): List<MenuItem> {
        return menuItems.filter { it.category == category }
    }
}


