package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signup.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
        binding.login.setOnClickListener {
            val password = binding.password.text.toString()
            val email = binding.email.text.toString()

            if (password.isNotEmpty() && email.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener()
                    {
                        if (it.isSuccessful) {
                            val intent = Intent(this, Redirect::class.java)
                            startActivity(intent)

                        }
                        else Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }

            }
            else {Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show()
    }

}
}

}