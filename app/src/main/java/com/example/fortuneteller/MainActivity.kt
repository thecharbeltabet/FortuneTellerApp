package com.example.fortuneteller

import android.graphics.Color
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val askButton: Button = findViewById(R.id.ask_button)


        askButton.setOnClickListener {

            askFortuneTeller()
        }
    }

    private fun askFortuneTeller() {
        val resultText: TextView = findViewById(R.id.answer_text)
        val resultImage: ImageView = findViewById(R.id.crystalball1_imageview)
        val randomInt = Random.nextInt(3)

           var answerText =  when(randomInt){
            0 -> "Maybe"
            1 -> "No"
            2 -> "Yes"
            else -> "error"

        }

        val imageColor = when (randomInt){
            0 -> Color.parseColor("#9090ee")
            1 -> Color.parseColor("#ee9090")
            2 -> Color.rgb(132,206,132)
            else -> Color.BLACK
        }

        resultText.text = answerText
        resultImage.setColorFilter(imageColor, PorterDuff.Mode.SRC_ATOP)
    }
}