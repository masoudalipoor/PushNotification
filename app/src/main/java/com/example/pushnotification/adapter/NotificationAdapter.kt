package com.example.pushnotification.adapter

import android.app.NotificationManager
import android.content.Context
import com.example.pushnotification.abstractions.ChannelBuilder
import com.example.pushnotification.abstractions.NotificationBuilder
import com.example.pushnotification.logic.ChannelLogic
import com.example.pushnotification.logic.NotificationLogic

class NotificationAdapter(var notificationManager: NotificationManager) {

    var channel: ChannelBuilder ?= null
    var notif: NotificationBuilder ?= null

    fun initializeChannel(channelLogic: ChannelLogic) {
        channel = channelLogic
        channel?.DoCreateNotificationChannel(notificationManager)
    }

    fun initializeNotification(notificationLogic: NotificationLogic) {
        notif = notificationLogic
        notif?.DoNotify(notificationManager)
    }
}