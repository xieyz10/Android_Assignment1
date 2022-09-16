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

            val message_Name: String = getString(R.string.text_name)
            val message_Address: String = getString(R.string.text_address)
            val message_Professional: String = getString(R.string.text_profession)
            val message_DreamJob: String = getString(R.string.text_dreamJob)
            val message_FavoriteFood: String = getString(R.string.text_favoriteFood)

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