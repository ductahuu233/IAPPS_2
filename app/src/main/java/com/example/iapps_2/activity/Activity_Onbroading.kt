package com.example.iapps_2.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.iapps_2.R
import com.example.iapps_2.adapter.OnboardAdapter
import com.example.iapps_2.animation.DepthPageTransformer
import com.example.iapps_2.databinding.ActivityOnbroadingBinding

class Activity_Onbroading : AppCompatActivity() {
    private lateinit var binding: ActivityOnbroadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onbroading)
        binding = ActivityOnbroadingBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val adapter = OnboardAdapter(supportFragmentManager,lifecycle)
        binding.activityOnbroadingViewPager2.adapter = adapter
        binding.ActiOnboardingCircleIndicator3.setViewPager(binding.activityOnbroadingViewPager2)
        binding.activityOnbroadingViewPager2.setPageTransformer(DepthPageTransformer())
    }

}