package com.ddapps.itarugby.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ddapps.itarugby.R
import com.ddapps.itarugby.TeamFragmentDirections
import com.ddapps.itarugby.databinding.PlayerRowBinding
import com.ddapps.itarugby.models.Players
import com.google.firebase.firestore.FirebaseFirestore
import jp.wasabeef.recyclerview.animators.holder.AnimateViewHolder

class TeamRecycler (val playerList: MutableList<Players>, val dataBase: FirebaseFirestore) : RecyclerView.Adapter<TeamRecycler.TemViewHolder>(), AnimateViewHolder {
    override fun animateRemoveImpl(holder: RecyclerView.ViewHolder?, listener: ViewPropertyAnimatorListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun preAnimateAddImpl(holder: RecyclerView.ViewHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun preAnimateRemoveImpl(holder: RecyclerView.ViewHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Template s.
    }

    override fun animateAddImpl(holder: RecyclerView.ViewHolder?, listener: ViewPropertyAnimatorListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemViewHolder {
        val view: PlayerRowBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.player_row, parent, false)
        return TemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: TemViewHolder, position: Int) {
        holder.playerName.text = playerList[position].name
        holder.binding.playerLayout.setOnClickListener {
            findNavController(it).navigate(TeamFragmentDirections.actionTeamFragmentToDisplayPlayerFragment(playerList[position].name!!))
        }

    }

    inner class TemViewHolder internal constructor(val binding: PlayerRowBinding) : RecyclerView.ViewHolder(binding.root){
        val playerName = binding.playerName

    }
}