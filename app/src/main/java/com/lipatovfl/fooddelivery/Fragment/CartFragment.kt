package com.lipatovfl.fooddelivery.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.adapter.CartAdapter
import com.lipatovfl.fooddelivery.databinding.FragmentCartBinding
import com.lipatovfl.fooddelivery.databinding.FragmentHomeBinding

class CartFragment : Fragment() {
    private lateinit var cartBinding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        cartBinding = FragmentCartBinding.inflate(inflater, container, false)
        val cartFoodName = listOf("Spacy fresh crab", "Fresh crab", "Spacy fresh crab")
        val cartItemPrice = listOf("$35", "$30", "$32")
        val cartImage =
            listOf(R.drawable.photo_menu1, R.drawable.photo_menu2, R.drawable.photo_menu3)
        val adapter =
            CartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice), ArrayList(cartImage))
        cartBinding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        cartBinding.cartRecyclerView.adapter = adapter
        return cartBinding.root
    }

    companion object {
    }
}