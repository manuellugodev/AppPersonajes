package com.example.apppersonajes.framework.retrofit.utils

object Constans {

    const val REQUEST_GET_CHARACTER_DETAIL =""

    const val REQUEST_GET_ALL_CHARACTERS ="/v1/public/characters?"
    const val REQUEST_GET_DETAIL_CHARACTER="/v1/public/characters/{characterId}"
    const val REQUEST_GET_COMIC_BY_CHARACTER="/v1/public/characters/{characterId}/comics"

    const val REQUEST_PARAM_API_KEY = "apikey"
    const val REQUEST_PARAM_TS="ts"
    const val REQUEST_PARAM_HASH="hash"
    const val REQUEST_PARAM_CHARACTER_ID="characterId"
}