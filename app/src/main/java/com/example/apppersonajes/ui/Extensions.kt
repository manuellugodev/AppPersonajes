package com.example.apppersonajes.ui

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.getImageCharacter(urlPath:String,extension:String){
    Glide.with(context).load("$urlPath.$extension").centerCrop().into(this)
}