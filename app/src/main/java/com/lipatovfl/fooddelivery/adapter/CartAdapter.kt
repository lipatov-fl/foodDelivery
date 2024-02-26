package com.lipatovfl.fooddelivery.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.databinding.CartItemBinding

class CartAdapter(
    private val cartItems: MutableList<String>,
    private val cartItemsPrice: MutableList<String>,
    private var cartImages: MutableList<Int>
) :
    RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantities = IntArray(cartItems.size) { 1 }

    inner class CartViewHolder(item: View) :
        RecyclerView.ViewHolder(item) {
        private val binding = CartItemBinding.bind(item)
        fun bind(position: Int) = with(binding) {
            val quantity = itemQuantities[position]
            cartFoodName.text = cartItems[position]
            cartItemPrice.text = cartItemsPrice[position]
            cartImage.setImageResource(cartImages[position])
            cartItemQuantity.text = quantity.toString()

            btnMinus.setOnClickListener {
                deceaseQuantity(position)
            }
            btnPlus.setOnClickListener {
                increaseQuantity(position)
            }
            btnDelete.setOnClickListener {
                val itemPosition = adapterPosition
                if (itemPosition != RecyclerView.NO_POSITION)
                    deleteItem(itemPosition)
            }
        }

        private fun increaseQuantity(position: Int) {
            if (itemQuantities[position] < 10) {
                itemQuantities[position]++
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }

        private fun deceaseQuantity(position: Int) {
            if (itemQuantities[position] > 1) {
                itemQuantities[position]--
                binding.cartItemQuantity.text = itemQuantities[position].toString()
            }
        }

        private fun deleteItem(position: Int) {
            cartItems.removeAt(position)
            cartImages.removeAt(position)
            cartItemsPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, cartItems.size)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size
}