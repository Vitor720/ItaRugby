package com.ddapps.itarugby.ui.fragments


import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.ActivityMainBinding
import com.ddapps.itarugby.databinding.FragmentDisplayPlayerBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber
import kotlin.coroutines.CoroutineContext


class DisplayPlayerFragment : Fragment() {
     var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
     var player = Players()
     lateinit var binding: FragmentDisplayPlayerBinding

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Detalhes do Jogador"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_display_player, container, false)
        val playerSince = binding.playerSince

        val args = DisplayPlayerFragmentArgs.fromBundle(arguments)
        player.name = args.playerName

        dataBase.collection("male_team").document(player.name!!).get().addOnSuccessListener { document ->
            player = document.toObject(Players::class.java)!!

            val url = player.photo
            val image = binding.playerImageView
            Glide.with(context!!).load(url).into(image)

            binding.playerName.text = player.name
            binding.playerPosition.text = player.position
            binding.playerBirthday.text = player.born
            binding.playerBody.text = "${player.hight}  | ${player.weight} "
            playerSince.text = player.playerSince
            binding.lastDrill.text = player.lastDrill
            binding.playerYellowCards.text = player.yellowCards.toString()
            binding.playerRedCards.text = player.redCards.toString()

        }

        return binding.root
    }


}
