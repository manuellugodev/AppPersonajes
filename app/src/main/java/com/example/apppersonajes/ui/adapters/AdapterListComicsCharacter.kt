package com.example.apppersonajes.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apppersonajes.R
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.domain.models.Comic
import com.example.apppersonajes.ui.getImageCharacter

class AdapterListComicsCharacter(private val context: Context, private val listComics:List<Comic>):
RecyclerView.Adapter<AdapterListComicsCharacter.ViewHolderComic>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterListComicsCharacter.ViewHolderComic {
     return ViewHolderComic(LayoutInflater.from(context).inflate(R.layout.item_comic,parent,false))
    }

    override fun getItemCount(): Int =  listComics.size


    override fun onBindViewHolder(holder: AdapterListComicsCharacter.ViewHolderComic, position: Int) {

        val item=listComics[position]

        holder.textComic.text=item.title
        holder.imageComic.getImageCharacter(item.image.path,item.image.extension)


    }


    class ViewHolderComic(itemView: View):RecyclerView.ViewHolder(itemView){

        val imageComic:ImageView
        val textComic:TextView
        init {
            textComic=itemView.findViewById(R.id.nameComic)
            imageComic=itemView.findViewById(R.id.imageComic)
        }
    }
    interface OnCharacterClickListener{

        fun onCharacterClick(character: Character)
    }
}