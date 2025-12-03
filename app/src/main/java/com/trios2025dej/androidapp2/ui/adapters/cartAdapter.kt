package com.trios2025dej.androidapp2.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.trios2025dej.androidapp2.R
import com.trios2025dej.androidapp2.data.model.MenuItem

class CartAdapter(
    private val cartItems: List<MenuItem>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.imgCartItem)
        val itemName: TextView = itemView.findViewById(R.id.txtCartName)
        val itemPrice: TextView = itemView.findViewById(R.id.txtCartPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cart, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItems[position]

        holder.itemImage.setImageResource(item.image)
        holder.itemName.text = item.name
        holder.itemPrice.text = "$${item.price}"
    }

    override fun getItemCount(): Int = cartItems.size
}
