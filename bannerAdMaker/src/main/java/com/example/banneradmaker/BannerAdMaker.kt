package com.example.banneradmaker

import android.content.Context
import androidx.appcompat.app.AlertDialog

fun library (context: Context) {

    AlertDialog.Builder(context).setTitle("Title")
        .setMessage("Library in use").show()

    return
}