package com.example.apppersonajes.ui.Characters

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.apppersonajes.usecases.GetAllCharacters
import com.example.apppersonajes.utils.DataResult

class CharactersViewModel(
    private val getAllCharacters: GetAllCharacters
) : ViewModel() {

    val fetchCharacterList = liveData {

        emit(DataResult.Loading())

        try {

            val result = getAllCharacters.invoke()

            emit(result)

        } catch (e: Exception) {
            Log.e("ERROR", "Ocurrio Un Error Message = ${e.message}")
            emit(DataResult.Failure(e))
        }
    }
}

class CharactersViewModelFactory(
    private val getAllCharacters: GetAllCharacters
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(GetAllCharacters::class.java).newInstance(getAllCharacters)
    }
}