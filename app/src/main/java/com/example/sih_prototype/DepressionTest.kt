package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.databinding.DepressionTestBinding

class DepressionTest: AppCompatActivity() {
    private lateinit var binding : DepressionTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DepressionTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextbtn.setOnClickListener{
            val intent=Intent(this,TestDepression::class.java)
            startActivity(intent)

        }
    }
}