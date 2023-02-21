package com.example.advertisinglibrary

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.banneradmaker.dismissAd
import com.example.banneradmaker.setAdPosition
import com.example.banneradmaker.setAdSize
import com.example.banneradmaker.showAd

class MainActivity : AppCompatActivity() {

    private lateinit var dismissBtn: Button
    private lateinit var sizeBtn: Button
    private lateinit var positionBtn: Button

    private val imagesUrl = listOf<String>("https://sdk.eng.miniclip.com/code_challenge/banner/BPM_Banner_V2_300x50px.jpg",
                               "https://sdk.eng.miniclip.com/code_challenge/banner/MNF_Banners_V1_300x50.jpg",
                               "https://sdk.eng.miniclip.com/code_challenge/banner/UMG_Banner_V2_300x50px.jpg")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showAd(this@MainActivity, imagesUrl)

        dismissBtn = findViewById(R.id.dismiss)
        dismissBtn.setOnClickListener {
            dismissAd(this@MainActivity)
        }

        sizeBtn = findViewById(R.id.size)
        sizeBtn.setOnClickListener {
            setAdSize(this@MainActivity, 30, 100)
        }

        positionBtn = findViewById(R.id.position)
        positionBtn.setOnClickListener {
            setAdPosition(this@MainActivity, 10f, 1860f)
        }
    }
}

