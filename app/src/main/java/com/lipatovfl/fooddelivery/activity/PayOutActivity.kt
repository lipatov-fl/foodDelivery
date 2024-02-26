package com.lipatovfl.fooddelivery.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lipatovfl.fooddelivery.databinding.ActivityPayOutBinding
import com.lipatovfl.fooddelivery.fragment.CongratsBottomSheetFragment

class PayOutActivity : AppCompatActivity() {
    private lateinit var payOutBinding: ActivityPayOutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        payOutBinding = ActivityPayOutBinding.inflate(layoutInflater)
        setContentView(payOutBinding.root)
        payOutBinding.placeMyOrderBtn.setOnClickListener {
            val bottomSheetDialog = CongratsBottomSheetFragment()
            bottomSheetDialog.show(supportFragmentManager, "Test")
        }
    }
}