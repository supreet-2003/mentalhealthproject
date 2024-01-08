package com.example.sih_prototype

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.ForgotBinding
import com.google.firebase.auth.FirebaseAuth

class Forgot:AppCompatActivity() {
    private lateinit var binding:ForgotBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enter.setOnClickListener{
            var mail=binding.mail.text.toString()
            firebaseAuth.sendPasswordResetEmail(mail)
            Toast.makeText(this,"Password reset link has been sent to you on your respective email",Toast.LENGTH_LONG).show()
        }

    }

}