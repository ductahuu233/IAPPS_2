package com.example.iapps_2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.iapps_2.fragment.Fragment_Obroading1
import com.example.iapps_2.fragment.Fragment_Obroading2

class OnboardAdapter(fragmentManager : FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Fragment_Obroading1()
            else -> Fragment_Obroading2()
        }
    }
}