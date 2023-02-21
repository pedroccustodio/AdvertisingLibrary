package com.example.banneradmaker

//noinspection SuspiciousImport
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.squareup.picasso.Picasso
import java.util.*

@SuppressLint("HardwareIds")
fun showAd (context: Context, listUrl: List<String>){

    val a: Activity = context as Activity
    val mainHandler = Handler(Looper.getMainLooper())
    val imgView: ImageView = a.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView
    var adNumber = 0

    mainHandler.post(object : Runnable {
        override fun run() {
            Picasso.with(context).load(listUrl[adNumber]).into(imgView)
            if(adNumber == listUrl.size-1)
            {
                adNumber = 0
            }else{
                adNumber++
            }
            mainHandler.postDelayed(this, 10000)
        }
    })

    return
}

fun dismissAd (context: Context){

    val a: Activity = context as Activity
    val imgView: ImageView = a.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView

    imgView.visibility = View.INVISIBLE

    return
}

fun setAdSize (context: Context, height: Int, width: Int){

    val a: Activity = context as Activity
    val imgView: ImageView = a.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView

    imgView.requestLayout()
    imgView.layoutParams.height = height
    imgView.layoutParams.width = width

    return
}

fun setAdPosition (context: Context, horizontalBias: Float, verticalBias: Float){

    val a: Activity = context as Activity
    val imgView: ImageView = a.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView

    imgView.requestLayout()

    imgView.x = horizontalBias
    imgView.y = verticalBias

    return
}

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