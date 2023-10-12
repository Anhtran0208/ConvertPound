package com.example.android.convertpound

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        button.setOnClickListener {
            val kilograms: String = editText.text.toString()

            val kilos: Float = kilograms.toFloat()
            val pounds: Float = kilos * 2.20462f
            textView.text = pounds.toString()
        }
    }
}