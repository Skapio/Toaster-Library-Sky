package com.example.toasterlibrarysky

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}