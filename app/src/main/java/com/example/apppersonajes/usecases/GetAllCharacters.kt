package com.example.apppersonajes.usecases

import com.example.apppersonajes.data.Characters.RepositoryCharacters
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.utils.DataResult

class GetAllCharacters(private val repository: RepositoryCharacters) {

    suspend fun invoke():DataResult<List<Character>> =
        repository.getAllCharacters()
}