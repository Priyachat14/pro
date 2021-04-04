package com.example.appgame

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_fruit2.*

class fruit2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_fruit2)

            mUserName = intent.getStringExtra(Quiz4.USER_NAME)

            mQuestionsList = Quiz4.getQuestion()

            setQuestion()

            tv_option_1.setOnClickListener(this)
            tv_option_2.setOnClickListener(this)
            tv_option_th.setOnClickListener(this)
            tv_option_f.setOnClickListener(this)
            btn_sub.setOnClickListener(this)



        }

        private fun setQuestion(){

            val question = mQuestionsList!![mCurrentPosition-1]

            defaultOptionsView()

            if(mCurrentPosition == mQuestionsList!!.size){
                btn_sub.text = "FINISH"
            }else{
                btn_sub.text = "SUBMIT and PASS"
            }

            progress.progress = mCurrentPosition
            tv_progr.text = "$mCurrentPosition" + "/" + progress.max

            tv_quest.text = question!!.question
            tv_im.setImageResource(question.image)
            tv_option_1.text = question.optionOne
            tv_option_2.text = question.optionTwo
            tv_option_th.text = question.optionThree
            tv_option_f.text = question.optionFour

        }

        private fun defaultOptionsView(){
            val options = java.util.ArrayList<TextView>()
            options.add(0,tv_option_1)
            options.add(1,tv_option_2)
            options.add(2,tv_option_th)
            options.add(3,tv_option_f)

            for (option in options){
                option.setTextColor(Color.parseColor("#7A8089"))
                option.typeface = Typeface.DEFAULT
                option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.dg

                )
            }

        }

        override fun onClick(v: View?) {
            when(v?.id){
                R.id.tv_option_1 ->{
                    selectedOptionView(tv_option_1,1)
                }
                R.id.tv_option_2 ->{
                    selectedOptionView(tv_option_2,2)
                }
                R.id.tv_option_th ->{
                    selectedOptionView(tv_option_th,3)
                }
                R.id.tv_option_f ->{
                    selectedOptionView(tv_option_f,4)
                }
                R.id.btn_sub -> {
                    if(mSelectedOptionPosition == 0){
                        mCurrentPosition++


                        when{
                            mCurrentPosition <= mQuestionsList!!.size ->{
                                setQuestion()
                            }else ->{
                            val intent = Intent(this,Score::class.java)
                            intent.putExtra(Quiz4.USER_NAME,mUserName)
                            intent.putExtra(Quiz4.CORRECT_ANSWERS,mCorrectAnswer)
                            intent.putExtra(Quiz4.TOTAL_QUESTIONS,mQuestionsList!!.size)
                            startActivity(intent)

                            finish()
                        }
                        }
                    }else{

                        val question = mQuestionsList?.get(mCurrentPosition -1)
                        if(question!!.correctAnswer != mSelectedOptionPosition){
                            answerView(mSelectedOptionPosition,R.drawable.bgg)
                        }else{
                            answerView(mSelectedOptionPosition,R.drawable.bgg1)
                            mCorrectAnswer++
                        }

                        if(mCurrentPosition == mQuestionsList!!.size){
                            btn_sub.text = "SUBMIT and PASS"
                        }else{
                            btn_sub.text = "Go To Next Question"

                        }
                        mSelectedOptionPosition = 0


                    }
                }
            }
        }

        private fun answerView(answer:Int,drawableView:Int) {
            when (answer) {
                1 -> {
                    tv_option_1.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                2 ->{
                    tv_option_2.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                3 ->{
                    tv_option_th.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
                4 ->{
                    tv_option_f.background = ContextCompat.getDrawable(
                        this,drawableView
                    )
                }
            }
        }

        private fun selectedOptionView(tv: TextView, selectedOptionNum:Int){
            defaultOptionsView()
            mSelectedOptionPosition = selectedOptionNum

            tv.setTextColor(Color.parseColor("#363A43"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.bg
            )
        }

    }
