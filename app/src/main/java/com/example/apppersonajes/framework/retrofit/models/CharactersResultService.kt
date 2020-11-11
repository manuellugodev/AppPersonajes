package com.example.apppersonajes.framework.retrofit.models

import com.google.gson.annotations.SerializedName

data class CharactersResultService(
    @SerializedName("total")val total:Int,
    @SerializedName("results")val dataResults:List<ServerCharacter>
)