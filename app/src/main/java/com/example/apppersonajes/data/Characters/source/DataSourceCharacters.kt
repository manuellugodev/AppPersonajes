package com.example.apppersonajes.data.Characters.source

import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.utils.DataResult

interface DataSourceCharacters {

    suspend fun getListCharactersMarvel():DataResult<List<Character>>

}