package com.example.apppersonajes.di

import com.example.apppersonajes.data.Characters.RepositoryCharacters
import com.example.apppersonajes.data.DetailCharacter.RepositoryDetailCharacters
import com.example.apppersonajes.usecases.GetAllCharacters
import com.example.apppersonajes.usecases.GetCharacterDetail
import com.example.apppersonajes.usecases.GetComicsByCharacter
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun getAllCharactersProvider(
        repositoryCharacters: RepositoryCharacters
    ): GetAllCharacters = GetAllCharacters(repositoryCharacters)

    @Provides
    fun getCharacterDetailProvider(
        repositoryDetailCharacters: RepositoryDetailCharacters
    ): GetCharacterDetail = GetCharacterDetail(repositoryDetailCharacters)

    @Provides
    fun getComicsByCharacterProvider(
        repositoryDetailCharacters: RepositoryDetailCharacters
    ):GetComicsByCharacter=GetComicsByCharacter(repositoryDetailCharacters)
}