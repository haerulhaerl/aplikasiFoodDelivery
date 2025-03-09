package com.example.myapplication.data

import android.text.Highlights
import androidx.annotation.DrawableRes
import com.example.myapplication.R

data class ProductHighligtState(
    val text: String,
    val type: ProductHighligtType
)

enum class ProductHighligtType{
 PRIMARY,SECONDARY
}

data class ProductPreviewState(
    val headline:String = "Mr. Cheezy",
    @DrawableRes val productImg: Int = R.drawable.img_burger,
    val highlights: List<ProductHighligtState> = listOf(
        ProductHighligtState(
            text = "Classic State",
            type = ProductHighligtType.SECONDARY
        ),
        ProductHighligtState(
            text = "Best Seller",
            type = ProductHighligtType.PRIMARY
        )
    )
 )