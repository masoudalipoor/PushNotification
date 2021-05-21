package com.example.pushnotification.logic

import android.app.NotificationManager
import android.content.Context
import android.graphics.BitmapFactory
import androidx.core.app.NotificationCompat
import com.example.pushnotification.R
import com.example.pushnotification.abstractions.NotificationBuilder

class NotificationLogic(var context: Context): NotificationBuilder {
    override fun DoNotify(notificationManager: NotificationManager) {
        val notification = NotificationCompat.Builder(context, R.string.ID_Notification.toString())
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setLargeIcon(BitmapFactory.decodeResource(context.resources, R.color.purple_700))
                .setContentTitle("My notification")
                .setContentText("Hello World! Hello World!")
                .setShowWhen(true)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setAutoCancel(true)
                .build()
        notificationManager.notify(1, notification)
    }
}