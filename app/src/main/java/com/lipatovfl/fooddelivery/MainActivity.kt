package com.lipatovfl.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.navigation.findNavController
import com.lipatovfl.fooddelivery.databinding.ActivityChooseLocationBinding
import com.lipatovfl.fooddelivery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        var NavController = findNavController(R.id.fragmentContainerView)
        var bottomNav = mainBinding.bNav
    }
}