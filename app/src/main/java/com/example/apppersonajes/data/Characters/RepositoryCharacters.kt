package com.example.apppersonajes.data.Characters

import com.example.apppersonajes.data.Characters.source.DataSourceCharacters
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.utils.DataResult

class RepositoryCharacters(private val source: DataSourceCharacters) {

    suspend fun getAllCharacters(): DataResult<List<Character>> =

        source.getListCharactersMarvel()
}