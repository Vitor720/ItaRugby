package com.ddapps.itarugby

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ddapps.itarugby.databinding.FragmentRegisterPlayerBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore


class RegisterPlayerFragment : Fragment() {
    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentRegisterPlayerBinding>(inflater, R.layout.fragment_register_player, container, false)


        binding.register.setOnClickListener {
            val newPlayer = Players()
            newPlayer.name = binding.playerNameCreate.text.toString()
            newPlayer.born = binding.playerBirthdayDate.text.toString()
            newPlayer.contact = binding.playerContactCreate.text.toString()
            newPlayer.lastDrill = binding.playerLastDrill.text.toString()
            newPlayer.photo = binding.playerPhoto.text.toString()
            newPlayer.hight = binding.playerHight.text.toString().toInt()
            newPlayer.weight = binding.playerWeight.text.toString().toInt()
            newPlayer.redCards = binding.playerRedCardsCreate.text.toString().toInt()
            newPlayer.yellowCards = binding.playerYellowCardsCreate.text.toString().toInt()
            newPlayer.playerSince = binding.playerSinceDate.text.toString()
            newPlayer.position = binding.playerPositionCreate.text.toString()

            dataBase.collection("male_team").document(binding.playerNameCreate.text.toString()).set(newPlayer)
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
