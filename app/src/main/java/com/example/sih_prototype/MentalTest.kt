package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.MentalHealthTestBinding

class MentalTest:AppCompatActivity() {
    private lateinit var binding: MentalHealthTestBinding

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        binding=MentalHealthTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.depressionTest.setOnClickListener {
            intent=Intent(this,DepressionTest::class.java)
            startActivity(intent)

        }
        binding.adhdTest.setOnClickListener {

        }

        }


    }
