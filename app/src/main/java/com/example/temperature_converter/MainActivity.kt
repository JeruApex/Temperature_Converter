package com.example.temperature_converter

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val convert_button: Button = findViewById(R.id.convert_button)
        convert_button.setOnClickListener {

            val edit_text_celsius: TextView = findViewById(R.id.edit_text_celsius)
            val edit_text_celsius_text = edit_text_celsius.text

            val edit_text_fahrenheit: TextView = findViewById(R.id.edit_text_fahrenheit)
            val edit_text_fahrenheit_text = edit_text_fahrenheit.text

//            try {


            if (edit_text_celsius.text.toString().isEmpty()) {
                val calculate = ((edit_text_fahrenheit_text.toString().toDouble() - 32) * 5 / 9)
                val calculatedText: CharSequence = calculate.toString()
                edit_text_celsius.text = calculatedText
            } else if (edit_text_fahrenheit.text.toString().isEmpty()) {
                val calculate = ((edit_text_celsius_text.toString().toDouble() * 9 / 5) + 32)
                val calculatedText: CharSequence = calculate.toString()
                edit_text_fahrenheit.text = calculatedText
            }

//            } catch (e:NumberFormatException ){Toast.makeText(this,"Enter a number")}
//        }
            val resetButton: Button = findViewById(R.id.button2)
            resetButton.setOnClickListener {

                val edit_text_celsius: TextView = findViewById(R.id.edit_text_celsius)

                val edit_text_fahrenheit: TextView = findViewById(R.id.edit_text_fahrenheit)
                edit_text_celsius.text = ""
                edit_text_fahrenheit.text = ""
            }
        }

    }
}




