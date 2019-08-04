package com.ddapps.itarugby.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ddapps.itarugby.databinding.EventRowBinding
import com.ddapps.itarugby.models.Event
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import android.content.ActivityNotFoundException
import android.content.Context
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.ui.fragments.HomeFragmentDirections


/** Recycler View class
 * Ao clicar em um botão ele tem o fundo e a cor do texto a.
 *
**/


class EventViewRecycler(
     val hereContext: Context,
    private val eventList: MutableList<Event>,
    private val database: FirebaseFirestore,
    private val userName: String? = null,
    private val screen_width: Int,
    private val screen_heigh: Int
) : RecyclerView.Adapter<EventViewRecycler.EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view: EventRowBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.event_row, parent, false)
        return EventViewHolder(view)
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val confirmedList = eventList[position].confirmed
        val mayBeList = eventList[position].mayBe
        val declinedList = eventList[position].declined
        val docID = eventList[position].docID


        // para definir se o jogador vai ao treino.
        when(userName){
            in confirmedList!! -> setConfirmed(holder)
            in mayBeList!! -> setMayBe(holder)
            in declinedList!! -> setDeclined(holder)
        }

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val dateString = eventList[position].date
        val dateFormat = simpleDateFormat.parse(dateString)
        val dateStringCorrect = SimpleDateFormat("dd/MM/yyyy",Locale("pt", "BR")).format(dateFormat)
        val dayWeek = SimpleDateFormat("EEEE", Locale("pt", "BR")).format(dateFormat).toUpperCase()

        holder.name.text = eventList[position].name
        holder.placeName.text = "${eventList[position].location!!.placeName}(${eventList[position].location!!.placeDetails})"
        holder.date.text = "$dayWeek - $dateStringCorrect"
        holder.eventTime.text = eventList[position].arriveEarly
        val lat = eventList[position].location!!.geoPoint!!.latitude
        val lgn = eventList[position].location!!.geoPoint!!.longitude

        var url = "https://maps.googleapis.com/maps/api/staticmap?"
        url += "&zoom=15"
        url += "&size=${Integer.toString(screen_width)}x${Integer.toString(screen_heigh / 8)}"
        url += "&maptype=road"
        url += "&markers=color:orange%7Clabel:Lugar%7C$lat, $lgn"
        url += "&key="

        // Ao mudar para glide parou de carregar as imagens
        Glide.with(hereContext).load(url).into(holder.mapView)


        holder.mapView.setOnClickListener {
            val zoom  = "?z=16"
            val uri = "geo:$lat,$lgn$zoom"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setPackage("com.google.android.apps.maps")

            try {
                it.context.startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                try {
                    val unrestrictedIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                    it.context.startActivity(unrestrictedIntent)
                } catch (innerEx: ActivityNotFoundException) {
                    Toast.makeText(it.context, "Please install a maps application", Toast.LENGTH_LONG).show()
                }
            }
        }


        holder.binding.confirmButton.setOnClickListener {

            database.collection("events").document(docID!!).update("confirmed", FieldValue.arrayUnion(userName)).addOnSuccessListener {

                    Timber.e("deu certo ${eventList[position].userID}")

                setConfirmed(holder)


                }.addOnFailureListener {
                    Timber.e("deu ruim")
                }

            database.collection("events").document(docID).update ("mayBe", FieldValue.arrayRemove(userName), "declined", FieldValue.arrayRemove(userName))

        }

        holder.binding.maybeButton.setOnClickListener {

            database.collection("events").document(docID!!).update("mayBe", FieldValue.arrayUnion(userName)).addOnSuccessListener {
                    Timber.e("deu certo - $userName")
                setMayBe(holder)


                }.addOnFailureListener {
                    Timber.e("deu ruim")
                }

            database.collection("events").document(docID).update("confirmed", FieldValue.arrayRemove(userName), "declined", FieldValue.arrayRemove(userName))
        }

        holder.binding.declineButton.setOnClickListener {

            database.collection("events").document(docID!!).update("declined", FieldValue.arrayUnion(userName)).addOnSuccessListener {

                Timber.e("deu certo - $userName")

                setDeclined(holder)

                }.addOnFailureListener {

                Timber.e("deu ruim")
                }

            database.collection("events").document(docID).update("mayBe", FieldValue.arrayRemove(userName), "confirmed", FieldValue.arrayRemove(userName))
        }

        holder.eventRow.setOnClickListener {
            when (eventList[position].gameEvent){
                true -> Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragmentToDisplayGameFragment(eventList[position].docID!!))
                false -> Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragmentToDisplayEventFragment(eventList[position].docID!!))
            }
        }
    }

    private fun setConfirmed(holder: EventViewHolder){

        holder.confirmButton.setBackgroundResource(R.drawable.btn_rect_primary)
        holder.confirmButton.setTextColor(Color.WHITE)

        holder.maybeButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.maybeButton.setTextColor(Color.BLACK)

        holder.declineButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.declineButton.setTextColor(Color.BLACK)


    }

    private fun setMayBe(holder: EventViewHolder){

        holder.maybeButton.setBackgroundResource(R.drawable.btn_rect_primary)
        holder.maybeButton.setTextColor(Color.WHITE)

        holder.confirmButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.confirmButton.setTextColor(Color.BLACK)

        holder.declineButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.declineButton.setTextColor(Color.BLACK)
    }

    private fun setDeclined(holder: EventViewHolder){
        holder.declineButton.setBackgroundResource(R.drawable.btn_rect_primary)
        holder.declineButton.setTextColor(Color.WHITE)

        holder.maybeButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.maybeButton.setTextColor(Color.BLACK)

        holder.confirmButton.setBackgroundResource(android.R.drawable.btn_default)
        holder.confirmButton.setTextColor(Color.BLACK)

    }

    inner class EventViewHolder internal constructor(val binding: EventRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var eventRow = binding.eventRowCardView
        var mapView = binding.mapView
        var name = binding.eventName
        var placeName = binding.placeName
        var date = binding.eventDate
        var confirmButton = binding.confirmButton
        var maybeButton = binding.maybeButton
        var declineButton = binding.declineButton
        var eventTime = binding.eventTime
    }

}






