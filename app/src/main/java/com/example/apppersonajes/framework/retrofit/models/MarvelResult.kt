package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class MarvelResult(
    @SerializedName("code") val code:Int,

    @SerializedName("data") val charactersResult:CharactersResultService,

    @SerializedName("status") val status:String
)