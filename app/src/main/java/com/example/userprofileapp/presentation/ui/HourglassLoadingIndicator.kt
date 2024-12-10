package com.example.userprofileapp.presentation.ui

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.unit.dp

@Composable
fun HourglassLoadingIndicator(modifier: Modifier = Modifier) {
    val infiniteTransition = rememberInfiniteTransition()
    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    Canvas(modifier = modifier.size(48.dp)) {
        rotate(rotation) {
            drawLine(
                color = Color.Black,
                start = center.copy(y = size.height * 0.2f),
                end = center.copy(y = size.height * 0.8f),
                strokeWidth = 4f
            )
            drawLine(
                color = Color.Black,
                start = center.copy(x = size.width * 0.2f, y = size.height * 0.2f),
                end = center.copy(x = size.width * 0.8f, y = size.height * 0.2f),
                strokeWidth = 4f
            )
            drawLine(
                color = Color.Black,
                start = center.copy(x = size.width * 0.2f, y = size.height * 0.8f),
                end = center.copy(x = size.width * 0.8f, y = size.height * 0.8f),
                strokeWidth = 4f
            )
            drawLine(
                color = Color.Black,
                start = center.copy(x = size.width * 0.2f, y = size.height * 0.2f),
                end = center.copy(x = size.width * 0.8f, y = size.height * 0.8f),
                strokeWidth = 4f
            )
            drawLine(
                color = Color.Black,
                start = center.copy(x = size.width * 0.8f, y = size.height * 0.2f),
                end = center.copy(x = size.width * 0.2f, y = size.height * 0.8f),
                strokeWidth = 4f
            )
        }
    }
}