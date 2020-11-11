package com.example.apppersonajes.framework.retrofit.requests.CharacterDetail

import com.example.apppersonajes.framework.retrofit.BaseRequest

class CharacterDetailRequest(baseUrl:String):BaseRequest<CharacterDetailService>(baseUrl) {

    val service=getService<CharacterDetailService>()
}