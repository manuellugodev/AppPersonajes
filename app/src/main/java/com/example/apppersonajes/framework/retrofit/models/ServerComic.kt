package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class ServerComic(
    @SerializedName("id")val idComic:Int,
    @SerializedName("title")val title:String,
    @SerializedName("description")val description:String,
    @SerializedName("pageCount") val pages:Int,
    @SerializedName("thumbnail")val imageThumb:ImageThumbnail
)