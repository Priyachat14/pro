package com.example.appgame

object Quiz2 {

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que21 = Quiz(21,"Where is here?",
                R.drawable.n21,
                "ตึกอาคารในโตเกียว",
                "ใจกลางโตเกียว",
                "ตึกร้างในโตเกียว",
                "ชายแดนโตเกียว",
                2
        )
        questionsList.add(que21)

        val que22 = Quiz(22,"Where is here?",
                R.drawable.n22,
                "มหาวิทยาลัย",
                "โรงเรียน",
                "โรงแรม",
                "คอนโด",
                1
        )
        questionsList.add(que22)

        val que23 = Quiz(23,"Where is here?",
                R.drawable.n23,
                "ทางเดิน",
                "ในตรอกซอย",
                "ที่จอดรถ",
                "ห้องเช่า",
                2
        )
        questionsList.add(que23)

        val que24 = Quiz(24,"Where is here?",
                R.drawable.n24,
                "ในตรอกซอย",
                "ซอยมืด",
                "ทางเดิน",
                "ช่องแคบตึก",
                3
        )
        questionsList.add(que24)

        val que25 = Quiz(25,"Where is here?",
                R.drawable.n25,
                "ทางเดินเชื่อมตึก",
                "ฟุตบาทโตเกียว",
                "ในตึก",
                "สวนสาธารณะ",
                1
        )
        questionsList.add(que25)

        val que26 = Quiz(26,"Where is here?",
                R.drawable.n26,
                "Kaneki's Room",
                "Hideyoshi's Room",
                "Uta's Room",
                "Nishio's Room",
                2
        )
        questionsList.add(que26)

        val que27 = Quiz(27,"Where is here?",
                R.drawable.n27,
                "สำนักงานCCG",
                "ห้องประชุมCCG",
                "โถงทางเดินCCG",
                "ห้องเรียนCCG",
                1
        )
        questionsList.add(que27)

        val que28 = Quiz(28,"Where is here?",
                R.drawable.n28,
                "ห้องนอน",
                "ห้องเรียน",
                "ร้านกาแฟ",
                "พิพิธภัณฑ์",
                3
        )
        questionsList.add(que28)

        val que29 = Quiz(29,"Where is here?",
                R.drawable.n29,
                "ในจิตใจ",
                "แปลงดอกไม้",
                "สวนดอกไม้",
                "ทุ่งดอกไม้",
                1
        )
        questionsList.add(que29)

        val que30 = Quiz(30,"Where are they?",
                R.drawable.n30,
                "โถงทางเดินCCG",
                "ลานประลองกลางเวหา",
                "มารีนฟอร์ด",
                "ศูนย์กลางCCG",
                4
        )
        questionsList.add(que30)

        val que31 = Quiz(31,"Where is here?",
                R.drawable.n31,
                "ลานหิมะ",
                "สวนสาธารณะ",
                "เอโดะ",
                "ใจกลางโตเกียว",
                2
        )
        questionsList.add(que31)

        val que32 = Quiz(32,"Where is here?",
                R.drawable.n32,
                "ตึกอาคาร",
                "ตึกร้าง",
                "ห้องร้าง",
                "บ้าน",
                2
        )
        questionsList.add(que32)

        val que33 = Quiz(33,"Where is here?",
                R.drawable.n33,
                "โตเกียว",
                "เกียวโต",
                "โซล",
                "ดาดฟ้า",
                4
        )
        questionsList.add(que33)

        val que34 = Quiz(34,"Where is here?",
                R.drawable.n34,
                "ห้องโถงใหญ่",
                "ห้องสมุด",
                "ศูนย์หนังสือใหญ่",
                "ห้าง",
                2
        )
        questionsList.add(que34)

        val que35 = Quiz(35,"Where is here?",
                R.drawable.n35,
                "รถไฟชินคันเซ็น",
                "เหมืองรถไฟ",
                "ห้าแยกลาดพร้าว",
                "สถานีรถไฟ",
                4
        )
        questionsList.add(que35)

        val que36 = Quiz(36,"Where is here?",
                R.drawable.n36,
                "ทางเท้าโตเกียว",
                "สวนสาธารณะ",
                "หน้าตึกCCG",
                "หน้ามหาวิทยาลัย",
                3
        )
        questionsList.add(que36)

        val que37 = Quiz(37,"Where is here?",
                R.drawable.n37,
                "เช็งเม้ง",
                "ดาวแซนดร้า",
                "สุสาน",
                "สุสานคนเป็น",
                3
        )
        questionsList.add(que37)

        val que38 = Quiz(38,"Where is here?",
                R.drawable.n38,
                "บ้าน",
                "บริษัท",
                "CCG",
                "คฤหาสน์วงคำเหลา",
                1
        )
        questionsList.add(que38)

        val que39 = Quiz(39,"Where is here?",
                R.drawable.n39,
                "คุก",
                "ห้องทรมาน",
                "ห้องขังCCG",
                "หลุมดำ",
                3
        )
        questionsList.add(que39)

        val que40 = Quiz(40,"Where is here?",
                R.drawable.n40,
                "สวนดอกไม้โอรัน",
                "สวนกุหลาบ",
                "โบสถ์",
                "วังกุหลาบ",
                2
        )
        questionsList.add(que40)

        return questionsList
    }

}
