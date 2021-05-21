package com.example.pushnotification.abstractions

import android.app.NotificationManager

interface ChannelBuilder {
    fun DoCreateNotificationChannel(notificationManager: NotificationManager)
}