package com.example.apppersonajes.usecases

import com.example.apppersonajes.data.DetailCharacter.RepositoryDetailCharacters
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.utils.DataResult

class GetCharacterDetail(private val repository: RepositoryDetailCharacters) {

    suspend fun invoke(idCharacter:Int):DataResult<Character> =
        repository.getDetailCharacter(idCharacter)

}