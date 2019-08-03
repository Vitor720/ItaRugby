package com.ddapps.itarugby.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentSponsorsBinding
import com.ddapps.itarugby.databinding.ItemSliderImageBinding
import com.ddapps.itarugby.ui.FirestoreViewModel


class SponsorsFragment : Fragment() {

    private lateinit var binding: FragmentSponsorsBinding
    private lateinit var fireStoreViewModel: FirestoreViewModel

    override fun onCreateView(       inflater: LayoutInflater, container: ViewGroup?,       savedInstanceState: Bundle?   ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sponsors, container, false)
        fireStoreViewModel =  ViewModelProviders.of(this).get(FirestoreViewModel::class.java)

        loadSponsors()

        return binding.root
    }

    private fun loadSponsors() {
        val sponsorsRecycler = binding.recyclerViewSponsors

        fireStoreViewModel.getSavedSponsors().observe(this, Observer {



            for (i in it){


            }
        })




    }


}
