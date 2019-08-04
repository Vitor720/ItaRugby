package com.ddapps.itarugby.ui.fragments

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentDisplayEventBinding
import com.ddapps.itarugby.models.Event
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

class DisplayEventFragment : Fragment() {
    private lateinit var binding: FragmentDisplayEventBinding
    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
    private lateinit var event: Event

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Evento"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display_event, container, false)
        val screen_width = resources.displayMetrics.widthPixels
        val screen_heigh = resources.displayMetrics.heightPixels

        val args = DisplayEventFragmentArgs.fromBundle(arguments)
        val docId = args.docID

        dataBase.collection("events").document(docId).get().addOnSuccessListener {document ->
            displayEventUi(document, screen_width, screen_heigh)
        }

        return binding.root
    }

    private fun displayEventUi( document: DocumentSnapshot,  screen_width: Int,  screen_heigh: Int ) {
        event = document.toObject(Event::class.java)!!
        val image = binding.eventMapView
        val lat = event.location!!.geoPoint!!.latitude
        val lng = event.location!!.geoPoint!!.longitude

        loadStaticMapImage(screen_width, screen_heigh, lat, lng, image)

        // Cria OnClickListener para a static map image
        setMapOnClickListener(image, lat, lng)

        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR"))
        val dateFormat = simpleDateFormat.parse(event.date)
        val fullDate = SimpleDateFormat("EEEE, d MMMM", Locale("pt", "BR")).format(dateFormat).toUpperCase()


//        binding.eventLocation.text = "${event.location!!.placeName} - ${event.location!!.placeDetails}"
//        binding.eventFullDate.text = fullDate
//        binding.eventStartEnd.text = "${event.startTime} - ${event.endTime}"
        binding.eventArriveTime.text = event.arriveEarly
        binding.eventAddress.text = event.location!!.placeAdress
        binding.eventDescription.text = event.gameNotes
        binding.eventDate.text = fullDate
        binding.placeName.text = event.location!!.placeName



        binding.confirmedList.text = if (event.confirmed!!.size == 0) {
            "Nenhum jogador confirmou presença"
        } else {
            event.confirmed.toString()
        }

        binding.declineList.text = if (event.declined!!.size == 0) {
            "Nenhum jogador confirmou a falta"
        } else {
            event.declined.toString()
        }

        binding.mayBeList.text = if (event.mayBe!!.size == 0) {
            "Nenhum jogador informou que talvez compareça"
        } else {
            event.mayBe.toString()
        }


    }

    private fun setMapOnClickListener(image: ImageView, lat: Double, lng: Double) {
        image.setOnClickListener {
            val zoom = 16
            val uri = "geo:$lat,$lng?z=$zoom"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intent.setPackage("com.google.android.apps.maps")
            try {
                context!!.startActivity(intent)
            } catch (ex: ActivityNotFoundException) {
                try {
                    val unrestrictedIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                    context!!.startActivity(unrestrictedIntent)
                } catch (innerEx: ActivityNotFoundException) {
                    Toast.makeText(context!!, "Please install a maps application", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun loadStaticMapImage( screen_width: Int, screen_heigh: Int, lat: Double, lng: Double,  image: ImageView ) {
        var url = "https://maps.googleapis.com/maps/api/staticmap?"
        url += "&zoom=16"
        url += "&size=${Integer.toString(screen_width - 10)}x${Integer.toString(screen_heigh / 8)}"
        url += "&maptype=terrain"
        url += "&markers=color:orange%7Clabel:Lugar%7C$lat, $lng"
        url += ""
        Glide.with(context!!).load(url).into(image)
    }

}
