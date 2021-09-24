package com.example.justkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var quantity: TextView
    private lateinit var price: TextView
    private var quantityItem: Int = 2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitOrder(view:View) {
        displayQuantity(quantityItem)
        displayPrice(quantityItem * 5)
    }

    private fun displayQuantity(number: Int) {
        quantity = findViewById(R.id.quantity_text_number)
        quantity.text = number.toString()
    }

    fun incrementQuantity(view: View) {
        quantityItem += 1
        displayQuantity(quantityItem)
    }

    fun decrementQuantity(view: View) {
        if (quantityItem<=1)
            return
        quantityItem -= 1
        displayQuantity(quantityItem)
    }

    private fun displayPrice(number: Int) {
        price = findViewById(R.id.price_text_number)
        price.text = NumberFormat.getCurrencyInstance().format(number)
    }
}