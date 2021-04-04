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
import kotlinx.android.synthetic.main.activity_fruit2.btn_sub
import kotlinx.android.synthetic.main.activity_fruit2.tv_option_1
import kotlinx.android.synthetic.main.activity_fruit2.tv_option_2
import kotlinx.android.synthetic.main.activity_fruit2.tv_option_f
import kotlinx.android.synthetic.main.activity_fruit2.tv_option_th
import kotlinx.android.synthetic.main.activity_kono1.*

class kono1 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kono1)

        mUserName = intent.getStringExtra(Quiz5.USER_NAME)

        mQuestionsList = Quiz5.getQuestion()

        setQuestion()

        tv_option_oo.setOnClickListener(this)
        tv_option_tt.setOnClickListener(this)
        tv_option_thh.setOnClickListener(this)
        tv_option_ff.setOnClickListener(this)
        btn_su.setOnClickListener(this)



    }

    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_su.text = "FINISH"
        }else{
            btn_su.text = "SUBMIT and PASS"
        }

        progres.progress = mCurrentPosition
        tv_prog.text = "$mCurrentPosition" + "/" + progres.max

        tv_ques.text = question!!.question
        tv_i.setImageResource(question.image)
        tv_option_oo.text = question.optionOne
        tv_option_tt.text = question.optionTwo
        tv_option_thh.text = question.optionThree
        tv_option_ff.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        options.add(0,tv_option_oo)
        options.add(1,tv_option_tt)
        options.add(2,tv_option_thh)
        options.add(3,tv_option_ff)

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
            R.id.tv_option_oo ->{
                selectedOptionView(tv_option_oo,1)
            }
            R.id.tv_option_tt ->{
                selectedOptionView(tv_option_tt,2)
            }
            R.id.tv_option_thh ->{
                selectedOptionView(tv_option_thh,3)
            }
            R.id.tv_option_ff ->{
                selectedOptionView(tv_option_ff,4)
            }
            R.id.btn_su -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++


                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,Score::class.java)
                        intent.putExtra(Quiz5.USER_NAME,mUserName)
                        intent.putExtra(Quiz5.CORRECT_ANSWERS,mCorrectAnswer)
                        intent.putExtra(Quiz5.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                        btn_su.text = "SUBMIT and PASS"
                    }else{
                        btn_su.text = "Go To Next Question"

                    }
                    mSelectedOptionPosition = 0


                }
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int) {
        when (answer) {
            1 -> {
                tv_option_oo.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                tv_option_tt.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                tv_option_thh.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                tv_option_ff.background = ContextCompat.getDrawable(
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