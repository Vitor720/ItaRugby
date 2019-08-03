package com.ddapps.itarugby.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.dd.CircularProgressButton
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.NewEventFragmentBinding
import com.ddapps.itarugby.models.Event
import com.ddapps.itarugby.models.PLACES
import com.ddapps.itarugby.pickers.ArriveEarlyTimePicker
import com.ddapps.itarugby.pickers.DatePickerFragment
import com.ddapps.itarugby.pickers.SecondTimePickerFragment
import com.ddapps.itarugby.pickers.TimePickerFragment
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.firestore.FirebaseFirestore
import com.rengwuxian.materialedittext.MaterialAutoCompleteTextView
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.HashMap


/** @author Vitor Vieira
 * Trocar  para um spinner  de dois digitos para melhorar o UI.
 *
 ***Refazer Algumas Coisas***
 * Caso seja criado um novo evento, se houver outro criado para mesma data, o novo irá substituir o antigo.
 */

class NewEventFragment : Fragment() {

    private lateinit var timePicker: TimePickerFragment
    private lateinit var secondTimePicker: SecondTimePickerFragment
    private lateinit var arriveEarlyTimePicker: ArriveEarlyTimePicker


    private val gamesQty = listOf(
        "1 jogo",
        "2 jogos",
        "3 jogos",
        "4 jogos",
        "5 jogos",
        "6 jogos"
    )

    lateinit var gameOpponents: MaterialAutoCompleteTextView

    private var places: MutableList<PLACES> = arrayListOf(PLACES())

    private val placesDisplay: MutableList<String> = arrayListOf()
    private val opponentsDisplay: MutableList<String> = arrayListOf()
    private lateinit var addEventButton: CircularProgressButton

    lateinit var binding: NewEventFragmentBinding
    private lateinit var placesButton: MaterialBetterSpinner
    private lateinit var timeButton: TextInputEditText
    private lateinit var dateButton: TextInputEditText

    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
    lateinit var event: Event

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Criação de Evento"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate<NewEventFragmentBinding>(inflater,
            R.layout.new_event_fragment, container, false)
        hideOpponentsSpinner()

        //TIME PICKER
        timeButton = binding.newEventTime
        setTimePicker(timeButton)


        // SECOND TIME PICKER
        val durationButton = binding.newEventDuration
        durationButton.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus){
                secondTimePicker = SecondTimePickerFragment()
                secondTimePicker.show(fragmentManager!!, "secondTimePicker")
            }
        }
        durationButton.setOnClickListener {
            secondTimePicker = SecondTimePickerFragment()
            secondTimePicker.show(fragmentManager!!, "secondTimePicker")
        }

        //ARRIVE EARLY TIME PICKER
        val arriveEarly = binding.arriveEarly
        arriveEarly.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus){
                arriveEarlyTimePicker = ArriveEarlyTimePicker()
                arriveEarlyTimePicker.show(fragmentManager!!, "arriveEarlyTimePicker")
            }
        }

        //DATE PICKER
        dateButton = binding.newEventDate
        dateButton.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                val datePicker = DatePickerFragment()
                datePicker.show(fragmentManager!!, "Date Picker")
            }
        }
        dateButton.setOnClickListener {
            val datePicker = DatePickerFragment()
            datePicker.show(fragmentManager!!, "Date Picker")
        }


        //PLACE'S POPUP MENU
        getPlaces()
        val adapterPlaces = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, placesDisplay)
        placesButton = binding.newEventPlace
        placesButton.setAdapter(adapterPlaces)


        //GAMES QTY POP MENU
        val adapterGamesQty = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, gamesQty)
        binding.gamesQuantity.setAdapter(adapterGamesQty)

        gameOpponents = binding.gamesQuantity

        //OPPONENTS POP MENU
        getOpponents()
        gameOpponents.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                showOpponents()
            }
        })

        //ADD EVENT TO SERVER button
        addEventButton = binding.addEventButton
        addEventButton.progress = 0
        addEventButton.setOnClickListener {
            addEventButton.progress = 50
            addEventButton.isIndeterminateProgressMode = true
            val handler = Handler()
            if (addEventButton.progress != 0){
                handler.postDelayed({
                    run{
                        setData()
                    }
                }, 1000)
            }

            val handlerTwo = Handler()
            handlerTwo.postDelayed({
                run {

                    clearFields()
                }
            },4000)
        }

        return binding.root
    }

    private fun setTimePicker(timeButton: TextInputEditText) {
        timeButton.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                timePicker = TimePickerFragment()
                timePicker.show(fragmentManager!!, "timePicker")
            }
        }

        timeButton.setOnClickListener {
            timePicker = TimePickerFragment()
            timePicker.show(fragmentManager!!, "timePicker")
        }
    }

    private fun clearFields(){
        addEventButton.isIndeterminateProgressMode = false
        addEventButton.idleText = "CRIAR NOVO EVENTO"
        addEventButton.progress = 0
        binding.newEventName.setText("")
        binding.newEventDate.setText("")
        binding.newEventTime.setText("")
        binding.newEventDuration.setText("")
        binding.newEventPlace.setText("")
        binding.arriveEarly.setText("")
        binding.gamesQuantity.setText("")
        binding.firstOpponent.setText("")
        binding.secondOpponent.setText("")
        binding.thirdOpponent.setText("")
        binding.forthOpponent.setText("")
        binding.fifthOpponent.setText("")
        binding.sixthOpponent.setText("")
        binding.newEventNotes.setText("")
        binding.newGameNotes.setText("")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    @SuppressLint("SimpleDateFormat")
    private fun setData(){

        for (location in places) {
            if (location.placeName == placesButton.text.toString() as String?) {

                val dateString = dateButton.text.toString()
                val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
                val dateFormat = simpleDateFormat.parse(dateString)


                val newEvent = HashMap<String, Any?>()
                newEvent["timeStamp"] = dateFormat
                newEvent["name"] = binding.newEventName.text.toString()
                newEvent["date"] = dateString
                newEvent["startTime"] = timeButton.text.toString()
                newEvent["endTime"] = binding.newEventDuration.text.toString()
                newEvent["notes"] = when (binding.newEventNotes.text.toString()) {
                    "" -> "Nenhuma nota adicional"
                    else -> binding.newGameNotes.text.toString()
                }

                newEvent["location"] = location.toMap()
                newEvent["arriveEarly"] = binding.arriveEarly.text.toString()
                newEvent["gamesQty"] = binding.gamesQuantity.text.toString()
                newEvent["gameNotes"] = when (binding.newGameNotes.text.toString()) {
                    "" -> "Nenhuma nota adicional"
                    else -> binding.newGameNotes.text.toString()
                }

                newEvent["firstOpponent"] = binding.firstOpponent.text.toString()
                newEvent["secondOpponent"] = binding.secondOpponent.text.toString()
                newEvent["thirdOpponent"] = binding.thirdOpponent.text.toString()
                newEvent["forthOpponent"] = binding.forthOpponent.text.toString()
                newEvent["fifthOpponent"] = binding.fifthOpponent.text.toString()
                newEvent["sixthOpponent"] = binding.sixthOpponent.text.toString()
//                newEvent["timeStamp"] =

                newEvent["gameEvent"] =  when (binding.gamesQuantity.text.toString()) {
                    "1 jogo" ->true
                    "2 jogos" ->true
                    "3 jogos"->true
                    "4 jogos"->true
                    "5 jogos"->true
                    "6 jogos" ->true
                    else ->false
                }

                newEvent["canceled"] = false
                newEvent["confirmed"] = ArrayList<String>()
                newEvent["mayBe"] = ArrayList<String>()
                newEvent["declined"] = ArrayList<String>()

                dataBase.collection("events").document(binding.dateEventID.text.toString()).set(newEvent).addOnCompleteListener {
                    if (it.isSuccessful){
                        Timber.e("Deu certo")
                        Timber.e("Certo ** location placename ${location.placeName}")
                        Timber.i("Certo ** placeButton text ${placesButton.text}")
                        Timber.e("Certo **  endereço${location.placeAdress}")

                        addEventButton.isIndeterminateProgressMode = false

                        addEventButton.progress = 100
                    } else {
                        addEventButton.isIndeterminateProgressMode = false

                        addEventButton.progress = -1
                    }
                }
                Toast.makeText(context!!, "Evento criado com sucesso!", Toast.LENGTH_LONG).show()
            } else {
                Timber.e("location placename ${location.placeName}")
                Timber.i("placeButton text ${placesButton.text}")
                Timber.e("endereço${location.placeAdress}")

            }
        }
    }

    private fun getOpponents(){
        val docOpponents = dataBase.collection("opponents")

        docOpponents.get().addOnCompleteListener { task ->
            Timber.e("Carregando oponentes para POP MEN")
            if (task.isSuccessful) {
                for (document in task.result!!) {
                    opponentsDisplay.add(document.id)
                    Timber.e("Deu certo: $opponentsDisplay")
                }
                opponentsDisplay.add("A definir")
            } else {
                Timber.e("Lista de locais está vazia!")
                Toast.makeText(context, "Lista de locais está vázia!!!", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun getPlaces() {
        val docPlaces = dataBase.collection("locations")

        docPlaces.get().addOnCompleteListener { task ->
            Timber.e("Carregando locais para POP MEN")
            if (task.isSuccessful) {
                for (document in task.result!!) {
                    val placeNow = document.toObject(PLACES::class.java)
                    placesDisplay.add(document.id)
//                    Timber.e("Documento id: ${document.id} com data = ${document.data}")
                    places.add(placeNow)
                }

            } else {
                Timber.e("Lista de locais está vazia!")
                Toast.makeText(context, "Lista de locais está vázia!!!", Toast.LENGTH_LONG).show()
            }

        }
    }

    private fun showOpponents(){

        when(gameOpponents.text.toString()){
            "1 jogo" -> showOneOpponent()
            "2 jogos" -> showTwoOpponents()
            "3 jogos" -> showTreeOpponents()
            "4 jogos" -> showFourOpponents()
            "5 jogos" -> showFiveOpponents()
            "6 jogos" -> showSixOpponents()
            else -> hideOpponentsSpinner()
        }
    }
    private fun showOneOpponent(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)


        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)
        binding.secondOpponent.visibility = View.GONE
        binding.thirdOpponent.visibility = View.GONE
        binding.forthOpponent.visibility = View.GONE
        binding.fifthOpponent.visibility = View.GONE
        binding.sixthOpponent.visibility = View.GONE

    }
    private fun showTwoOpponents(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)

        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)

        binding.secondOpponent.visibility = View.VISIBLE
        binding.secondOpponent.setAdapter(adapterOpponents)
        binding.thirdOpponent.visibility = View.GONE
        binding.forthOpponent.visibility = View.GONE
        binding.fifthOpponent.visibility = View.GONE
        binding.sixthOpponent.visibility = View.GONE

    }
    private fun showTreeOpponents(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)

        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)

        binding.secondOpponent.visibility = View.VISIBLE
        binding.secondOpponent.setAdapter(adapterOpponents)
        binding.thirdOpponent.visibility = View.VISIBLE
        binding.thirdOpponent.setAdapter(adapterOpponents)

        binding.forthOpponent.visibility = View.GONE
        binding.fifthOpponent.visibility = View.GONE
        binding.sixthOpponent.visibility = View.GONE

    }
    private fun showFourOpponents(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)

        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)

        binding.secondOpponent.visibility = View.VISIBLE
        binding.secondOpponent.setAdapter(adapterOpponents)
        binding.thirdOpponent.visibility = View.VISIBLE
        binding.thirdOpponent.setAdapter(adapterOpponents)
        binding.forthOpponent.visibility = View.VISIBLE
        binding.forthOpponent.setAdapter(adapterOpponents)

        binding.fifthOpponent.visibility = View.GONE
        binding.sixthOpponent.visibility = View.GONE
    }
    private fun showFiveOpponents(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)

        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)

        binding.secondOpponent.visibility = View.VISIBLE
        binding.secondOpponent.setAdapter(adapterOpponents)
        binding.thirdOpponent.visibility = View.VISIBLE
        binding.thirdOpponent.setAdapter(adapterOpponents)
        binding.forthOpponent.visibility = View.VISIBLE
        binding.forthOpponent.setAdapter(adapterOpponents)
        binding.fifthOpponent.visibility = View.VISIBLE
        binding.fifthOpponent.setAdapter(adapterOpponents)

        binding.sixthOpponent.visibility = View.GONE
    }
    private fun showSixOpponents(){
        val adapterOpponents = ArrayAdapter<String>(context!!, android.R.layout.simple_dropdown_item_1line, opponentsDisplay)

        binding.firstOpponent.visibility = View.VISIBLE
        binding.firstOpponent.setAdapter(adapterOpponents)

        binding.secondOpponent.visibility = View.VISIBLE
        binding.secondOpponent.setAdapter(adapterOpponents)
        binding.thirdOpponent.visibility = View.VISIBLE
        binding.thirdOpponent.setAdapter(adapterOpponents)
        binding.forthOpponent.visibility = View.VISIBLE
        binding.forthOpponent.setAdapter(adapterOpponents)
        binding.fifthOpponent.visibility = View.VISIBLE
        binding.fifthOpponent.setAdapter(adapterOpponents)
        binding.sixthOpponent.visibility = View.VISIBLE
        binding.sixthOpponent.setAdapter(adapterOpponents)


    }
    private fun hideOpponentsSpinner(){

        binding.firstOpponent.visibility = View.GONE
        binding.secondOpponent.visibility = View.GONE
        binding.thirdOpponent.visibility = View.GONE
        binding.forthOpponent.visibility = View.GONE
        binding.fifthOpponent.visibility = View.GONE
        binding.sixthOpponent.visibility = View.GONE

    }



}

