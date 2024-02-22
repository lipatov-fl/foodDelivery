package com.lipatovfl.fooddelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lipatovfl.fooddelivery.databinding.FragmentMenuBottomSheetBinding
import com.lipatovfl.fooddelivery.databinding.FragmentNotificationBottomBinding

class NotificationBottomFragment : BottomSheetDialogFragment() {

    private lateinit var notifiBinding: FragmentNotificationBottomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notifiBinding = FragmentNotificationBottomBinding.inflate(inflater, container, false)
        return notifiBinding.root
    }

    companion object {
    }
}