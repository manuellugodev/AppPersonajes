package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class MarvelComicResult (
    @SerializedName("code") val code:Int,

    @SerializedName("data") val comicResult:ComicResultService,

    @SerializedName("status") val status:String
)