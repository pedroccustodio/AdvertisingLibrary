package com.example.banneradmaker

//noinspection SuspiciousImport
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.squareup.picasso.Picasso
import java.util.*

@SuppressLint("HardwareIds")
fun library (context: Context, url: String){

    /*return "Brand: ${Build.BRAND} \n" +
            "Model: ${Build.MODEL} \n" +
            "ID: ${Build.ID} \n" +
            "SDK: ${Build.VERSION.SDK_INT} \n" +
            "Manufacture: ${Build.MANUFACTURER} \n" +
            "Brand: ${Build.BRAND} \n" +
            "User: ${Build.USER} \n" +
            "Type: ${Build.TYPE} \n" +
            "Base: ${Build.VERSION_CODES.BASE} \n" +
            "Incremental: ${Build.VERSION.INCREMENTAL} \n" +
            "Board: ${Build.BOARD} \n" +
            "Host: ${Build.HOST} \n" +
            "FingerPrint: ${Build.FINGERPRINT} \n" +
            "Version Code: ${Build.VERSION.RELEASE}"
}*/

    /*AlertDialog.Builder(context).setTitle("Title")
        .setMessage("Library in use").show()*/
    val a: Activity = context as Activity


    val imgView: ImageView = context.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView
    Picasso.with(context).load(url).into(imgView)

    return

    /*val url1 = "https://sdk.eng.miniclip.com/code_challenge/banner/BPM_Banner_V2_300x50px.jpg"
    val url2 = "https://sdk.eng.miniclip.com/code_challenge/banner/MNF_Banners_V1_300x50.jpg"
    val url3 = "https://sdk.eng.miniclip.com/code_challenge/banner/UMG_Banner_V2_300x50px.jpg"

    when (adNumber) {
        0 -> Picasso.with(context).load(url1).into(imgView)
        1 -> Picasso.with(context).load(url2).into(imgView)
        2 -> Picasso.with(context).load(url3).into(imgView)
    }
    //Picasso.with(context).load(url1).into(imgView)
    return
    //return Build.VERSION.RELEASE
    //a.setContentView(com.example.banneradmaker.R.layout.activity_main)*/
}

