package com.example.apppersonajes.framework.translators

import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.domain.models.Thumbnail
import com.example.apppersonajes.framework.retrofit.models.ImageThumbnail
import com.example.apppersonajes.framework.retrofit.models.ServerCharacter

fun ServerCharacter.toDomainCharacter(): Character =
    Character(id,nameCharacter,description,imageThumb.toDomainThumbnail())

fun ImageThumbnail.toDomainThumbnail(): Thumbnail =
    Thumbnail(path, extension)