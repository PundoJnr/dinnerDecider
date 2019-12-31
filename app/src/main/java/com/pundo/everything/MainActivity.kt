package com.pundo.everything

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val foodList = arrayListOf("beef and kales", "chicken and cabbage", "milk")
    var meal = arrayOf("Select meal time", "Breakfast", "Lunch", "Diner")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init
        spinner!!.setOnItemListener(this)


        //Create an Array adapter
        val mealType = ArrayAdapter(this, android.R.layout.simple_spinner_item, meal)
        //set layout for spinner
        mealType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set Adapter
        spinner!!.setAdapter(mealType)


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
