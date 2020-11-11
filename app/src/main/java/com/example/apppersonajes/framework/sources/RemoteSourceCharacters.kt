package com.example.apppersonajes.framework.retrofit.sources

import com.example.apppersonajes.BuildConfig
import com.example.apppersonajes.data.Characters.source.DataSourceCharacters
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.domain.models.Thumbnail
import com.example.apppersonajes.framework.retrofit.AuthenticationApi
import com.example.apppersonajes.framework.retrofit.models.ImageThumbnail
import com.example.apppersonajes.framework.retrofit.models.ServerCharacter
import com.example.apppersonajes.framework.retrofit.requests.Characters.CharactersRequest
import com.example.apppersonajes.framework.translators.toDomainCharacter
import com.example.apppersonajes.utils.DataResult
import com.example.apppersonajes.utils.safeApiCall
import java.io.IOException
import kotlin.math.E

class RemoteSourceCharacters(private val request: CharactersRequest) : DataSourceCharacters {

    override suspend fun getListCharactersMarvel(): DataResult<List<Character>> {

        return safeApiCall(
            call = { requestGetListCharacters() },
            errorMessage = "Ocurrio un Error Inesperado"
        )
    }

    private suspend fun requestGetListCharacters() :DataResult<List<Character>>{

        val auth=AuthenticationApi()

        val response=request.service.getAllCharacters(BuildConfig.MarvelId,auth.time,auth.hash)

        if(response.isSuccessful){
            val results=response.body()?.charactersResult?.dataResults

            if(!results.isNullOrEmpty()){
                return DataResult.Success(results.map { it.toDomainCharacter() })
            }
        }

        return DataResult.Failure(IOException("Error Obteniendo Personaes"))


    }
}

