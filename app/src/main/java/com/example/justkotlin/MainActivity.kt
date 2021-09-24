package com.example.justkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var quantity: TextView
    lateinit var price: TextView
    var numberOfCoffee = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitOrder(view: View) {
        displayQuantity(numberOfCoffee)
        displayPrice(numberOfCoffee * 3)
    }

    private fun displayQuantity(number: Int) {
        quantity = findViewById(R.id.quantity_text_number)
        quantity.text = "" + number
    }

    private fun displayPrice(number: Int) {
        price = findViewById(R.id.price_text_number)
        price.text = NumberFormat.getCurrencyInstance().format(number)
    }
}