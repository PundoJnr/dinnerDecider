package com.pundo.everything

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() , AdapterView.OnItemSelectedListener{

    val breakFast = arrayListOf("beef and kales", "chicken and cabbage", "milk")
    var meals = arrayOf("Select meal time", "Breakfast", "Lunch", "Diner")
    val lunchList = arrayListOf("")
    val dinnerList = arrayListOf("")


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


    }
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        when(position){
            1 -> {
                decide.setOnClickListener {
                    val random = Random()
                    val breakFastList = random.nextInt(breakFast.count())
                    decidedMeal.text = breakFast[breakFastList]
                }
                add.setOnClickListener{
                    //get user entry
                    val newBreak = meal.text.toString()
                    //add entry to arrayList
                    breakFast.add(newBreak)
                    //clear editText
                    meal.text.clear()
                }
            }
            else -> Toast.makeText(this@MainActivity,"aye",Toast.LENGTH_LONG).show()
        }
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
