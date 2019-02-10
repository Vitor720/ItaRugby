package com.ddapps.itarugby.pickers

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import com.ddapps.itarugby.R
import java.util.*


class SecondTimePickerFragment: DialogFragment(), TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(
            activity, // Context
            this, // Listener
            hour, // hourOfDay
            minute, // Minute
            true // is24HourView
        )

    }

    @SuppressLint("SetTextI18n")
    override fun onTimeSet(view: TimePicker, hourOfDay: Int, minute: Int) {
        val txtViewButton = activity!!.findViewById<View>(R.id.new_event_duration) as TextView
        // do something with selected time

        txtViewButton.text = String.format("%02d:%02d", hourOfDay, minute)


    }



}
