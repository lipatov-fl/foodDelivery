package com.lipatovfl.fooddelivery.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lipatovfl.fooddelivery.activity.MainActivity
import com.lipatovfl.fooddelivery.databinding.FragmentCongratsBottomSheetBinding

class CongratsBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var congratsBinding: FragmentCongratsBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        congratsBinding = FragmentCongratsBottomSheetBinding.inflate(inflater, container, false)
        congratsBinding.goHomeBtn.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }
        return congratsBinding.root
    }
}