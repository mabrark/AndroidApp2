package com.trios2025dej.androidapp2.data.model

data class MenuItem(
    val id: Int,
    val name: String,
    val price: Double,
    val description: String,
    val imageRes: Int,
    val category: String
)
