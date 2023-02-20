package com.example.advertisinglibrary

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.banneradmaker.library
import java.util.*
import kotlin.concurrent.scheduleAtFixedRate

class MainActivity : AppCompatActivity() {

   /* private var permission = 0
    private val requestPermissionLauncher = registerForActivityResult(ActivityResultContracts.RequestPermission()){
        permission = if(it){
            1
        }else{
            0
        }
    }*/
    val imagesUrl = arrayOf<String>("https://sdk.eng.miniclip.com/code_challenge/banner/BPM_Banner_V2_300x50px.jpg",
                                   "https://sdk.eng.miniclip.com/code_challenge/banner/MNF_Banners_V1_300x50.jpg",
                                   "https://sdk.eng.miniclip.com/code_challenge/banner/UMG_Banner_V2_300x50px.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /*val context: Context = this
       val mainExecutor = ContextCompat.getMainExecutor(this)
       val t = Timer()*/
       var adNumber = 0

       val mainHandler = Handler(Looper.getMainLooper())

       mainHandler.post(object : Runnable {
           override fun run() {
               Log.d("PEDRO", "New Ad")
               when (adNumber) {
                   0 -> {
                       library(this@MainActivity, imagesUrl[adNumber])
                       adNumber = 1
                   }
                   1 -> {
                       library(this@MainActivity, imagesUrl[adNumber])
                       adNumber = 2;
                   }
                   2 -> {
                       library(this@MainActivity, imagesUrl[adNumber])
                       adNumber = 0;
                   }
               }
               mainHandler.postDelayed(this, 10000)
           }
       })

       /*Handler(Looper.getMainLooper()).postDelayed({
           // Your Code

           }
       }, 1000)

       val tt: TimerTask = object : TimerTask() {

           override fun run() {

           }
       }
       t.schedule(tt,0,10000);*/


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

