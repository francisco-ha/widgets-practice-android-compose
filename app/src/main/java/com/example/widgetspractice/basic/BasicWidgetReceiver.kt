package com.example.widgetspractice.basic

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

class BasicWidgetReceiver: GlanceAppWidgetReceiver()  {

    override val glanceAppWidget: GlanceAppWidget = BasicWidget()

}