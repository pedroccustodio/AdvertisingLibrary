package com.example.advertisinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import com.example.banneradmaker.library

class MainActivity : AppCompatActivity() {

    private var permission = 0
    private val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
        permission = if(it){
            1
        }else{
            0
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        library(this)

       /* requestPermissionLauncher.launch((android.Manifest.permission.WRITE_EXTERNAL_STORAGE))
        if(permission==1){
            library(this)
        } else{
            Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show()
        }*/

        //val tvDisplay: TextView = findViewById<TextView>(R.id.tv_displayInfo)
        //tvDisplay.text = library()


        //AlertDialog.Builder(this).setTitle("The result is $result").show()
    }
}

