package com.pundo.everything

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val foodList = arrayListOf("beef and kales", "chicken and cabbage", "milk")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decide.setOnClickListener {
            val random = java.util.Random()

            val randomFood = random.nextInt(foodList.count())
            decidedMeal.text = foodList[randomFood];
        }

        add.setOnClickListener {
            val newFood = meal.text.toString()

            foodList.add(newFood)
            meal.text.clear()
        }


    }
}
