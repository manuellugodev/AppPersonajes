package com.example.apppersonajes.data.DetailCharacter

import com.example.apppersonajes.data.DetailCharacter.source.DataSourceDetailCharacter
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.domain.models.Comic
import com.example.apppersonajes.utils.DataResult

class RepositoryDetailCharacters(private val source: DataSourceDetailCharacter){
    suspend fun getDetailCharacter(idCharacter: Int): DataResult<Character> =
        source.getCharacterById(idCharacter)

    suspend fun getComicsByCharacter(idCharacter: Int): DataResult<List<Comic>> =
        source.getComicByCharacter(idCharacter)


}