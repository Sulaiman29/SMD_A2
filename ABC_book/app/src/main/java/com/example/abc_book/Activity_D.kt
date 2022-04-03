package com.example.abc_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Activity_D : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)

        val btnNext = findViewById<View>(R.id.btnNext) as Button
        btnNext.setOnClickListener {
            val intent = Intent(this, Activity_E::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}