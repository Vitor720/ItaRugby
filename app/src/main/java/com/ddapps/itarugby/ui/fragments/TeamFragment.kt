package com.ddapps.itarugby.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ddapps.itarugby.R
import com.ddapps.itarugby.adapters.TeamRecycler
import com.ddapps.itarugby.databinding.FragmentTeamBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import timber.log.Timber


class TeamFragment : Fragment() {
    private lateinit var binding: FragmentTeamBinding
    val dataBase = FirebaseFirestore.getInstance()

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Lista de Jogadores"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_team, container, false)

        loadPlayers()

        return binding.root
    }

    private fun loadPlayers(){
        val teamRecycler = binding.recyclerViewTeam
        dataBase.collection("male_team").get()
            .addOnSuccessListener { task ->
                if (task.isEmpty){
                    Toast.makeText(context!!, "Não existem  jogadores a serem carregados", Toast.LENGTH_LONG).show()
                    Timber.i("Lista de jogadores está vazia")
                } else {
                    val playerList = mutableListOf<Players>()
                    for (document in task){
                        val player = document.toObject(Players::class.java)
                        playerList.add(player)
                        Timber.d("Recebido: ${document.id} -> ${document.data}")
                    }

                    teamRecycler.layoutManager = LinearLayoutManager(context)

                    // Recycler Animations
                    val alphaAdapter = AlphaInAnimationAdapter(TeamRecycler(playerList, dataBase)).apply {
                        setDuration(720)
                    }
                    teamRecycler.adapter = alphaAdapter
                }

            }
    }

}
