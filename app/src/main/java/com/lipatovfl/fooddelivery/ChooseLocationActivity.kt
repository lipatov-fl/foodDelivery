package com.lipatovfl.fooddelivery

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.lipatovfl.fooddelivery.databinding.ActivityChooseLocationBinding
import com.lipatovfl.fooddelivery.databinding.ActivityLoginUserBinding

class ChooseLocationActivity : AppCompatActivity() {
    private lateinit var chooseLocationBinding: ActivityChooseLocationBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        chooseLocationBinding = ActivityChooseLocationBinding.inflate(layoutInflater)
        setContentView(chooseLocationBinding.root)
        val locationList = arrayOf("Moscow", "Saratov", "Voronezh", "Sochi")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = chooseLocationBinding.listOffLocation
        autoCompleteTextView.setAdapter(adapter)
    }
}