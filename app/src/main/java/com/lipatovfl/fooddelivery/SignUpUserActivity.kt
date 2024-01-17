package com.lipatovfl.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lipatovfl.fooddelivery.databinding.ActivityLoginUserBinding
import com.lipatovfl.fooddelivery.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {
    private lateinit var signUpUserBinding: ActivitySignUpUserBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        signUpUserBinding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(signUpUserBinding.root)
        signUpUserBinding.btnHaveAcc.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LoginUserActivity::class.java)
            startActivity(intent)
        }
    }
}