package com.example.apppersonajes.di

import com.example.apppersonajes.data.Characters.source.DataSourceCharacters
import com.example.apppersonajes.data.DetailCharacter.source.DataSourceDetailCharacter
import com.example.apppersonajes.framework.retrofit.requests.CharacterDetail.CharacterDetailRequest
import com.example.apppersonajes.framework.retrofit.requests.Characters.CharactersRequest
import com.example.apppersonajes.framework.retrofit.sources.RemoteSourceCharacterDetail
import com.example.apppersonajes.framework.retrofit.sources.RemoteSourceCharacters
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun dataSourceCharactersProvider(
        charactersRequest: CharactersRequest
    ):DataSourceCharacters =RemoteSourceCharacters(charactersRequest)

    @Provides
    fun dataSourceDetailCharactersProvider(
        characterDetailRequest: CharacterDetailRequest
    ):DataSourceDetailCharacter=RemoteSourceCharacterDetail(characterDetailRequest)

}