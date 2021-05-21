package com.example.pushnotification.abstractions

import android.app.NotificationManager

interface NotificationBuilder {
    fun DoNotify(notificationManager: NotificationManager)
}