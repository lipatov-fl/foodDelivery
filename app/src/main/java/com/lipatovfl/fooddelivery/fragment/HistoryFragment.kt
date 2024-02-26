package com.lipatovfl.fooddelivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.adapter.BuyAgainAdapter
import com.lipatovfl.fooddelivery.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private lateinit var historyBinding: FragmentHistoryBinding
    private lateinit var buyAgainAdapter: BuyAgainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        historyBinding = FragmentHistoryBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return historyBinding.root
    }

    private fun setupRecyclerView() {
        val buyAgainFoodName =
            arrayListOf(
                "Herbal Pancake",
                "Fruit Salad",
                "Green Noddle",
                "Herbal Pancake",
                "Fruit Salad"
            )
        val buyAgainFoodPrice = arrayListOf("$5", "$7", "$4", "$9", "$5")
        val buyAgainFoodImage = arrayListOf(
            R.drawable.photo_menu1,
            R.drawable.photo_menu2,
            R.drawable.photo_menu3,
            R.drawable.photo_menu1,
            R.drawable.photo_menu2
        )
        buyAgainAdapter = BuyAgainAdapter(buyAgainFoodName, buyAgainFoodPrice, buyAgainFoodImage)
        historyBinding.buyAgainRecyclerView.adapter = buyAgainAdapter
        historyBinding.buyAgainRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }
}