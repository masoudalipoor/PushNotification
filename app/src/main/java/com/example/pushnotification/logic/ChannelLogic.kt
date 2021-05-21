package com.example.pushnotification.logic

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.example.pushnotification.R
import com.example.pushnotification.abstractions.ChannelBuilder

class ChannelLogic: ChannelBuilder {
    override fun DoCreateNotificationChannel(notificationManager: NotificationManager) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(R.string.ID_Notification.toString(),
                    "TestNotif",
                    NotificationManager.IMPORTANCE_HIGH)
            notificationManager.createNotificationChannel(channel)
        }
    }
}