package com.example.apppersonajes.framework.retrofit.requests.Characters

import com.example.apppersonajes.framework.retrofit.BaseRequest

class CharactersRequest(baseUrl:String) :BaseRequest<CharactersService>(baseUrl){

    val service = getService<CharactersService>()
}