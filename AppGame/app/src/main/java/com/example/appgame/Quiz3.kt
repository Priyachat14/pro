package com.example.appgame

object Quiz3 {
    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que41 = Quiz(41,"What is the name of the character?",
            R.drawable.n41,
            "Kureno Sohma",
            "Shigure Sohma",
            "Akito Sohma",
            "Yuki Sohma",
            1
        )
        questionsList.add(que41)

        val que42 = Quiz(42,"What is the name of the character?",
            R.drawable.n42,
            "Kisa Sohma",
            "Tohru Honda",
            "Saki Hanajima",
            "Kimi Toudou",
            3
        )
        questionsList.add(que42)

        val que43 = Quiz(43,"What is the name of the character?",
            R.drawable.n43,
            "Machi Kuragi",
            "Isuzu Sohma",
            "Kyoko Honda",
            "Mine Kuramae",
            4
        )
        questionsList.add(que43)

        val que44 = Quiz(44,"What is the name of the character?",
            R.drawable.n44,
            "Megumi Hanajima",
            "Naohito Sakuragi",
            "Kunimitsu Tomoda",
            "Kakeru Manabe",
            1
        )
        questionsList.add(que44)

        val que45 = Quiz(45,"What is the name of the character?",
            R.drawable.n45,
            "Yuki Sohma",
            "Akito Sohma",
            "Ayame Sohma",
            "Ritsu Sohma",
            2
        )
        questionsList.add(que45)

        val que46 = Quiz(46,"What is the name of the character?",
            R.drawable.n46,
            "Kimi Toudou",
            "Mine Kuramae",
            "Machi Kuragi",
            "Tohru Honda",
            3
        )
        questionsList.add(que46)

        val que47 = Quiz(47,"What is the name of the character?",
            R.drawable.n47,
            "Hatori Sohma",
            "Momiji Sohma",
            "Yuki Sohma",
            "Hatsuharu Sohma",
            4
        )
        questionsList.add(que47)

        val que48 = Quiz(48,"What is the name of the character?",
            R.drawable.n48,
            "Megumi Hanajima",
            "Naohito Sakuragi",
            "Kunimitsu Tomoda",
            "Yuki Sohma",
            2
        )
        questionsList.add(que48)

        val que49 = Quiz(49,"What is the name of the character?",
            R.drawable.n49,
            "Mayuko Shiraki",
            "Mine Kuramae",
            "Tohru Honda",
            "Mitsuru",
            4
        )
        questionsList.add(que49)

        val que50 = Quiz(50,"What is the name of the character?",
            R.drawable.n50,
            "Isuzu Sohma",
            "Tohru Honda",
            "Kagura Sohma",
            "Kyoko Honda",
            2
        )
        questionsList.add(que50)

        val que51 = Quiz(51,"What is the name of the character?",
            R.drawable.n51,
            "Mayuko Shiraki",
            "Isuzu Sohma",
            "Mitsuru",
            "Arisa Uotani",
            1
        )
        questionsList.add(que51)

        val que52 = Quiz(52,"What is the name of the character?",
            R.drawable.n52,
            "Hatsuharu Sohma",
            "Isuzu Sohma",
            "Momiji Sohma",
            "Ritsu Sohma",
            4
        )
        questionsList.add(que52)

        val que53 = Quiz(53,"What is the name of the character?",
            R.drawable.n53,
            "Kisa Sohma",
            "Arisa Uotani",
            "Kimi Toudou",
            "Kagura Sohma",
            2
        )
        questionsList.add(que53)

        val que54 = Quiz(54,"What is the name of the character?",
            R.drawable.n54,
            "Kagura Sohma",
            "Kisa Sohma",
            "Ritsu Sohma",
            "Motoko Minagawa",
            2
        )
        questionsList.add(que54)

        val que55 = Quiz(55,"What is the name of the character?",
            R.drawable.n55,
            "Motoko Minagawa",
            "Arisa Uotani",
            "Kimi Toudou",
            "Tohru Honda",
            1
        )
        questionsList.add(que55)

        val que56 = Quiz(56,"What is the name of the character?",
            R.drawable.n56,
            "Hatori Sohma",
            "Ayame Sohma",
            "Shigure Sohma",
            "Momiji Sohma",
            2
        )
        questionsList.add(que56)

        val que57 = Quiz(57,"What is the name of the character?",
            R.drawable.n57,
            "Hatori Sohma",
            "Kyo Sohma",
            "Yuki Sohma",
            "Hiro Sohma",
            2
        )
        questionsList.add(que57)

        val que58 = Quiz(58,"What is the name of the character?",
            R.drawable.n58,
            "Kyo Sohma",
            "Yuki Sohma",
            "Kazuma Sohma",
            "Momiji Sohma",
            3
        )
        questionsList.add(que58)

        val que59 = Quiz(59,"What is the name of the character?",
            R.drawable.n59,
            "Hiro Sohma",
            "Momiji Sohma",
            "Hatori Sohma",
            "Kureno Sohma",
            3
        )
        questionsList.add(que59)

        val que60 = Quiz(60,"What is the name of the character?",
            R.drawable.n60,
            "Kakeru Manabe",
            "Yuki Sohma",
            "Kunimitsu Tomoda",
            "Naohito Sakuragi",
            1
        )
        questionsList.add(que60)

        return questionsList
    }

}