package com.example.mingyuanxie_mapd711_task1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NextActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val intent = intent
        val message_Name = intent.getStringExtra("message_Name")
        val message_Address = intent.getStringExtra("message_Address")
        val message_Professional = intent.getStringExtra("message_Professional")
        val message_DreamJob = intent.getStringExtra("message_DreamJob")
        val message_FavoriteFood = intent.getStringExtra("message_FavoriteFood")

        val text_Name = findViewById<TextView>(R.id.text_Name)
        val text_Address = findViewById<TextView>(R.id.text_Address)
        val text_Professional = findViewById<TextView>(R.id.text_Professional)
        val text_DreamJob = findViewById<TextView>(R.id.text_DreamJob)
        val text_FavoriteFood = findViewById<TextView>(R.id.text_FavoriteFood)

        text_Name.text = message_Name
        text_Address.text = message_Address
        text_Professional.text = message_Professional
        text_DreamJob.text = message_DreamJob
        text_FavoriteFood.text = message_FavoriteFood
    }
}