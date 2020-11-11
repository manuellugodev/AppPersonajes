package com.example.apppersonajes.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.apppersonajes.R
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.ui.getImageCharacter

class AdapterListCharacters(private val context: Context, private val listCharacters:List<Character>, private val characterClickListener:OnCharacterClickListener):
RecyclerView.Adapter<AdapterListCharacters.ViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterListCharacters.ViewHolder {
     return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_character,parent,false))
    }

    override fun getItemCount(): Int =  listCharacters.size


    override fun onBindViewHolder(holder: AdapterListCharacters.ViewHolder, position: Int) {

        val item=listCharacters[position]
        holder.cardViewCharacter.setOnClickListener{
            characterClickListener.onCharacterClick(item)
        }
        holder.imageCharacter.getImageCharacter(item.imageUri.path,item.imageUri.extension)


    }


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val imageCharacter:ImageView
        val cardViewCharacter:CardView
        init {
            cardViewCharacter=itemView.findViewById(R.id.cardCharacter)
            imageCharacter=itemView.findViewById(R.id.imageCharacter)
        }
    }
    interface OnCharacterClickListener{

        fun onCharacterClick(character: Character)
    }
}