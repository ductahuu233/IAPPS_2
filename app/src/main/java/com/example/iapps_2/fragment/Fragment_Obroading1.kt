package com.example.iapps_2.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.iapps_2.R
import com.example.iapps_2.databinding.FragmentOnbroading1Binding

class Fragment_Obroading1 : Fragment() {
    private lateinit var binding : FragmentOnbroading1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_onbroading1,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBroad1.setOnClickListener {
//            val broad2 = Fragment_Obroading2()
//            val transaction = requireActivity().supportFragmentManager.beginTransaction()
//            transaction.replace(androidx.fragment.R.id.)
        }
        val animation  = AnimationUtils.loadAnimation(context,android.R.anim.fade_in)
        binding.imageView3.startAnimation(animation)
    }


}