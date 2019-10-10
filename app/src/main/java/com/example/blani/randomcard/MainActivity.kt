package com.example.blani.randomcard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*


import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun randomNumber(view: View){
        val random = Random()
        var randomString = "0"
        randomString = (random.nextInt(13) + 2).toString();

        when(randomString){
            "11" -> randomString = "W"
            "12" -> randomString = "Q"
            "13" -> randomString = "K"
            "14" -> randomString = "A"
        }

        textView.text = randomString

    }

    fun randomSuit(view: View){
        val random = Random()
        var randomInt = 0
        var drawableInt = 0
        randomInt = (random.nextInt(4))

        when(randomInt){
            0 -> drawableInt = R.drawable.club
            1 -> drawableInt = R.drawable.spade
            2 -> drawableInt = R.drawable.hearts
            3 -> drawableInt = R.drawable.diamond
        }

        imageView2.setImageResource(drawableInt)
    }

    fun randomAll(view: View){
        val random = Random()
        var randomInt = 0
        randomInt = (random.nextInt(55))

        when(randomInt){
            7,20,49 -> {
                textView.text = "J"
                imageView2.setImageResource(R.drawable.jocker)
            }
            else -> {
                randomNumber(view)
                randomSuit(view)
            }
        }
    }
}
