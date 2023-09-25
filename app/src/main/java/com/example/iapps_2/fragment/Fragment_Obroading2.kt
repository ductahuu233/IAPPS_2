package com.example.iapps_2.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.iapps_2.activity.SignUpActivity
import com.example.iapps_2.R
import com.example.iapps_2.databinding.FragmentOnbroading2Binding

class Fragment_Obroading2 : Fragment() {
    private lateinit var binding : FragmentOnbroading2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_onbroading2,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBroad2.setOnClickListener {
            val intent = Intent(context, SignUpActivity::class.java)
            startActivity(intent)
        }
        val animation  = AnimationUtils.loadAnimation(context,android.R.anim.fade_in)
        binding.imageView3.startAnimation(animation)
    }


}