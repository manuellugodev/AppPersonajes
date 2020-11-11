package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class ServerCharacter (
    @SerializedName("id")val id:Int,
    @SerializedName("name")val nameCharacter:String,
    @SerializedName("description")val description:String,
    @SerializedName("thumbnail")val imageThumb:ImageThumbnail

)
