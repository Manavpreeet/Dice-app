package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollImage : ImageView = findViewById(R.id.imageView)
        rollImage.setImageResource(R.drawable.ic_launcher_foreground)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{

            val number = (1..6).random()
            when (number){
                1 -> rollImage.setImageResource(R.drawable.dice_1)
                2 -> rollImage.setImageResource(R.drawable.dice_2)
                3 -> rollImage.setImageResource(R.drawable.dice_3)
                4 -> rollImage.setImageResource(R.drawable.dice_4)
                5 -> rollImage.setImageResource(R.drawable.dice_5)
                6 -> rollImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
