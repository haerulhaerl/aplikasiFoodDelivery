package com.example.myapplication.ui.theme.screen.components

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun ProductPreviewSection(modifier: Modifier = Modifier
) {
    val scrollableState = rememberScrollState()

    Column (
        modifier = modifier.verticalScroll(scrollableState)
    ){
    }
}