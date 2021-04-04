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
import kotlinx.android.synthetic.main.activity_kono2.*

class kono2 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kono2)

        mUserName = intent.getStringExtra(Quiz6.USER_NAME)

        mQuestionsList = Quiz6.getQuestion()

        setQuestion()

        tv_option_11.setOnClickListener(this)
        tv_option_22.setOnClickListener(this)
        tv_option_33.setOnClickListener(this)
        tv_option_44.setOnClickListener(this)
        btn_ss.setOnClickListener(this)



    }

    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_ss.text = "FINISH"
        }else{
            btn_ss.text = "SUBMIT and PASS"
        }

        progre.progress = mCurrentPosition
        tv_pro.text = "$mCurrentPosition" + "/" + progre.max

        tv_que.text = question!!.question
        tv_b.setImageResource(question.image)
        tv_option_11.text = question.optionOne
        tv_option_22.text = question.optionTwo
        tv_option_33.text = question.optionThree
        tv_option_44.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        options.add(0,tv_option_11)
        options.add(1,tv_option_22)
        options.add(2,tv_option_33)
        options.add(3,tv_option_44)

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
            R.id.tv_option_11 ->{
                selectedOptionView(tv_option_11,1)
            }
            R.id.tv_option_22 ->{
                selectedOptionView(tv_option_22,2)
            }
            R.id.tv_option_33 ->{
                selectedOptionView(tv_option_33,3)
            }
            R.id.tv_option_44 ->{
                selectedOptionView(tv_option_44,4)
            }
            R.id.btn_ss -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++


                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,Score::class.java)
                        intent.putExtra(Quiz6.USER_NAME,mUserName)
                        intent.putExtra(Quiz6.CORRECT_ANSWERS,mCorrectAnswer)
                        intent.putExtra(Quiz6.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                        btn_ss.text = "SUBMIT and PASS"
                    }else{
                        btn_ss.text = "Go To Next Question"

                    }
                    mSelectedOptionPosition = 0


                }
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int) {
        when (answer) {
            1 -> {
                tv_option_11.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                tv_option_22.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                tv_option_33.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                tv_option_44.background = ContextCompat.getDrawable(
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