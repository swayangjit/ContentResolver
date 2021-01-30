package com.github.resolver

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contentResolver = contentResolver //get the ContentResolver
        val cursor = contentResolver.query(TELEMETRY_CONTENT_URI, null, null, null, null)
        Log.d("Cursor", cursor.toString())
    }

    companion object {
        const val AUTHORITY = "com.github.provider"
        val TELEMETRY_CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/telemetry")
    }
}