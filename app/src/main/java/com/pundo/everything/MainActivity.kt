package com.pundo.everything

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener{

    val foodList = arrayListOf("beef and kales", "chicken and cabbage", "milk")
    var meals = arrayOf("Select meal time", "Breakfast", "Lunch", "Diner")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        //Create an Array adapter
        val mealType = ArrayAdapter(this, android.R.layout.simple_spinner_item, meals)
        //set layout for spinner
        mealType.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set Adapter


        fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
            // use position to know the selected item
        }


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
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(position){

        }
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
