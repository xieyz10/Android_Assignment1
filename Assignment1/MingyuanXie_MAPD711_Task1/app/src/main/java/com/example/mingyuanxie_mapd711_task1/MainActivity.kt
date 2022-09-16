package com.example.mingyuanxie_mapd711_task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(view: View){
        if(view.id == R.id.btnSend){
            //get the text from the text field

            val editText = findViewById<EditText>(R.id.editName)
            val editAddress = findViewById<EditText>(R.id.editAddress)
            val editProfessional = findViewById<EditText>(R.id.editProfessional)
            val editDreamJob = findViewById<EditText>(R.id.editDreamJob)
            val editFavoriteFood = findViewById<EditText>(R.id.editFavoriteFood)

            val message_Name = editText.text.toString()
            val message_Address = editAddress.text.toString()
            val message_Professional = editProfessional.text.toString()
            val message_DreamJob = editDreamJob.text.toString()
            val message_FavoriteFood = editFavoriteFood.text.toString()

            //defining an intent object
            var intent = Intent(this@MainActivity, NextActivity::class.java)
            intent.putExtra("message_Name",message_Name)
            intent.putExtra("message_Address",message_Address)
            intent.putExtra("message_Professional",message_Professional)
            intent.putExtra("message_DreamJob",message_DreamJob)
            intent.putExtra("message_FavoriteFood",message_FavoriteFood)
            startActivity(intent)

            //display the message
            //Toast.makeText(applicationContext, message_Name, Toast.LENGTH_LONG).show()
        }
    }
}