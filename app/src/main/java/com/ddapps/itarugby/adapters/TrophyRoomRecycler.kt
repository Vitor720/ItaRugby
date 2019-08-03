package com.ddapps.itarugby.adapters

import android.app.Activity
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.RowItemTrophyRoomBinding
import com.ddapps.itarugby.models.Trophy
import com.ddapps.itarugby.ui.fragments.TrophyDisplayFragmentDirections
import com.ddapps.itarugby.ui.fragments.TrophyRoomFragmentDirections
import com.ddapps.itarugby.util.load

class TrophyRoomRecycler(val trophysList: MutableList<Trophy>) : RecyclerView.Adapter<TrophyRoomRecycler.TrophyRoomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrophyRoomViewHolder {
        val view: RowItemTrophyRoomBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_item_trophy_room, parent, false)
        return TrophyRoomViewHolder(view)    }

    override fun getItemCount(): Int {
        return trophysList.size

    }

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(holder: TrophyRoomViewHolder, position: Int) {

        val trophy = trophysList[position]

        holder.trophyName.text = trophy.trophyName
        holder.trophyDate.text = trophy.trophyDate

        holder.trophyRowItem.setOnClickListener {
            findNavController(it).navigate(TrophyRoomFragmentDirections.actionTrophyRoomFragmentToTrophyDisplayFragment(trophy.fileName!!))
        }

        val imageMaps = trophy.trophyImage!!["0"]


        // Criar um switch case para cada colocação onde muda a imagem de cada  troféu  row_item

        holder.trophyImage.load(Activity(), imageMaps)

        //TODO criar função para trocar a cor de fundo da row de acordo com a classificação da equipe
//        when(trophy.trophyPosition) {
//            1 -> holder.trophyRowItem.setBackgroundResource(R.color.orange_400)
//            2 -> holder.trophyRowItem.setBackgroundResource(R.color.com_facebook_button_login_silver_background_color)
//            3 -> holder.trophyRowItem.setBackgroundResource(R.color.brown_300)
//        }
    }


    inner class TrophyRoomViewHolder internal constructor(val binding: RowItemTrophyRoomBinding) : RecyclerView.ViewHolder(binding.root){
        val trophyName = binding.trophyName
        val trophyDate = binding.trophyDate
        val trophyRowItem = binding.trophyRowItem
        val trophyImage = binding.trophyImage

    }
}