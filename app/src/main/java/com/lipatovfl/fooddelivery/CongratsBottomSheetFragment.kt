package com.lipatovfl.fooddelivery

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lipatovfl.fooddelivery.databinding.ActivityMainBinding
import com.lipatovfl.fooddelivery.databinding.FragmentCartBinding
import com.lipatovfl.fooddelivery.databinding.FragmentCongratsBottomSheetBinding

class CongratsBottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var congratsBinding: FragmentCongratsBottomSheetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        congratsBinding = FragmentCongratsBottomSheetBinding.inflate(inflater, container, false)
        congratsBinding.goHomeBtn.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }
        return congratsBinding.root
    }

    companion object {
    }
}