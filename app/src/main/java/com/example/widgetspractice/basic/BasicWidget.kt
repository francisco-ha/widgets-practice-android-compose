package com.example.widgetspractice.basic

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider

class BasicWidget: GlanceAppWidget() {

    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        //con el providerContent se pinta la vista del widget
        provideContent {
            MyContent()
        }
    }
    @SuppressLint("RestrictedApi")
    @Composable
    private fun MyContent(){
        Column() {
            Text(text = "Dato 1", style = TextStyle(color = ColorProvider(color = Color.Green)))
            Text("Dato 2")
        }
    }
}