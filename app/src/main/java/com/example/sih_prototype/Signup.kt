package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.ActivityMainBinding
import com.example.sih_prototype.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class Signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.forgot.setOnClickListener {
            val intent = Intent(this, Forgot::class.java)
            startActivity(intent)
        }

        binding.sgnup.setOnClickListener {
            val email = binding.mail.text.toString()
            val phone = binding.phone.text.toString()
            val password = binding.password.text.toString()
            val confirm = binding.cnfpassword.text.toString()

            if (email.isNotEmpty() && phone.isNotEmpty() && password.isNotEmpty() && confirm.isNotEmpty()) {
                if (password == confirm) {
                    firebaseAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener() {
                            if (it.isSuccessful) {
                                val intent = Intent(this, SignInActivity::class.java)
                                startActivity(intent)

                            } else Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                .show()
                        }

                } else {
                    Toast.makeText(this, "Passwords don't match", Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show()
            }


        }

    }

}