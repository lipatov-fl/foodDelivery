package com.lipatovfl.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.lipatovfl.fooddelivery.databinding.ActivityMainBinding
import com.lipatovfl.fooddelivery.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityStartBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityStartBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.btnGoUserLogin.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginUserActivity :: class.java)
            startActivity(intent)
            finish()
        }

    }
}