package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class ImageThumbnail(
    @SerializedName("path") val path:String,
    @SerializedName("extension")val extension:String
)
