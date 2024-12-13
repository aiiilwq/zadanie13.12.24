package com.example.twoscreens

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val btnBackToFirst = findViewById<Button>(R.id.btnBackToFirst)
        btnBackToFirst.setOnClickListener {
            finish()
        }
    }
}
