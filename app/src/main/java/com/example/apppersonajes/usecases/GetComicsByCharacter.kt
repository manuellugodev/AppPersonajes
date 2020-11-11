package com.example.apppersonajes.usecases

import com.example.apppersonajes.data.DetailCharacter.RepositoryDetailCharacters
import com.example.apppersonajes.domain.models.Comic
import com.example.apppersonajes.utils.DataResult

class GetComicsByCharacter (private val repository: RepositoryDetailCharacters){

    suspend fun invoke(idCharacter:Int):DataResult<List<Comic>> =
        repository.getComicsByCharacter(idCharacter)
}