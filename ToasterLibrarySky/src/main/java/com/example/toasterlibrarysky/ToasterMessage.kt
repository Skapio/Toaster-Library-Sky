package com.example.toasterlibrarysky

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun showItIsMyOwnFunction(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}