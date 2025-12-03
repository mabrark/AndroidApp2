package com.trios2025dej.androidapp2.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.trios2025dej.androidapp2.R
import com.trios2025dej.androidapp2.data.model.MenuItem

class MenuAdapter(
    private val menuItems: List<MenuItem>,
    private val onAddToCartClick: (MenuItem) -> Unit
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage: ImageView = itemView.findViewById(R.id.imgMenuItem)
        val itemName: TextView = itemView.findViewById(R.id.txtMenuName)
        val itemPrice: TextView = itemView.findViewById(R.id.txtMenuPrice)
        val addToCartButton: Button = itemView.findViewById(R.id.btnAddToCart)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = menuItems[position]

        holder.itemImage.setImageResource(item.image)
        holder.itemName.text = item.name
        holder.itemPrice.text = "$${item.price}"

        holder.addToCartButton.setOnClickListener {
            onAddToCartClick(item)
        }
    }

    override fun getItemCount(): Int = menuItems.size
}
