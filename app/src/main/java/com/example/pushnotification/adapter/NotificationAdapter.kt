package com.example.pushnotification.adapter

import android.app.NotificationManager
import android.content.Context
import com.example.pushnotification.abstractions.ChannelBuilder
import com.example.pushnotification.abstractions.NotificationBuilder
import com.example.pushnotification.logic.ChannelLogic
import com.example.pushnotification.logic.NotificationLogic

class NotificationAdapter(var context: Context, var notificationManager: NotificationManager) {

    var channel: ChannelBuilder ?= null
    var notif: NotificationBuilder ?= null

    fun initializeChannel() {
        channel = ChannelLogic()
        channel?.DoCreateNotificationChannel(notificationManager)
    }

    fun initializeNotification() {
        notif = NotificationLogic(context)
        notif?.DoNotify(notificationManager)
    }
}