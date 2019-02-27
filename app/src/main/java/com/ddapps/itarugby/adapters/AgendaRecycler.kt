package com.ddapps.itarugby.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ddapps.itarugby.R
import com.ddapps.itarugby.ui.fragments.AgendaFragmentDirections
import com.ddapps.itarugby.databinding.AgendaRowBinding
import com.ddapps.itarugby.models.Event
import com.google.firebase.firestore.FirebaseFirestore
import java.text.SimpleDateFormat
import java.util.*

class AgendaRecycler(val eventList: MutableList<Event>, val dataBase: FirebaseFirestore) : RecyclerView.Adapter<AgendaRecycler.AgendaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {
        val view: AgendaRowBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.agenda_row, parent, false)
        return AgendaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val dateString = eventList[position].date
        val dateFormat = simpleDateFormat.parse(dateString)
        val monthFormat = SimpleDateFormat("MMM", Locale("pt", "BR")).format(dateFormat)

        holder.eventDay.text = dateFormat.date.toString()
        holder.eventMonth.text = monthFormat

        holder.eventStartHour.text = "${eventList[position].startTime} até ${eventList[position].endTime}"

        holder.eventName.text = eventList[position].name
        holder.eventPlace.text = eventList[position].location!!.placeName

        holder.agendaRow.setOnClickListener {
            when (eventList[position].gameEvent){
                true -> findNavController(it).navigate(AgendaFragmentDirections.actionAgendaFragmentToDisplayGameFragment(eventList[position].docID!!))
                false -> findNavController(it).navigate(AgendaFragmentDirections.actionAgendaFragmentToDisplayEventFragment(eventList[position].docID!!))
            }
        }
    }

    inner class AgendaViewHolder internal constructor(val binding: AgendaRowBinding) : RecyclerView.ViewHolder(binding.root){

        var eventDay = binding.eventDay
        var eventMonth = binding.eventMonth
        var eventStartHour = binding.eventStartHour
        var eventName = binding.eventName
        var eventPlace = binding.eventPlace
        var agendaRow = binding.agendaRowLayout

    }





}

