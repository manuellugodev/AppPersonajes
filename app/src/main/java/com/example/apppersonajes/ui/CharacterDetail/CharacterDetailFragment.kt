package com.example.apppersonajes.ui.CharacterDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apppersonajes.CharacterApp
import com.example.apppersonajes.R
import com.example.apppersonajes.ui.adapters.AdapterListComicsCharacter
import com.example.apppersonajes.ui.getImageCharacter
import com.example.apppersonajes.usecases.GetCharacterDetail
import com.example.apppersonajes.usecases.GetComicsByCharacter


import com.example.apppersonajes.utils.DataResult
import kotlinx.android.synthetic.main.fragment_character_detail.*
import javax.inject.Inject

class CharacterDetailFragment : Fragment() {



    @Inject
    lateinit var getCharacterDetail: GetCharacterDetail

    @Inject
    lateinit var getComicsByCharacter: GetComicsByCharacter


    private val viewModel by viewModels<CharacterDetailViewModel> {
       CharacterDetailViewModelFactory(getCharacterDetail,getComicsByCharacter)
    }


    private lateinit var idCharacter:Integer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireArguments().let {

            idCharacter=Integer(it.getInt("IDCHARACTER"))
        }

        (activity?.applicationContext as CharacterApp).appComponent.plus(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        attachObservers()

        return inflater.inflate(R.layout.fragment_character_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycler()
    }

    private fun setupRecycler() {
        rvComicCharacter.layoutManager=LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
    }

    private fun attachObservers() {
        viewModel.fetchCharacterDetail(idCharacter.toInt()).observe(viewLifecycleOwner, Observer {result->
            when(result){
                is DataResult.Loading->{
                    progressDetail.visibility=View.VISIBLE

                }

                is DataResult.Success->{

                    progressDetail.visibility=View.GONE
                    val character=result.data

                    txtDetailName.text=character.name
                    imageDetail.getImageCharacter(result.data.imageUri.path,result.data.imageUri.extension)
                    txtDescription.text=character.description

                }

                is DataResult.Failure->{

                    showToast("Ocurrio un Error ,Intente mas tarde")

                }
            }
        })

        viewModel.fetchComicsByCharacter(idCharacter.toInt()).observe(viewLifecycleOwner, Observer {result->
            when(result){
                is DataResult.Loading->{
                    progressDetail.visibility=View.VISIBLE
                }

                is DataResult.Success->{

                    progressDetail.visibility=View.GONE



                    rvComicCharacter.adapter=AdapterListComicsCharacter(requireContext(),result.data)
                }

                is DataResult.Failure->{
                    progressDetail.visibility=View.GONE

                    textComics.visibility=View.INVISIBLE
                    showToast("No se Encontraron Comics")
                }
            }
        })
    }

    private fun showToast(message: String) {

        Toast.makeText(requireContext(),message,Toast.LENGTH_SHORT).show()
    }


}