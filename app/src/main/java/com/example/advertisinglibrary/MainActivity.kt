package com.example.advertisinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.banneradmaker.library

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDisplay: TextView = findViewById<TextView>(R.id.tv_displayInfo)
        tvDisplay.text = library()



        //AlertDialog.Builder(this).setTitle("The result is $result").show()
    }
}

