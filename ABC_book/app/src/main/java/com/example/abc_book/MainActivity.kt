package com.example.abc_book

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Displaying Toast Message
        Toast.makeText(getApplicationContext(),"Let's learn ABC...",Toast.LENGTH_SHORT).show()

        val btnStart = findViewById<View>(R.id.btnStart) as Button
        btnStart.setOnClickListener {
            val intent = Intent(this, Activity_A::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}