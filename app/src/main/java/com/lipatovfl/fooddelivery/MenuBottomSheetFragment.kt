package com.lipatovfl.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lipatovfl.fooddelivery.adapter.CartAdapter
import com.lipatovfl.fooddelivery.adapter.MenuAdapter
import com.lipatovfl.fooddelivery.databinding.FragmentCartBinding
import com.lipatovfl.fooddelivery.databinding.FragmentMenuBottomSheetBinding

class MenuBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var menuBinding: FragmentMenuBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        menuBinding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)
        menuBinding.btnBack.setOnClickListener {
            dismiss()
        }
        val menuFoodName = listOf("Spacy fresh crab", "Fresh crab", "Spacy fresh crab")
        val menuItemPrice = listOf("$35", "$30", "$32")
        val menuImage =
            listOf(R.drawable.photo_menu1, R.drawable.photo_menu2, R.drawable.photo_menu3)
        val adapter =
            MenuAdapter(ArrayList(menuFoodName), ArrayList(menuItemPrice), ArrayList(menuImage))
        menuBinding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        menuBinding.menuRecyclerView.adapter = adapter
        return menuBinding.root
    }

    companion object {
    }
}