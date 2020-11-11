package com.example.apppersonajes.framework.translators

import com.example.apppersonajes.domain.models.Comic
import com.example.apppersonajes.framework.retrofit.models.ServerComic

fun ServerComic.toDomainComic():Comic=
    Comic(idComic,title,description,pages,imageThumb.toDomainThumbnail())