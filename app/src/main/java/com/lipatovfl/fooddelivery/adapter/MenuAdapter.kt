package com.lipatovfl.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.databinding.MenuItemBinding

class MenuAdapter(
    private val menuItemsName: List<String>,
    private val menuItemPrice: List<String>,
    private val menuImages: List<Int>
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.menu_item, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = menuItemsName.size

    inner class MenuViewHolder(item: View) :
        RecyclerView.ViewHolder(item) {
        private val binding = MenuItemBinding.bind(item)

        fun bind(position: Int) = with(binding) {
            menuFoodName.text = menuItemsName[position]
            menuPrice.text = menuItemPrice[position]
            menuImage.setImageResource(menuImages[position])
        }
    }
}