package com.example.appgame

object Quiz6 {
    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que101 = Quiz(101,"Where is here?",
            R.drawable.n101,
            "Gen's House",
            "Chika's House",
            "Shizune's House",
            "Hozuki's House",
            3
        )
        questionsList.add(que101)

        val que102 = Quiz(102,"Where is here?",
            R.drawable.n102,
            "ทางเดินในสวนสาธารณะ",
            "ทางเดินในโรงเรียน",
            "ทางเดินในมหาลัย",
            "ทางเดินฟุตบาท",
            2
        )
        questionsList.add(que102)

        val que103 = Quiz(103,"Where is here?",
            R.drawable.n103,
            "ห้องเก็บของ",
            "ห้องชมรมโคโตะ",
            "ห้องนอน",
            "ห้องพักอาจารย์",
            2
        )
        questionsList.add(que103)

        val que104 = Quiz(104,"Where is here?",
            R.drawable.n104,
            "หน้าห้องชมรมโคโตะ",
            "หน้าห้องเรียน",
            "หน้าห้องเก็บของ",
            "หน้าห้องนอน",
            1
        )
        questionsList.add(que104)

        val que105 = Quiz(105,"Where is here?",
            R.drawable.n105,
            "หน้าบ้านตระกูลโฮซุกิ",
            "หน้าบ้านจิกะ",
            "หน้าบ้านโฮซุกิ",
            "หน้าบ้านแม่โฮซุกิ",
            3
        )
        questionsList.add(que105)

        val que106 = Quiz(106,"Where is here?",
            R.drawable.n106,
            "บ้านโดจิม่า",
            "บ้านจิกะ",
            "บ้านแม่โฮซุกิ",
            "บ้านโฮซุกิ",
            4
        )
        questionsList.add(que106)

        val que107 = Quiz(107,"Where is here?",
            R.drawable.n107,
            "ห้องชิซูเนะ",
            "ห้องลุงเก็น",
            "ห้องอิซากิ",
            "ห้องจิกะ",
            3
        )
        questionsList.add(que107)

        val que108 = Quiz(108,"Where is here?",
            R.drawable.n108,
            "ห้องนอนจิกะ",
            "ห้องนอนอิซากิ",
            "ที่นอนจิกะ",
            "ที่นอนอิซากิ",
            1
        )
        questionsList.add(que108)

        val que109 = Quiz(109,"Where is here?",
            R.drawable.n109,
            "โรงเรียนโทคิเสะ",
            "โรงเรียนเมเรียว",
            "โรงเรียนฮาคุโตะ",
            "โรงเรียนหญิงล้วนฮิเมะซากะ",
            4
        )
        questionsList.add(que109)

        val que110 = Quiz(110,"Where are they?",
            R.drawable.n110,
            "ห้องหลังเวที",
            "ทางเดินเชื่อมตึก",
            "Hall",
            "ทางเดินhall",
            3
        )
        questionsList.add(que110)

        val que111 = Quiz(111,"Where is here?",
            R.drawable.n111,
            "ห้องชมรมโคโตะ",
            "ห้องซ้อมหลังเวที",
            "ห้องเก็บเสียง",
            "ห้องเก็บเครื่องดนตรีโคโตะ",
            2
        )
        questionsList.add(que111)

        val que112 = Quiz(112,"Where is here?",
            R.drawable.n112,
            "ห้องพยาบาลในห้าง",
            "ห้องพยาบาลในโรงเรียน",
            "ห้องพยาบาลในตึกแข่งขัน",
            "ห้องพยาบาลในสวนสนุก",
            3
        )
        questionsList.add(que112)

        val que113 = Quiz(113,"Where is here?",
            R.drawable.n113,
            "ห้องเรียนรุ่นพี่ทาเคโซ",
            "ห้องเรียนมาชิโระ",
            "ห้องเรียนจิกะ",
            "ห้องเรียนโคตะ",
            1
        )
        questionsList.add(que113)

        val que114 = Quiz(114,"Where is here?",
            R.drawable.n114,
            "ดาดฟ้าคอนโด",
            "ดาดฟ้าโรงแรม",
            "ดาดฟ้าของบ้าน",
            "ดาดฟ้าโรงเรียน",
            4
        )
        questionsList.add(que114)

        val que115 = Quiz(115,"Where is here?",
            R.drawable.n115,
            "เวทีกลางแจ้ง",
            "เวทีในสวนสาธารณะ",
            "เวทีแข่งขัน",
            "เวทีโรงเรียน",
            3
        )
        questionsList.add(que115)

        val que116 = Quiz(116,"Where is here?",
            R.drawable.n116,
            "เวทีโรงเรียน",
            "เวทีกลางแจ้ง",
            "เวทีแข่งขัน",
            "เวทีในสวนสาธารณะ",
            1
        )
        questionsList.add(que116)

        val que117 = Quiz(117,"Where is here?",
            R.drawable.n117,
            "ห้องลุงเก็น",
            "ห้องทาคาโอกะ",
            "ห้องอิซากิ",
            "ห้องจิกะ",
            2
        )
        questionsList.add(que117)

        val que118 = Quiz(118,"Where is here?",
            R.drawable.n118,
            "Shizune's House",
            "Chika's House",
            "Gen's House",
            "Isaki's House",
            3
        )
        questionsList.add(que118)

        val que119 = Quiz(119,"Where is here?",
            R.drawable.n119,
            "Shizune's House",
            "Hozuki's House",
            "Gen's House",
            "Chika's House",
            1
        )
        questionsList.add(que119)

        val que120 = Quiz(120,"Where is here?",
            R.drawable.n120,
            "ร้านโอโคโนมิยากิ",
            "ภัตราคาร",
            "ร้านปิ้งย่าง",
            "ร้านมอนจา",
            4
        )
        questionsList.add(que120)

        return questionsList
    }

}