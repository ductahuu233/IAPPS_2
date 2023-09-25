package com.example.iapps_2.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.iapps_2.R
import com.example.iapps_2.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignupBinding
    private lateinit var firebaseAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnSignUp.setOnClickListener {
            val fullName = binding.edtFullName.toString()
            val email = binding.edtEmail.toString()
            val password = binding.edtPassword.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && fullName.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this){task ->
                        if (task.isSuccessful){
                            Toast.makeText(this, "Sign up successful", Toast.LENGTH_SHORT).show()
                            val i = Intent(this@SignUpActivity,LoginActivity::class.java)
                            startActivity(i)
                        }
                    }
            }else{
                Toast.makeText(this, "Enter fullname,email or password", Toast.LENGTH_SHORT).show()

            }
        }

    }
}