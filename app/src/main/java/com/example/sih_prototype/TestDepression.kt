package com.example.sih_prototype

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.sih_prototype.Result
import com.example.sih_prototype.databinding.DepressionTest2Binding
import java.lang.reflect.Type

class TestDepression:AppCompatActivity() {
    private lateinit var binding:DepressionTest2Binding


    private var mCurrentPosition:Int=1
    private var mQuestionsList: ArrayList<Question>?=null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAns:Int=0
    override fun onCreate(savedInstanceState: Bundle?,) {
        super.onCreate(savedInstanceState)

        binding=DepressionTest2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionsList = Constants.getQuestions()
        setQuestion()
        binding.optionOne.setOnClickListener {
            selectedOptionsView(binding.optionOne,1)
        }
        binding.optionTwo.setOnClickListener {
            selectedOptionsView(binding.optionTwo,2)
        }
        binding.optionThree.setOnClickListener {
            selectedOptionsView(binding.optionThree,3)
        }
        binding.optionFour.setOnClickListener {
            selectedOptionsView(binding.optionFour,4)
        }
        binding.btnsubmit.setOnClickListener {
            if(mSelectedOptionPosition==0){
                mCurrentPosition++
                when{
                    mCurrentPosition<= mQuestionsList!!.size+1 ->{
                        setQuestion()
                    }
                }
            }

            else{
                val question= mQuestionsList?.get(mCurrentPosition-1)
                val option=mSelectedOptionPosition-1
                if(option==1){
                    mCorrectAns++
                }
                if(option==2){
                    mCorrectAns+=2}
                if(option==3){
                    mCorrectAns+=3}

//                else{
//                    when (mSelectedOptionPosition) {
//                    1 -> {
//                        mCorrectAns++
//                    }
//                    2 -> {
//                        mCorrectAns+=2
//                    }
//                    3 -> {
//                        mCorrectAns+=3
//                    }
//                }
//
//                }

                if(mCurrentPosition==mQuestionsList!!.size){

                    var intent=Intent(this,Result::class.java)
                    intent.putExtra(Constants.mAns,mCorrectAns)
                    startActivity(intent)
                }
                else {
                    binding.btnsubmit.text= "GO TO NEXT QUESTION"
                }
                mSelectedOptionPosition=0

            }
        }


    }

    private fun setQuestion(){

         mQuestionsList = Constants.getQuestions()
        val question = mQuestionsList!![mCurrentPosition-1]
        defaultOptionsView()
//        if(mCurrentPosition==mQuestionsList!!.size){
//            binding.btnsubmit.text= "FINISH"
//            var intent=Intent(this,Result::class.java)
//            startActivity(intent)
//        }
//        else {
//            binding.btnsubmit.text= "SUBMIT"
//        }

        binding.question.text=question!!.question
        binding.optionOne.text=question.optionOne
        binding.optionTwo.text=question.optionTwo
        binding.optionThree.text=question.optionThree
        binding.optionFour.text=question.optionFour

    }
    private fun defaultOptionsView(){
        val options= ArrayList<TextView>()
        options.add(0,binding.optionOne)
        options.add(1,binding.optionTwo)
        options.add(2,binding.optionThree)
        options.add(3,binding.optionFour)

        for(option in options){
            option.setTextColor(Color.parseColor("#6919E1"))
            option.typeface=Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this,R.drawable.radiuss)
        }
    }

    private fun selectedOptionsView(tv:TextView,
                                    selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition=selectedOptionNum
        tv.setTextColor(Color.parseColor("#CD19E1"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.selected_option_border)

    }



}