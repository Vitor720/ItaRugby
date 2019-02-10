package com.ddapps.itarugby


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ddapps.itarugby.databinding.FragmentPlaceRegisterBinding
import com.google.android.gms.common.api.Status
import com.google.android.gms.location.places.Place
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment
import com.google.android.gms.location.places.ui.PlaceSelectionListener
import timber.log.Timber


class PlaceRegisterFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        val binding = DataBindingUtil.inflate<FragmentPlaceRegisterBinding>(
            inflater,
            R.layout.fragment_place_register,
            container,
            false
        )

        val autocompleteFragment =
            fragmentManager?.findFragmentById(R.id.place_autocomplete_fragment) as PlaceAutocompleteFragment?

        autocompleteFragment?.setOnPlaceSelectedListener(object : PlaceSelectionListener {


            override fun onPlaceSelected(place: Place) {
                Toast.makeText(context, "Place name is: ${place.name}", Toast.LENGTH_LONG).show()
                Timber.e("Place é: ${place.name} and lat: ${place.latLng}")
            }

            override fun onError(status: Status) {
                Toast.makeText(context, "O erro é $status", Toast.LENGTH_LONG).show()

                Timber.e("deu ruim viado")
            }
        })

//
//        Places.GeoDataApi.getPlaceById(googleApiClient, placeId)
//            .setResultCallback(object : ResultCallback<PlaceBuffer>() {
//                override fun onResult(places: PlaceBuffer) {
//                    if (places.status.isSuccess) {
//                        val myPlace = places.get(0)
//                        val queriedLocation = myPlace.latLng
//                        Log.v("Latitude is", "" + queriedLocation.latitude)
//                        Log.v("Longitude is", "" + queriedLocation.longitude)
//                    }
//                    places.release()
//                }
//            })

        return binding.root

    }



}

