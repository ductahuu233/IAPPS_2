package com.example.iapps_2.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iapps_2.R
import com.example.iapps_2.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imgMotobike.alpha =0f
        binding.imgMotobike.animate().setDuration(2600).alpha(1f).withEndAction {
            val sharedPreferences = getSharedPreferences("member", Context.MODE_PRIVATE)
            val key = sharedPreferences.getBoolean("key",false)

            if (key){
                startActivity(Intent(this,MainActivity::class.java))
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                finish()
            }else{
                startActivity(Intent(this,Activity_Onbroading::class.java))
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
                finish()
            }
        }
    }
}