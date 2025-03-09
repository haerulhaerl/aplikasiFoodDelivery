package com.example.myapplication.ui.theme.screen.components

import android.graphics.drawable.DrawableContainer
import android.text.Highlights
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.data.ProductHighligtState
import com.example.myapplication.data.ProductHighligtType
import com.example.myapplication.ui.theme.AppTheme


@Composable
fun  ProductHighlights(
    modifier: Modifier = Modifier,
    highlights: List<ProductHighligtState>
){
    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ){
        highlights.onEach { item ->
            Highlights(
                text =item.text,
                colors = HighlightDefault.colors(type = item.type)

            )
        }
    }
}

@Composable
private fun Highlights(
    modifier: Modifier = Modifier,
    text: String,
    colors: HighlightColors = HighlightDefault.defaultColor
){
    Surface (
        modifier = Modifier,
        shape = RoundedCornerShape(percent = 50),
        contentColor = colors.contentColor,
        color = colors.containerColor
    ){
    Box(modifier = Modifier.padding(
        vertical = 10.dp,
        horizontal = 12.dp
    )
    ){
     Text(
         text = text,
         style = AppTheme.typography.titleSmall,
         fontWeight = FontWeight.Bold
     )
    }
    }
}
private object HighlightDefault{
    val defaultColor = HighlightColors(
        contentColor = Color.Unspecified,
        containerColor= Color.Unspecified
    )

    @Composable
    fun colors(type: ProductHighligtType): HighlightColors =when(type){
        ProductHighligtType.PRIMARY -> HighlightColors(
            containerColor =AppTheme.colors.highlightSurface,
            contentColor = AppTheme.colors.onHighlightSurface
        )
        ProductHighligtType.SECONDARY -> HighlightColors(
            containerColor  = AppTheme.colors.actionSurface,
            contentColor  = AppTheme.colors.onActionSurface
        )

    }
}

@Immutable
private data class HighlightColors(
    val containerColor: Color,
    val contentColor: Color
)
