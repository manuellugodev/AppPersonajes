package com.example.apppersonajes.di

import com.example.apppersonajes.ui.CharacterDetail.CharacterDetailFragment
import com.example.apppersonajes.ui.Characters.CharactersFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,DataModule::class,RequestModule::class,UseCaseModule::class])
interface CharacterComponent {

    fun plus(charactersFragment: CharactersFragment)

    fun plus(characterDetailFragment: CharacterDetailFragment)


}