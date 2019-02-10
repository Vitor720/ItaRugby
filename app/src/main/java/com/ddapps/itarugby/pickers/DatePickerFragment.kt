package com.ddapps.itarugby.pickers

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import com.ddapps.itarugby.R
import java.util.*

/**
 * Classe que mostra o Calendário
 * Não está colocando dois digitos para minutos.
 * Se selecionar 16:05 vai aparecer 16:5
 ***Refazer***
 */



class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {

    private lateinit var calendar: Calendar

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Initialize a calendar instance
        calendar = Calendar.getInstance()

        // Get the system current date
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Initialize a new date picker dialog and return it
        return DatePickerDialog(
            context!!, // Context
            // Put 0 to system default theme or remove this parameter
            this, // DatePickerDialog.OnDateSetListener
            year, // Year
            month, // Month of year
            day // Day of month
        )
    }

    // When date set and press ok button in date picker dialog
    @SuppressLint("SetTextI18n")
    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {

        // Display the selected date in text view
        val dateEventID = activity!!.findViewById<View>(R.id.dateEventID) as TextView

        val editText = activity!!.findViewById<View>(R.id.new_event_date) as TextView

        editText.text = "$day/${month + 1}/$year"
        dateEventID.text = "$day-${month+ 1}-$year"


    }

}

