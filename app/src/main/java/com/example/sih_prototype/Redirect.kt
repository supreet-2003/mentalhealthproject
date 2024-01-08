package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.ActivityMainBinding
import com.example.sih_prototype.databinding.ForgotBinding
import com.example.sih_prototype.databinding.HomeScreenBinding

class Redirect:AppCompatActivity() {
    private lateinit var binding: HomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        binding.community.setOnClickListener {
//            val intent = Intent(this,Redirect::class.java)
//            startActivity(intent)
//        }
        binding.test.setOnClickListener{
            val intent= Intent(this,MentalTest::class.java)
            startActivity(intent)

        }
//        binding.homelogo.setOnClickListener{
//            val intent = Intent(this,Redirect::class.java)
//            startActivity(intent)
//        }
//        binding.therapy.setOnClickListener {
//            val intent = Intent(this,Redirect::class.java)
//            startActivity(intent)
//        }
//
//        binding.chatbot.setOnClickListener {
//            val intent = Intent(this,Redirect::class.java)
//            startActivity(intent)
//        }
//        binding.games.setOnClickListener {
//            val intent = Intent(this,Redirect::class.java)
//            startActivity(intent)
//        }



    }

}