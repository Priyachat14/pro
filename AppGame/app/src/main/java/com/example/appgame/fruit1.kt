package com.example.appgame

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_fruit1.*

class fruit1 : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList:ArrayList<Quiz>? = null
    private var mSelectedOptionPosition:Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit1)

        mUserName = intent.getStringExtra(Quiz3.USER_NAME)

        mQuestionsList = Quiz3.getQuestion()

        setQuestion()

        tv_option_o.setOnClickListener(this)
        tv_option_t.setOnClickListener(this)
        tv_option_thr.setOnClickListener(this)
        tv_option_fo.setOnClickListener(this)
        btn_subm.setOnClickListener(this)



    }

    private fun setQuestion(){

        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_subm.text = "FINISH"
        }else{
            btn_subm.text = "SUBMIT and PASS"
        }

        progressB.progress = mCurrentPosition
        tv_progre.text = "$mCurrentPosition" + "/" + progressB.max

        tv_questi.text = question!!.question
        tv_ima.setImageResource(question.image)
        tv_option_o.text = question.optionOne
        tv_option_t.text = question.optionTwo
        tv_option_thr.text = question.optionThree
        tv_option_fo.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        options.add(0,tv_option_o)
        options.add(1,tv_option_t)
        options.add(2,tv_option_thr)
        options.add(3,tv_option_fo)

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
            R.id.tv_option_o ->{
                selectedOptionView(tv_option_o,1)
            }
            R.id.tv_option_t ->{
                selectedOptionView(tv_option_t,2)
            }
            R.id.tv_option_thr ->{
                selectedOptionView(tv_option_thr,3)
            }
            R.id.tv_option_fo ->{
                selectedOptionView(tv_option_fo,4)
            }
            R.id.btn_subm -> {
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition++


                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                        val intent = Intent(this,Score::class.java)
                        intent.putExtra(Quiz3.USER_NAME,mUserName)
                        intent.putExtra(Quiz3.CORRECT_ANSWERS,mCorrectAnswer)
                        intent.putExtra(Quiz3.TOTAL_QUESTIONS,mQuestionsList!!.size)
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
                        btn_subm.text = "SUBMIT and PASS"
                    }else{
                        btn_subm.text = "Go To Next Question"

                    }
                    mSelectedOptionPosition = 0


                }
            }
        }
    }

    private fun answerView(answer:Int,drawableView:Int) {
        when (answer) {
            1 -> {
                tv_option_o.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            2 ->{
                tv_option_t.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            3 ->{
                tv_option_thr.background = ContextCompat.getDrawable(
                    this,drawableView
                )
            }
            4 ->{
                tv_option_fo.background = ContextCompat.getDrawable(
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