package com.example.apppersonajes.data.DetailCharacter.source

import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.domain.models.Comic
import com.example.apppersonajes.utils.DataResult

interface DataSourceDetailCharacter {

    suspend fun getCharacterById(idCharacter: Int): DataResult<Character>
    suspend fun getComicByCharacter(idCharacter: Int):DataResult<List<Comic>>

}