package com.ddapps.itarugby.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentRegisterPlayerBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber


class RegisterPlayerFragment : Fragment() {
    private var dataBase: FirebaseFirestore? = FirebaseFirestore.getInstance()


    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentRegisterPlayerBinding>(inflater,
            R.layout.fragment_register_player, container, false)


        binding.register.setOnClickListener {

            val newPlayer = Players()

            newPlayer.name = binding.playerNameCreate.text.toString()
            newPlayer.born = binding.playerBirthdayDate.text.toString()
            newPlayer.contact = binding.playerContactCreate.text.toString()
            newPlayer.lastDrill = binding.playerLastDrill.text.toString()
            newPlayer.photo = binding.playerPhoto.text.toString()

            newPlayer.hight = if ( binding.playerHight.text.toString() == ""){
                0
            }        else {
                binding.playerHight.text.toString().toInt()
            }


            newPlayer.weight = if (binding.playerWeight.text.toString() == "") {
                0
            } else {
                binding.playerWeight.text.toString().toInt()
            }


            newPlayer.redCards = if (binding.playerRedCardsCreate.text.toString() == ""){
                0
            }        else {
                binding.playerRedCardsCreate.text.toString().toInt()
            }


            newPlayer.yellowCards = if (binding.playerYellowCardsCreate.text.toString() == ""){
                0
            } else {
                binding.playerYellowCardsCreate.text.toString().toInt()
            }

            newPlayer.playerSince = binding.playerSinceDate.text.toString()
            newPlayer.position = binding.playerPositionCreate.text.toString()
//
//            if (binding.playerNameCreate.text.toString() == ""){
//                Toast.makeText()
//            }

            try {
                dataBase?.collection("male_team")?.document(binding.playerNameCreate.text.toString())?.set(newPlayer)?.addOnCompleteListener {
                    if (it.isSuccessful){

                        Timber.e("deu certo")
                    } else {
                    }}
            } catch (e: Exception){
                Toast.makeText(context!!, "Favor inserir o nome do jogador para cadastro.", Toast.LENGTH_LONG).show()
                Timber.e("O erro é:$e")
            }

            binding.playerNameCreate.setText("")
            binding.playerBirthdayDate.setText("")
            binding.playerContactCreate.setText("")
            binding.playerLastDrill.setText("")
            binding.playerPhoto.setText("")
            binding.playerHight.setText("")
            binding.playerWeight.setText("")
            binding.playerRedCardsCreate.setText("")
            binding.playerYellowCardsCreate.setText("")
            binding.playerSinceDate.setText("")
            binding.playerPositionCreate.setText("")


        }



        return binding.root
    }


}
