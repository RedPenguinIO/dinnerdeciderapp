package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.dinnerdeciderapp.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val foods = arrayListOf("Yam and Kontomire", "Beans and k)K))", "Vovoo and zop", "Fried Rice and Chicken", "Drink and Bizkit/Beeskate")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button2.setOnClickListener{
            val random = Random()
            val position = random.nextInt(foods.count())
            binding.textView2.text = foods[position]

        }

        binding.button.setOnClickListener{
            val newFoodAdd = binding.foodName2BE.text.toString()
            foods.add(newFoodAdd)
            binding.foodName2BE.text.clear()
            println(foods)

        }





    }
}