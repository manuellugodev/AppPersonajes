package com.example.apppersonajes.di

import com.example.apppersonajes.framework.retrofit.requests.CharacterDetail.CharacterDetailRequest
import com.example.apppersonajes.framework.retrofit.requests.Characters.CharactersRequest
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class RequestModule {

    @Provides
    @Singleton
    @Named("baseUrl")
    fun baseUrlProvider() = "https://gateway.marvel.com/"

    @Provides
    fun characterRequestProvider(@Named("baseUrl")baseUrl:String) =
        CharactersRequest(baseUrl)

    @Provides
    fun characterDetailRequestProvider(@Named("baseUrl")baseUrl: String) =
        CharacterDetailRequest(baseUrl)

}