package com.example.apppersonajes.domain.models

data class Comic(
    val idComic:Int,
    val title:String,
    val description:String,
    val pages:Int,
    val image:Thumbnail
)