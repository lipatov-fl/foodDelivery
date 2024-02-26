package com.lipatovfl.fooddelivery.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.lipatovfl.fooddelivery.R
import com.lipatovfl.fooddelivery.adapter.NotificationAdapter
import com.lipatovfl.fooddelivery.databinding.FragmentNotificationBottomBinding

class NotificationBottomFragment : BottomSheetDialogFragment() {

    private lateinit var notifiBinding: FragmentNotificationBottomBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        notifiBinding = FragmentNotificationBottomBinding.inflate(inflater, container, false)
        val notifications =
            listOf(
                "Your order has been Canceled Successfully",
                "Order has been taken by the driver",
                "Congrats Your Order Placed"
            )
        val notificationImages =
            listOf(R.drawable.n_unsuccess, R.drawable.ic_delivery, R.drawable.n_success)
        val adapter = NotificationAdapter(ArrayList(notifications), ArrayList(notificationImages))
        notifiBinding.notificationRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        notifiBinding.notificationRecyclerView.adapter = adapter
        return notifiBinding.root
    }

}