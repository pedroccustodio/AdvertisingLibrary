package com.example.advertisinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.banneradmaker.AddNumbers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Library(3,4)

        //AlertDialog.Builder(this).setTitle("The result is $result").show()

    }
}