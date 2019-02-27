package com.ddapps.itarugby.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.ddapps.itarugby.R


// TODO: CRIAR FRAGMENTO DO SOBRE

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)

    }

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Sobre o ItaRugby"
        super.onResume()
    }



}
