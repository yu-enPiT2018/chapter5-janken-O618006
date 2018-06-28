package com.example.enpit_p12.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val id = intent.getIntExtra("MY_HANDa",0)

        when(id){
            R.id.gu -> myHandImage.setImageResource(R.drawable.gu)
            R.id.choki -> myHandImage.setImageResource(R.drawable.gu)
            R.id.pa -> myHandImage.setImageResource(R.drawable.gu)
        }
    }
}
