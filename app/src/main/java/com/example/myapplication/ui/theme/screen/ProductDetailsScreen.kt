package com.example.myapplication.ui.theme.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.theme.screen.components.ProductPreviewSection

@Composable
fun ProductDetailScreen(modifier: Modifier = Modifier
) {
    val scrollableState = rememberScrollState()

    Column (
        modifier = modifier.verticalScroll(scrollableState)
    ){
        ProductPreviewSection()
    }
}