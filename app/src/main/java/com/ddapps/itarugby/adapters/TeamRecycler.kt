package com.ddapps.itarugby.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.ui.fragments.TeamFragmentDirections
import com.ddapps.itarugby.databinding.PlayerRowBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore

class TeamRecycler (val playerList: MutableList<Players>, val context: Context) : RecyclerView.Adapter<TeamRecycler.TemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemViewHolder {
        val view: PlayerRowBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.player_row, parent, false)
        return TemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: TemViewHolder, position: Int) {
        holder.playerName.text = playerList[position].name
        Glide.with(context).load(playerList[position].photo).into(holder.playerPhoto)
        holder.binding.playerLayout.setOnClickListener {
            findNavController(it).navigate(TeamFragmentDirections.actionTeamFragmentToDisplayPlayerFragment(playerList[position].name!!))
        }

    }

    inner class TemViewHolder internal constructor(val binding: PlayerRowBinding) : RecyclerView.ViewHolder(binding.root){
        val playerName = binding.playerName
        val playerPhoto = binding.playerImage

    }
}