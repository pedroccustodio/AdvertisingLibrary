package com.example.banneradmaker

//noinspection SuspiciousImport
import android.annotation.SuppressLint
import android.app.Activity
import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.os.Environment
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.getSystemService
import com.squareup.picasso.Picasso
import java.io.File

@SuppressLint("HardwareIds")
fun library (context: Context) {

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

    AlertDialog.Builder(context).setTitle("Title")
        .setMessage("Library in use").show()
    val a: Activity = context as Activity
    //a.setContentView(com.example.banneradmaker.R.layout.activity_main)



   // var fileName: String = "Banner Ad"

    /*try{
        var downloadManager = context.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
        val imageLink = Uri.parse("https://sdk.eng.miniclip.com/code_challenge/banner/BPM_Banner_V2_300x50px.jpg")
        val request = DownloadManager.Request(imageLink)
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE or DownloadManager.Request.NETWORK_WIFI)
            .setMimeType("image/jpeg")
            .setAllowedOverRoaming(false)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle(fileName)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, File.separator+fileName+".jpg")
        downloadManager.enqueue(request)
        Toast.makeText(context, "Image is Donloaded", Toast.LENGTH_LONG).show()

    } catch (e: Exception){
        Toast.makeText(context, "Image Download failed", Toast.LENGTH_LONG).show()
    }*/

    val imgView: ImageView = context.findViewById<View>(com.example.banneradmaker.R.id.imageView) as ImageView
    val url = "https://sdk.eng.miniclip.com/code_challenge/banner/BPM_Banner_V2_300x50px.jpg"

    Picasso.with(context).load(url).into(imgView)

    //imgView.visibility = ImageView.VISIBLE

    return
    //return Build.VERSION.RELEASE
}

