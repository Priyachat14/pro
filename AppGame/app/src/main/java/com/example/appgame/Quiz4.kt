package com.example.appgame

object Quiz4 {

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que61 = Quiz(61,"Where is here?",
            R.drawable.n61,
            "โรงแรม",
            "โรงเรียน",
            "หมู่บ้าน",
            "บริษัท",
            2
        )
        questionsList.add(que61)

        val que62 = Quiz(62,"Where is here?",
            R.drawable.n62,
            "Kyo Room",
            "Yuki Room",
            "Kazuma Room",
            "Isolation Room",
            4
        )
        questionsList.add(que62)

        val que63 = Quiz(63,"Where is here?",
            R.drawable.n63,
            "Tohru's House",
            "Kyo's House",
            "Yuki's House",
            "Shigure's House",
            4
        )
        questionsList.add(que63)

        val que64 = Quiz(64,"Where is here?",
            R.drawable.n64,
            "Yudo's House",
            "Tekuando's House",
            "Karate's House",
            "Dojo's House",
            4
        )
        questionsList.add(que64)

        val que65 = Quiz(65,"Where is here?",
            R.drawable.n65,
            "Honda's House",
            "Sohma's House",
            "Kuragi's House",
            "Hanajima's House",
            2
        )
        questionsList.add(que65)

        val que66 = Quiz(66,"Where is here?",
            R.drawable.n66,
            "บ้านอากิโตะ",
            "บ้านชิงูเระ",
            "บ้านพักตากอากาศ",
            "บ้านกระท่อม",
            4
        )
        questionsList.add(que66)

        val que67 = Quiz(67,"Where is here?",
            R.drawable.n67,
            "ห้องนั่งเล่นของบ้านกระท่อม",
            "ห้องนั่งเล่นของบ้านชิงูเระ",
            "ห้องนั่งเล่นของที่ทำงานอายาเมะ",
            "ห้องนั่งเล่นของบ้านพักตากอากาศ",
            1
        )
        questionsList.add(que67)

        val que68 = Quiz(68,"Where is here?",
            R.drawable.n68,
            "ห้องนั่งเล่นของบ้านโทรุ",
            "ห้องนั่งเล่นของบ้านชิงูเระ",
            "ห้องนั่งเล่นของที่ทำงานอายาเมะ",
            "ห้องนั่งเล่นของบ้านกระท่อม",
            2
        )
        questionsList.add(que68)

        val que69 = Quiz(69,"Where is here?",
            R.drawable.n69,
            "ที่ทำงานของพ่อโมมิจิ",
            "ที่ทำงานของโมมิจิ",
            "ที่ทำงานของโทรุ",
            "ที่ทำงานของแม่โมมิจิ",
            1
        )
        questionsList.add(que69)

        val que70 = Quiz(70,"Where are they?",
            R.drawable.n70,
            "ดาดฟ้าของบ้านชิงูเระ",
            "ดาดฟ้าของที่ทำงานพ่อโมมิจิ",
            "ดาดฟ้าของโรงเรียน",
            "ดาดฟ้าของบ้านพักตากอากาศ",
            3
        )
        questionsList.add(que70)

        val que71 = Quiz(71,"Where is here?",
            R.drawable.n71,
            "Momiji's Room",
            "Shigure's Room",
            "Tohru's Room",
            "Hatori's Room",
            4
        )
        questionsList.add(que71)

        val que72 = Quiz(72,"Where is here?",
            R.drawable.n72,
            "Ayame's Room",
            "Kyo's Room",
            "Shigure's Room",
            "Yuki's Room",
            2
        )
        questionsList.add(que72)

        val que73 = Quiz(73,"Where is here?",
            R.drawable.n73,
            "ห้องเรียน",
            "ห้องคณะกรรมการ",
            "ห้องชมรม",
            "ห้องเก็บของ",
            1
        )
        questionsList.add(que73)

        val que74 = Quiz(74,"Where is here?",
            R.drawable.n74,
            "ดาดฟ้าของโรงเรียน",
            "ดาดฟ้าของบ้านชิงูเระ",
            "ดาดฟ้าของบ้านกระท่อม",
            "ดาดฟ้าของบ้านพักตากอากาศ",
            2
        )
        questionsList.add(que74)

        val que75 = Quiz(75,"Where is here?",
            R.drawable.n75,
            "สนามกีฬาโรงเรียน",
            "สนามเด็กเล่น",
            "ห้องเรียนของโมมิจิ",
            "สวนสาธารณะ",
            1
        )
        questionsList.add(que75)

        val que76 = Quiz(76,"Where is here?",
            R.drawable.n76,
            "Yuki's Room",
            "Akito's Room",
            "Hatori's Room",
            "Kureno's Room",
            2
        )
        questionsList.add(que76)

        val que77 = Quiz(77,"Where is here?",
            R.drawable.n77,
            "โรงแรม",
            "ห้องเช่า",
            "รีสอร์ท",
            "คอนโด",
            2
        )
        questionsList.add(que77)

        val que78 = Quiz(78,"Where is here?",
            R.drawable.n78,
            "Yuki's Room",
            "Tohru's Room",
            "Kyo's Room",
            "Shigure's Room",
            4
        )
        questionsList.add(que78)

        val que79 = Quiz(79,"Where is here?",
            R.drawable.n79,
            "Tohru's Room",
            "Yuki's Room",
            "Isuzu's Room",
            "Kyo's Room",
            1
        )
        questionsList.add(que79)

        val que80 = Quiz(80,"Where is here?",
            R.drawable.n80,
            "Ayame's Room",
            "Isuzu's Room",
            "Hatsuharu's Room",
            "Kagura's Room",
            3
        )
        questionsList.add(que80)

        return questionsList
    }

}