package com.lipatovfl.fooddelivery.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.adapter.MenuAdapter
import com.lipatovfl.fooddelivery.databinding.FragmentCartBinding
import com.lipatovfl.fooddelivery.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var searchBinding: FragmentSearchBinding
    private lateinit var adapter: MenuAdapter
    private val originalMenuFoodName = listOf("Spacy fresh crab", "Fresh crab", "Spacy fresh crab")
    val originalMenuItemPrice = listOf("$35", "$30", "$32")
    val originalMenuImage =
        listOf(R.drawable.photo_menu1, R.drawable.photo_menu2, R.drawable.photo_menu3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        searchBinding = FragmentSearchBinding.inflate(inflater, container, false)
        adapter = MenuAdapter(originalMenuFoodName, originalMenuItemPrice, originalMenuImage)
        return searchBinding.root
    }

    companion object {
    }
}