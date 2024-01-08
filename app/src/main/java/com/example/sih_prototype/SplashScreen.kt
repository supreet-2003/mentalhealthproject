package com.example.sih_prototype

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import com.example.sih_prototype.databinding.ActivityMainBinding
import com.example.sih_prototype.databinding.ActivitySplashScreenBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SplashScreen:AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Handler(Looper.getMainLooper()).postDelayed(3000){
//            val intent=Intent(this,Redirect:class.java)
//        }
        firebaseAuth= FirebaseAuth.getInstance()
        binding.note.alpha =0f
        binding.note.animate().setDuration(1500).alpha(1f).withEndAction{
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
            val user =firebaseAuth.currentUser
            if (user!=null){
                val intent = Intent(this, Redirect::class.java)
                startActivity(intent)
            }
            else{
                val intent = Intent(this, SignInActivity::class.java)
                startActivity(intent)
            }
//            val intent = Intent(this, Signup::class.java)
//            startActivity(intent)

//            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
//            finish()
        }




    }
}