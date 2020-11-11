package com.example.apppersonajes.framework.retrofit

import com.example.apppersonajes.BuildConfig
import com.example.apppersonajes.framework.retrofit.utils.md5
import java.util.*

class AuthenticationApi {

    val time:String = Date().time.toString()

    val hash: String

    private val secretKey =BuildConfig.MarvelIdPrivate+BuildConfig.MarvelId

    init{
        hash=(time + secretKey).md5
    }
}