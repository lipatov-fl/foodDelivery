package com.lipatovfl.fooddelivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lipatovfl.fooddelivery.databinding.ActivityLoginUserBinding

class LoginUserActivity : AppCompatActivity() {

    private lateinit var loginUserBinding: ActivityLoginUserBinding
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        loginUserBinding = ActivityLoginUserBinding.inflate(layoutInflater)
        setContentView(loginUserBinding.root)

        loginUserBinding.btnSignUpUser.setOnClickListener {
            val intent = Intent(this@LoginUserActivity, SignUpUserActivity ::class.java)
            startActivity(intent)
        }
    }
}