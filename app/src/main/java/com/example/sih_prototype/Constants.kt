package com.example.sih_prototype

object Constants {

    const val mAns:String=""

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val ques1 = Question(1,
            "Little Interest or pleasure in doing things",
            "Not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques1)
        val ques2 = Question(2,
            "Feeling down, depressed, or hopeless",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques2)
        val ques3 = Question(3,
            " Trouble falling or staying asleep, or sleeping too much",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques3)
        val ques4 = Question(4,
            "Feeling tired or having little energy",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques4)
        val ques5 = Question(5,
            " Poor appetite or overeating" ,
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
        )
        questionList.add(ques5)

        val ques6 = Question(6,
            "Feeling bad about yourself - or that you are a failure or have let yourself or your family down",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques6)
        val ques7 = Question(7,
            "Trouble concentrating on things, such as reading the newspaper or watching television",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
        )
        questionList.add(ques7)
        val ques8 = Question(8,
            "Moving or speaking so slowly that other people could have noticed",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques8)
        val ques9 = Question(9,
            "Thoughts that you would be better off dead, or of hurting yourself",
            "not at all",
            "several days",
            "more than half days",
            "nearly everyday",
            )
        questionList.add(ques9)


        return questionList

    }
}