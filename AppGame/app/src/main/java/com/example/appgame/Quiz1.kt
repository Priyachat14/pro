package com.example.appgame

object Quiz1{

    const val USER_NAME:String = "Username"
    const val TOTAL_QUESTIONS:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"


    fun getQuestion():ArrayList<Quiz>{
        val questionsList = java.util.ArrayList<Quiz>()

        val que1 = Quiz(1,"What is the name of the character?",
            R.drawable.n1,
            "Haise Sasaki",
            "Ichika Kaneki",
            "Ken Kaneki",
            "Hideyoshi Nagachika",
            3
        )
        questionsList.add(que1)

        val que2 = Quiz(2,"What is the name of the character?",
            R.drawable.n2,
            "Haise Sasaki",
            "Ken Kaneki",
            "Hideyoshi Nagachika",
            "Ichika Kaneki",
            1
        )
        questionsList.add(que2)

        val que3 = Quiz(3,"What is the name of the character?",
            R.drawable.n3,
            "Ken Kaneki",
            "Rize Kamishiro",
            "Touka Kirishima",
            "Ichika Kaneki",
            4
        )
        questionsList.add(que3)

        val que4 = Quiz(4,"What is the name of the character?",
            R.drawable.n4,
            "Rize Kamishiro",
            "Touka Kirishima",
            "Ichika Kaneki",
            "Eto Yoshimura",
            2
        )
        questionsList.add(que4)

        val que5 = Quiz(5,"What is the name of the character?",
            R.drawable.n5,
            "Mayu",
            "Saiko Yonebayashi",
            "Karren von Rosewald",
            "Rize Kamishiro",
            4
        )
        questionsList.add(que5)

        val que6 = Quiz(6,"What is the name of the character?",
            R.drawable.n6,
            "Karren von Rosewald",
            "Hinami Fueguchi",
            "Ryouko Fueguchi",
            "Kimi Nishio",
            1
        )
        questionsList.add(que6)

        val que7 = Quiz(7,"What is the name of the character?",
            R.drawable.n7,
            "Saiko Yonebayashi",
            "Taguchi",
            "Tooru Mutsuki",
            "Ruisawa",
            4
        )
        questionsList.add(que7)

        val que8 = Quiz(8,"What is the name of the character?",
            R.drawable.n8,
            "Saiko Yonebayashi",
            "Ruisawa",
            "Mayu",
            "Rou",
            1
        )
        questionsList.add(que8)

        val que9 = Quiz(9,"What is the name of the character?",
            R.drawable.n9,
            "Mayu",
            "Rou",
            "Ruisawa",
            "Shio Ihei",
            2
        )
        questionsList.add(que9)

        val que10 = Quiz(10,"What is the name of the character?",
            R.drawable.n10,
            "Mayu",
            "Ruisawa",
            "Shio Ihei",
            "Taguchi",
            3
        )
        questionsList.add(que10)

        val que11 = Quiz(11,"What is the name of the character?",
            R.drawable.n11,
            "Noro",
            "Rikai Souzu",
            "Tatara",
            "Koutarou Amon",
            4
        )
        questionsList.add(que11)

        val que12 = Quiz(12,"What is the name of the character?",
            R.drawable.n12,
            "Shuu Tsukiyama",
            "Ryou",
            "Seidou Takizawa",
            "Noro",
            4
        )
        questionsList.add(que12)

        val que13 = Quiz(13,"What is the name of the character?",
            R.drawable.n13,
            "Tatara",
            "Yakumo Oomori",
            "Ryou",
            "Seidou Takizawa",
            2
        )
        questionsList.add(que13)

        val que14 = Quiz(14,"What is the name of the character?",
            R.drawable.n14,
            "Ryou",
            "Tatara",
            "Seidou Takizawa",
            "Shuu Tsukiyama",
            3
        )
        questionsList.add(que14)

        val que15 = Quiz(15,"What is the name of the character?",
            R.drawable.n15,
            "Shuu Tsukiyama",
            "Tsuneyoshi Washuu",
            "Uta",
            "Sumiharu Katou",
            1
        )
        questionsList.add(que15)

        val que16 = Quiz(16,"What is the name of the character?",
            R.drawable.n16,
            "Uta",
            "Tatara",
            "Kuki Urie",
            "Koori Ui",
            1
        )
        questionsList.add(que16)

        val que17 = Quiz(17,"What is the name of the character?",
            R.drawable.n17,
            "Mayu",
            "Kurona Yasuhisa",
            "Nashiro Yasuhisa",
            "Matsumae",
            2
        )
        questionsList.add(que17)

        val que18 = Quiz(18,"What is the name of the character?",
            R.drawable.n18,
            "Kurona Yasuhisa",
            "Mayu",
            "Nashiro Yasuhisa",
            "Karren von Rosewald",
            3
        )
        questionsList.add(que18)

        val que19 = Quiz(19,"What is the name of the character?",
            R.drawable.n19,
            "Ryou",
            "Tatara",
            "Nutcracker's partner",
            "Renji Yomo",
            2
        )
        questionsList.add(que19)

        val que20 = Quiz(20,"What is the name of the character?",
            R.drawable.n20,
            "Kishou Arima",
            "Ayato Kirishima",
            "Arata Kirishima",
            "Hideyoshi Nagachika",
            4
        )
        questionsList.add(que20)

        return questionsList
    }

}