package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class ComicResultService (
    @SerializedName("total")val total:Int,
    @SerializedName("results")val dataResults:List<ServerComic>
)