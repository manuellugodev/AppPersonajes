package com.example.apppersonajes.framework.retrofit.requests.Characters

import com.example.apppersonajes.framework.retrofit.models.CharactersResultService
import com.example.apppersonajes.framework.retrofit.models.MarvelResult
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_GET_ALL_CHARACTERS
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_API_KEY
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_HASH
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_TS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.sql.Timestamp

interface CharactersService {

    @GET(REQUEST_GET_ALL_CHARACTERS)
    suspend fun getAllCharacters(
        @Query(REQUEST_PARAM_API_KEY) apiKey: String,
        @Query(REQUEST_PARAM_TS) timestamp: String,
        @Query(REQUEST_PARAM_HASH) hash:String
    ): Response<MarvelResult>
}