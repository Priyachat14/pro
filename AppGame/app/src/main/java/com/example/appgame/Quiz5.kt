package com.example.appgame

object Quiz5 {
    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que81 = Quiz(81,"What is the name of the character?",
            R.drawable.n81,
            "Chiharu Hozuki",
            "Akira Dōjima",
            "Satowa Hozuki",
            "Hiro Kurusu",
            3
        )
        questionsList.add(que81)

        val que82 = Quiz(82,"What is the name of the character?",
            R.drawable.n82,
            "Hiro Kurusu",
            "Satowa Hozuki",
            "Isaki Kudo",
            "Akira Dōjima",
            1
        )
        questionsList.add(que82)

        val que83 = Quiz(83,"What is the name of the character?",
            R.drawable.n83,
            "Akira Dōjima",
            "Satowa Hozuki",
            "Dōjima",
            "Keishi Dōjima",
            1
        )
        questionsList.add(que83)

        val que84 = Quiz(84,"What is the name of the character?",
            R.drawable.n84,
            "Tetsuki Takaoka",
            "Suzuka Takinami",
            "Takezo Kurata",
            "Chika Kudo",
            4
        )
        questionsList.add(que84)

        val que85 = Quiz(85,"What is the name of the character?",
            R.drawable.n85,
            "Tetsuki Takaoka",
            "Chika Kudo",
            "Takezo Kurata",
            "Suzuka Takinami",
            1
        )
        questionsList.add(que85)

        val que86 = Quiz(86,"What is the name of the character?",
            R.drawable.n86,
            "Suzuka Takinami",
            "Kaoru Takinami",
            "Gen Kudo",
            "Keishi Dōjima",
            1
        )
        questionsList.add(que86)

        val que87 = Quiz(87,"What is the name of the character?",
            R.drawable.n87,
            "Mio Kanzaki",
            "Kaoru Takinami",
            "Ousuke Kiryu",
            "Suzuka Takinami",
            2
        )
        questionsList.add(que87)

        val que88 = Quiz(88,"What is the name of the character?",
            R.drawable.n88,
            "Takeru Kurata",
            "Mio Kanzaki",
            "Ousuke Kiryu",
            "Taishin Yamamoto",
            2
        )
        questionsList.add(que88)

        val que89 = Quiz(89,"What is the name of the character?",
            R.drawable.n89,
            "Taishin Yamamoto",
            "Ousuke Kiryu",
            "Saneyasu Adachi",
            "Takeru Kurata",
            3
        )
        questionsList.add(que89)

        val que90 = Quiz(90,"What is the name of the character?",
            R.drawable.n90,
            "Michitaka Sakai",
            "Ousuke Kiryu",
            "Haru Kasugai",
            "Kota Mizuhara",
            1
        )
        questionsList.add(que90)

        val que91 = Quiz(91,"What is the name of the character?",
            R.drawable.n91,
            "Kota Mizuhara",
            "Saneyasu Adachi",
            "Michitaka Sakai",
            "Chika Kudo",
            1
        )
        questionsList.add(que91)

        val que92 = Quiz(92,"What is the name of the character?",
            R.drawable.n92,
            "Yae Masamoto",
            "Shizune Nishina",
            "Wakaba",
            "Uta Suzumori",
            2
        )
        questionsList.add(que92)

        val que93 = Quiz(93,"What is the name of the character?",
            R.drawable.n93,
            "Tsukaji",
            "Takeru Kurata",
            "Tokise High School Principal",
            "Tokise High School Vice Principal",
            3
        )
        questionsList.add(que93)

        val que94 = Quiz(94,"What is the name of the character?",
            R.drawable.n94,
            "Taishin Yamamoto",
            "Tsukaji",
            "Takeru Kurata",
            "Sentaro Miya",
            3
        )
        questionsList.add(que94)

        val que95 = Quiz(95,"What is the name of the character?",
            R.drawable.n95,
            "Taishin Yamamoto",
            "Keishi Dōjima",
            "Gen Kudo",
            "Reiji Hozuki",
            4
        )
        questionsList.add(que95)

        val que96 = Quiz(96,"What is the name of the character?",
            R.drawable.n96,
            "Rui Natsume",
            "Mashiro",
            "Nene Ootori",
            "Minami",
            2
        )
        questionsList.add(que96)

        val que97 = Quiz(97,"What is the name of the character?",
            R.drawable.n97,
            "Yae Masamoto",
            "Kiyoka Amamiya",
            "Uta Suzumori",
            "Tsukasa Yukimori",
            4
        )
        questionsList.add(que97)

        val que98 = Quiz(98,"What is the name of the character?",
            R.drawable.n98,
            "Kiyoka Amamiya",
            "Hozumi Tachibana",
            "Uta Suzumori",
            "Rui Natsume",
            1
        )
        questionsList.add(que98)

        val que99 = Quiz(99,"What is the name of the character?",
            R.drawable.n99,
            "Wakaba",
            "Kou",
            "Hozumi Tachibana",
            "Uta Suzumori",
            4
        )
        questionsList.add(que99)

        val que100 = Quiz(100,"What is the name of the character?",
            R.drawable.n100,
            "Fujimoto",
            "Haru Kasugai",
            "Taishin Yamamoto",
            "Tsukaji",
            3
        )
        questionsList.add(que100)

        return questionsList
    }

}