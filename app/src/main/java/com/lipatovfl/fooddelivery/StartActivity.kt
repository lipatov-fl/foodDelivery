package com.lipatovfl.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lipatovfl.fooddelivery.databinding.ActivityMainBinding
import com.lipatovfl.fooddelivery.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private lateinit var startBinding : ActivityStartBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        startBinding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(startBinding.root)
        startBinding.btnGoUserLogin.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginUserActivity ::class.java)
            startActivity(intent)
        }
    }
}