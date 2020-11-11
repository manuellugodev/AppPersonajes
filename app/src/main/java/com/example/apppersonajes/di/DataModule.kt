package com.example.apppersonajes.di

import com.example.apppersonajes.data.Characters.RepositoryCharacters
import com.example.apppersonajes.data.Characters.source.DataSourceCharacters
import com.example.apppersonajes.data.DetailCharacter.RepositoryDetailCharacters
import com.example.apppersonajes.data.DetailCharacter.source.DataSourceDetailCharacter
import dagger.Module
import dagger.Provides

@Module
class DataModule {


    @Provides
    fun repositoryCharactersProvider(
        dataSourceCharacters: DataSourceCharacters)=
        RepositoryCharacters(dataSourceCharacters)


    @Provides
    fun repositoryCharacterDetailProvider(
        dataSourceDetailCharacter: DataSourceDetailCharacter)=
        RepositoryDetailCharacters(dataSourceDetailCharacter)


}