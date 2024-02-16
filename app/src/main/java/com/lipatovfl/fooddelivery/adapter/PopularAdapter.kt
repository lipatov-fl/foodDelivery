package com.lipatovfl.fooddelivery.adapter

import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.databinding.PopularItemBinding

class PopularAdapter(
    private val items: List<String>,
    private val price: List<String>,
    private val image: List<Int>
) :
    RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(   // Берем разметку, надуваем и создаем класс PopularViewHolder
        parent: ViewGroup,
        viewType: Int
    ): PopularViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.popular_item, parent, false)
        return PopularViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: PopularViewHolder,
        position: Int
    ) { // Заполняем View
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item, price, images)
    }

    override fun getItemCount(): Int = items.size  // Размер

    class PopularViewHolder(item: View) :   // Хранит в себе элементы и заполняем каждый элемент
        RecyclerView.ViewHolder(item) {
        val binding = PopularItemBinding.bind(item)
        fun bind(item: String, price: String, images: Int) = with(binding) {
            menuNamePopular.text = item
            menuPricePopular.text = price
            menuPhotoPopular.setImageResource(images)
        }

    }
}