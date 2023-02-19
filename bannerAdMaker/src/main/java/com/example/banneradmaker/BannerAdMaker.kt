package com.example.banneradmaker

//noinspection SuspiciousImport
import android.R
import android.annotation.SuppressLint
import android.app.Activity
import android.content.ContentResolver
import android.content.Context
import android.os.Build
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

@SuppressLint("HardwareIds")
fun library (): String {

    return "Brand: ${Build.BRAND} \n" +
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
}
    /*AlertDialog.Builder(context).setTitle("Title")
        .setMessage("Library in use").show()

    val a: Activity = context as Activity
    a.setContentView(com.example.banneradmaker.R.layout.activity_main)

    val imgView: ImageView = context.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView

    imgView.visibility = ImageView.VISIBLE


    return Build.VERSION.RELEASE*/

