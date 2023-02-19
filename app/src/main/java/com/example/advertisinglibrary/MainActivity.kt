package com.example.advertisinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.banneradmaker.library

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        library(this)

        //AlertDialog.Builder(this).setTitle("The result is $result").show()

    }
}