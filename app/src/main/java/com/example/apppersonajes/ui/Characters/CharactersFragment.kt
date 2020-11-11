package com.example.apppersonajes.ui.Characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.apppersonajes.CharacterApp
import com.example.apppersonajes.R
import com.example.apppersonajes.domain.models.Character
import com.example.apppersonajes.ui.adapters.AdapterListCharacters
import com.example.apppersonajes.usecases.GetAllCharacters
import com.example.apppersonajes.utils.DataResult
import kotlinx.android.synthetic.main.fragment_characters.*
import java.lang.Exception
import javax.inject.Inject


class CharactersFragment : Fragment(), AdapterListCharacters.OnCharacterClickListener {



    @Inject
    lateinit var getAllCharacters: GetAllCharacters

    private val viewModelCharacter by viewModels<CharactersViewModel> {
        CharactersViewModelFactory(getAllCharacters)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.applicationContext as CharacterApp).appComponent.plus(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        viewModelCharacter.fetchCharacterList.observe(viewLifecycleOwner, ::updateUi)


        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecycler()
    }

    fun updateUi(result: DataResult<List<Character>>) {

        when (result) {

            is DataResult.Loading -> {

                progressCharacters.visibility=View.VISIBLE

            }

            is DataResult.Success -> {
                progressCharacters.visibility=View.GONE
                rvCharacters.adapter = AdapterListCharacters(requireContext(), result.data, this)
            }

            is DataResult.Failure -> {
                progressCharacters.visibility=View.GONE

                showToast("Disculpe Ocurrio un Error,Intente de nuevo")

            }

        }

    }

    private fun showToast(message:String) {

        Toast.makeText(
            requireContext(),
            message,
            Toast.LENGTH_SHORT
        ).show()

    }

    fun setupRecycler() {
        rvCharacters.layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
    }

    override fun onCharacterClick(character: Character) {

        val bundle = Bundle()
        bundle.putInt("IDCHARACTER", character.id)

        findNavController().navigate(
            R.id.action_charactersFragment_to_characterDetailFragment,
            bundle
        )
    }
}