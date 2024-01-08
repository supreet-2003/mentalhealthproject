package com.example.sih_prototype
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sih_prototype.Result
import com.example.sih_prototype.databinding.DepressionTest2Binding
import com.example.sih_prototype.databinding.ResultBinding

class Result:AppCompatActivity() {
    private lateinit var binding: ResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding= ResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val answer=intent.getIntExtra(Constants.mAns,0)

        if(answer in 1..4){
            binding.score.text="Minimal depression"
        }
        if(answer in 5..9){
            binding.score.text= "Mild depression"
        }
        if(answer in 10 .. 14){
            binding.score.text="Moderately depression"
        }
        if(answer in 15 .. 19){
            binding.score.text="Moderately severe depression"
        }
        if(answer in 20..27){
            binding.score.text="Severe depression"
        }
    }
}