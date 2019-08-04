package com.ddapps.itarugby.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.RowItemTrophyRoomBinding
import com.ddapps.itarugby.models.Sponsors
import com.ddapps.itarugby.util.load

class SponsorsRecycler(val sponsorsList: List<Sponsors>) : RecyclerView.Adapter<SponsorsRecycler.SponsorsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SponsorsRecycler.SponsorsViewHolder {
        val view: RowItemTrophyRoomBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_item_trophy_room, parent, false)
        return SponsorsViewHolder(view)

    }

    override fun getItemCount(): Int {
        return sponsorsList.size
    }

    override fun onBindViewHolder(holder: SponsorsRecycler.SponsorsViewHolder, position: Int) {
        val sponsor = sponsorsList[position]

        holder.sponsorName.text = sponsor.name

        holder.imageView.load(sponsor.url)
    }


    inner class SponsorsViewHolder internal constructor(val binding: RowItemTrophyRoomBinding) : RecyclerView.ViewHolder(binding.root){
        val sponsorName = binding.trophyName
        val imageView = binding.trophyImage
    }


}