package com.ddapps.itarugby.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentRegisterPlayerBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber


@Suppress("SpellCheckingInspection")
class RegisterPlayerFragment : Fragment() {
    private var dataBase: FirebaseFirestore? = FirebaseFirestore.getInstance()

    private lateinit var playerNameEditText: EditText
    private lateinit var playerBirthdayEditText: EditText
    private lateinit var playerContactEditText: EditText
    private lateinit var playerLastDrillEditText: EditText
    private lateinit var playerPhotoEditText: EditText
    private lateinit var playerHightEditText: EditText
    private lateinit var playerWeighEditText: EditText
    private lateinit var playerRedCardsEditText: EditText
    private lateinit var playerYellowCardsEditText: EditText
    private lateinit var playerSinceDateEditText: EditText
    private lateinit var playerPositionEditText: EditText

    private lateinit var binding: FragmentRegisterPlayerBinding


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_register_player, container, false)

        playerNameEditText = binding.playerNameCreate
        playerBirthdayEditText = binding.playerBirthdayDate
        playerContactEditText = binding.playerContactCreate
        playerLastDrillEditText = binding.playerLastDrill
        playerPhotoEditText = binding.playerPhoto
        playerHightEditText = binding.playerHight
        playerWeighEditText = binding.playerWeight
        playerRedCardsEditText = binding.playerRedCardsCreate
        playerYellowCardsEditText = binding.playerYellowCardsCreate
        playerSinceDateEditText = binding.playerSinceDate
        playerPositionEditText = binding.playerPositionCreate


        binding.register.setOnClickListener {

            val newPlayer = Players()

            newPlayer.name = playerNameEditText.text.toString()
            newPlayer.born = playerBirthdayEditText.text.toString()
            newPlayer.contact = playerContactEditText.toString()
            newPlayer.lastDrill = playerLastDrillEditText.text.toString()
            newPlayer.photo = playerPhotoEditText.text.toString()

            newPlayer.hight = if ( playerHightEditText.text.toString() == ""){
                0
            }        else {
                playerHightEditText.text.toString().toInt()
            }


            newPlayer.weight = if (playerWeighEditText.text.toString() == "") {
                0
            } else {
                playerWeighEditText.text.toString().toInt()
            }


            newPlayer.redCards = if (playerRedCardsEditText.text.toString() == ""){
                0
            }        else {
                playerRedCardsEditText.text.toString().toInt()
            }


            newPlayer.yellowCards = if (playerYellowCardsEditText.text.toString() == ""){
                0
            } else {
                playerYellowCardsEditText.text.toString().toInt()
            }

            newPlayer.playerSince = playerSinceDateEditText.text.toString()
            newPlayer.position = binding.playerPositionCreate.text.toString()

           setData(newPlayer)
        }

        return binding.root
    }

    private fun setData(newPlayer: Players) {

        try {
            dataBase?.collection("male_team")?.document(binding.playerNameCreate.text.toString())?.set(newPlayer)?.addOnCompleteListener {
                if (it.isSuccessful){
                    Toast.makeText(context!!, "Jogador Cadastrado!.", Toast.LENGTH_LONG).show()
                    clearFields()
                    Timber.e("deu certo")
                } else {
                    Toast.makeText(context!!, "Cadastro não efetuado, verificar conexão", Toast.LENGTH_LONG).show()
                }
            }
        } catch (e: Exception){
            Toast.makeText(context!!, "Favor inserir o nome do jogador para cadastro.", Toast.LENGTH_LONG).show()
            Timber.e("O erro é:$e")
        }    }

    private fun clearFields(){
        playerNameEditText.setText("")
        playerBirthdayEditText.setText("")
        playerContactEditText.setText("")
        playerLastDrillEditText.setText("")
        playerPhotoEditText.setText("")
        playerHightEditText.setText("")
        playerWeighEditText.setText("")
        playerRedCardsEditText.setText("")
        playerYellowCardsEditText.setText("")
        playerSinceDateEditText.setText("")
        playerPositionEditText.setText("")

    }


}
