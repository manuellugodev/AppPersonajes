package com.example.apppersonajes.framework.retrofit.requests.CharacterDetail

import com.example.apppersonajes.framework.retrofit.models.ComicResultService
import com.example.apppersonajes.framework.retrofit.models.MarvelComicResult
import com.example.apppersonajes.framework.retrofit.models.MarvelResult
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_GET_COMIC_BY_CHARACTER
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_GET_DETAIL_CHARACTER
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_API_KEY
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_CHARACTER_ID
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_HASH
import com.example.apppersonajes.framework.retrofit.utils.Constans.REQUEST_PARAM_TS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterDetailService {

    @GET(REQUEST_GET_DETAIL_CHARACTER)
    suspend fun getDetailCharacterById(
        @Path(REQUEST_PARAM_CHARACTER_ID)characterId:Int,
        @Query(REQUEST_PARAM_API_KEY)apiKey:String,
        @Query(REQUEST_PARAM_TS)timestamp: String,
        @Query(REQUEST_PARAM_HASH)hash:String

    ):Response<MarvelResult>

    @GET(REQUEST_GET_COMIC_BY_CHARACTER)
    suspend fun getComicByCharacter(
        @Path(REQUEST_PARAM_CHARACTER_ID)characterId:Int,
        @Query(REQUEST_PARAM_API_KEY)apiKey:String,
        @Query(REQUEST_PARAM_TS)timestamp: String,
        @Query(REQUEST_PARAM_HASH)hash:String
    ):Response<MarvelComicResult>

}