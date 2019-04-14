package com.takosu.msgshareapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Context.showToast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()

    normalFunction()
    normalFunction(5)

}

fun normalFunction(a: Int = 2) {

}