package com.example.pushnotification

import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pushnotification.adapter.NotificationAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val systemService = getSystemService(
                Context.NOTIFICATION_SERVICE) as NotificationManager

        findViewById<Button>(R.id.showNotificationButton).setOnClickListener {
            var adapter = NotificationAdapter(this@MainActivity, systemService)
            adapter.initializeChannel()
            adapter.initializeNotification()
        }
    }
}