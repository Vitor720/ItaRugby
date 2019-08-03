package com.ddapps.itarugby.ui.fragments//        dataBase.collection()


import android.annotation.SuppressLint
import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentDisplayGameBinding
import com.ddapps.itarugby.models.Event
import com.google.firebase.firestore.FirebaseFirestore
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

class DisplayGameFragment : Fragment() {
    private lateinit var binding: FragmentDisplayGameBinding
    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
    private lateinit var event: Event


    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Evento"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_display_game, container, false)
        val screen_width = resources.displayMetrics.widthPixels
        val screen_heigh = resources.displayMetrics.heightPixels

        val args = DisplayEventFragmentArgs.fromBundle(arguments)
        val docId = args.docID

        dataBase.collection("events").document(docId).get().addOnSuccessListener { document ->
            if (document != null) {
                event = document.toObject(Event::class.java)!!
                val lat = event.location!!.geoPoint!!.latitude
                val lng = event.location!!.geoPoint!!.longitude
                val image = binding.eventMapView

                // cerrega o static map do local
                var url = "https://maps.googleapis.com/maps/api/staticmap?"
                url += "&zoom=16"
                url += "&size=${Integer.toString(screen_width - 10)}x${Integer.toString(screen_heigh / 8)}"
                url += "&maptype=roadmap"
                url += "&markers=color:orange%7Clabel:Lugar%7C$lat, $lng"
                url += "&key=AIzaSyDIB97Qpy6IIfJ1lI8DRKJUStzIIjAO1dA"
                Glide.with(Activity()).load(url).into(image)


                // Abre Goole Maps
                image.setOnClickListener {
                    val zoom  = 16
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
                            Toast.makeText(context!!, "", Toast.LENGTH_LONG).show()
                        }

                    }
                }

                // Coloca a data em formato por extenso
                val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR"))
                val dateFormat = simpleDateFormat.parse(event.date)
                val fullDate = SimpleDateFormat("EEEE, d MMMM", Locale("pt", "BR")).format(dateFormat).toUpperCase()


                Timber.e("Tamanho da confirmed list é ${event.confirmed!!.size}")
                Timber.e("Tamanho da declined list é ${event.declined!!.size}")

                // carrega o evento no UI

                binding.eventFullDate.text = fullDate
                binding.eventStartEnd.text = "${event.startTime} - ${event.endTime}"
                binding.eventArriveTime.text = event.arriveEarly
                binding.displayEventAdress.text = event.location!!.placeAdress
                binding.displayEventNotes.text = event.notes

                when (event.gamesQty.toString()) {
                    "1 jogo" -> showOneOpponent()
                    "2 jogos" -> showTwoOpponents()
                    "3 jogos" -> showTreeOpponents()
                    "4 jogos" -> showFourOpponents()
                    "5 jogos" -> showFiveOpponents()
                    "6 jogos" -> showSixOpponents()
                }

                binding.confirmedList.text = if (event.confirmed!!.size == 0){
                    "Nenhum jogador confirmou presença"
                } else {
                    event.confirmed.toString()
                }

                binding.declineList.text = if (event.declined!!.size == 0){
                    "Nenhum jogador confirmou a falta"
                } else {
                    event.declined.toString()
                }

                binding.mayBeList.text = if (event.mayBe!!.size == 0){
                    "Nenhum jogador informou que talvez compareça"
                } else {
                    event.mayBe.toString()
                }

            } else {
                Timber.e("Não funcionou o load map")
            }
        }
        Timber.e("Passou do primeiro DB")


        return binding.root
    }


    @SuppressLint("SetTextI18n")
    private fun showOneOpponent() {
        binding.games.text = "Primeiro adversário: ${event.firstOpponent}"

    }

    @SuppressLint("SetTextI18n")
    private fun showTwoOpponents() {
        binding.games.text =
                "Primeiro adversário: ${event.firstOpponent} \nSegundo Adversário: ${event.secondOpponent}"

    }

    @SuppressLint("SetTextI18n")
    private fun showTreeOpponents() {
        binding.games.text =
                "Primeiro adversário: ${event.firstOpponent} \nSegundo Adversário: ${event.secondOpponent} \nTerceiro adversário:${event.thirdOpponent}"

    }

    @SuppressLint("SetTextI18n")
    private fun showFourOpponents() {
        binding.games.text = "Primeiro adversário: ${event.firstOpponent} " +
                "\nSegundo Adversário: ${event.secondOpponent}" +
                "\nTerceiro adversário:${event.thirdOpponent}" +
                "\nQuarto adversário: ${event.forthOpponent}"
    }

    @SuppressLint("SetTextI18n")
    private fun showFiveOpponents() {
        binding.games.text = "Primeiro adversário: ${event.firstOpponent}  \n" +
                "Segundo Adversário: ${event.secondOpponent}" +
                "\nTerceiro adversário:${event.thirdOpponent}" +
                "\nQuarto adversário: ${event.forthOpponent}" +
                "\nQuinto adversário:${event.fifthOpponent}"

    }

    @SuppressLint("SetTextI18n")
    private fun showSixOpponents() {
        binding.games.text = "Primeiro adversário: ${event.firstOpponent} " +
                "\nSegundo Adversário: ${event.secondOpponent}" +
                "\nerceiro adversário :${event.thirdOpponent}" +
                "\nQuarto adversário: ${event.forthOpponent}" +
                "\nQuinto adversário:${event.fifthOpponent}" +
                "\nSexo adversário: ${event.sixthOpponent}"


    }


}
