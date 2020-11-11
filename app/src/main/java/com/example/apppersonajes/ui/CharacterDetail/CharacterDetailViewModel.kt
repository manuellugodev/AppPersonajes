package com.example.apppersonajes.ui.CharacterDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import com.example.apppersonajes.usecases.GetCharacterDetail
import com.example.apppersonajes.usecases.GetComicsByCharacter
import com.example.apppersonajes.utils.DataResult

class CharacterDetailViewModel(
    private val getCharactersDetail: GetCharacterDetail,
    private val getComicsByCharacter: GetComicsByCharacter
) : ViewModel() {

    fun fetchCharacterDetail(idCharacter: Int) = liveData {
        emit(DataResult.Loading())

        try {
            val result = getCharactersDetail.invoke(idCharacter)

            emit(result)
        } catch (e: Exception) {
            emit(DataResult.Failure(e))
            e.printStackTrace()
        }
    }

    fun fetchComicsByCharacter(idCharacter: Int) = liveData {

        emit(DataResult.Loading())

        try {
            val result = getComicsByCharacter.invoke(idCharacter)

            emit(result)
        } catch (e: Exception) {
            e.printStackTrace()
            emit(DataResult.Failure(e))
        }
    }
}

class CharacterDetailViewModelFactory(
    private val getCharacterDetail: GetCharacterDetail,
    private val getComicsByCharacter: GetComicsByCharacter
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(GetCharacterDetail::class.java,GetComicsByCharacter::class.java)
            .newInstance(getCharacterDetail,getComicsByCharacter)
    }
}