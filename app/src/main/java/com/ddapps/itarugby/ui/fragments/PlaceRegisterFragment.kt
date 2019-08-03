package com.ddapps.itarugby.ui.fragments

import android.location.Address
import android.location.Geocoder
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ddapps.itarugby.R
import com.ddapps.itarugby.databinding.FragmentPlaceRegisterBinding
import com.ddapps.itarugby.models.PLACES
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import timber.log.Timber
import java.io.IOException
import java.util.*


class PlaceRegisterFragment : Fragment(), OnMapReadyCallback {

    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
    private lateinit var binding: FragmentPlaceRegisterBinding
    private lateinit var mapMarkerButton: Button
    private lateinit var placeRegisterButton: Button
    private lateinit var searchLocationEditText: TextInputEditText
    private lateinit var placeDetailsEditText: TextInputEditText
    private lateinit var placeNameEditText: TextInputEditText
    private lateinit var addressList: List<Address>
    private lateinit var locationLatLng: LatLng
    private lateinit var mMapView: MapView



    override fun onMapReady(map: GoogleMap) {

        var markerTapCounter = 0
        val defaultLocal = LatLng(-22.740806, -42.866389)


        /*
        * Verificar depois se locationLatLng = defaultLocal não vai ser chamado novamente caso o usuario saia do app
        * com o mapa marcado e volte e efeue o cadastro do local no sistema
        */
        locationLatLng = defaultLocal
        map.moveCamera(CameraUpdateFactory.newLatLng(defaultLocal))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(defaultLocal, 15.toFloat()))
        setMarkerPosition(map, defaultLocal, "Campo de Treino ItaRugby")


        mapMarkerButton.setOnClickListener {
            searchAddress(map)
        }

        placeRegisterButton.setOnClickListener {
            registerPlace()
            map.clear()
        }

        map.setOnMarkerClickListener {
            markerTapCounter += 1
            if (markerTapCounter % 2 == 0) {
                it.remove()
            }
            true

        }

        map.setOnMapLongClickListener {
            setMarkerPosition(map, it)
            locationLatLng = it
            Timber.e("Agora é LatLng é: $it")
        }
    }

    private fun setMarkerPosition(map: GoogleMap, latLng: LatLng, markerTitle: String = "Local Marcado"){
        map.addMarker(MarkerOptions().position(latLng).title(markerTitle))
    }

    private fun registerPlace() {
        val addressFromLatLng=  getCompleteAddressString(locationLatLng.latitude, locationLatLng.longitude)
        Timber.e("Endereço após converter da latitude é = $addressFromLatLng")


        val place = PLACES(placeNameEditText.text.toString(), placeDetailsEditText.text.toString(), GeoPoint(locationLatLng.latitude, locationLatLng.longitude), addressFromLatLng)

        try {
            dataBase.collection("locations").document(placeNameEditText.text.toString()).set(place).addOnSuccessListener {

                clearFields()

                Toast.makeText(context!!, "Local registrado com sucesso!", Toast.LENGTH_LONG).show()

            }
        } catch (e: Exception){

            if (placeNameEditText.text.toString() == ""){
                Toast.makeText(context!!, "Os Campos Nome e Detalhes são obrigatórios", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(context!!, "Erro ao Cadastrar Local!", Toast.LENGTH_LONG).show()
            }


        }


        }

    private fun clearFields() {
        placeDetailsEditText.setText("")
        placeNameEditText.setText("")
        searchLocationEditText.setText("")

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_place_register, container, false)
        mapMarkerButton = binding.mapMarkerButton
        placeRegisterButton = binding.registerPlaceButton
        mMapView = binding.registerMap
        placeNameEditText = binding.placesName
        placeDetailsEditText = binding.placeDetails
        searchLocationEditText = binding.searchLocation



        // *** IMPORTANT ***
        // MapView requires that the Bundle you pass contain _ONLY_ MapView SDK
        // objects or sub-Bundles.
        var mapViewBundle: Bundle? = null
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY)
        }
        mMapView.onCreate(mapViewBundle)

        mMapView.getMapAsync(this)

        placeRegisterButton.setOnClickListener {
            Timber.e("Botão ${placeRegisterButton.text} clicado!")
        }


        return binding.root
    }

    private fun getCompleteAddressString(LATITUDE: Double, LONGITUDE: Double): String {
        var streetAddress = ""
        val geocoder = Geocoder(context, Locale.getDefault())
        try {
            val addresses = geocoder.getFromLocation(LATITUDE, LONGITUDE, 1)
            if (addresses != null) {
                val returnedAddress = addresses[0]
                val strReturnedAddress = StringBuilder("")

                for (i in 0..returnedAddress.maxAddressLineIndex) {
                    strReturnedAddress.append(returnedAddress.getAddressLine(i)).append("\n")
                }
                streetAddress = strReturnedAddress.toString()
                Timber.w("My Current loction address $streetAddress")
            } else {
                Timber.w("No Address returned!")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Timber.w("Canont get Address!")
        }

        return streetAddress
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        var mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY)
        if (mapViewBundle == null) {
            mapViewBundle = Bundle()
            outState.putBundle(MAPVIEW_BUNDLE_KEY, mapViewBundle)
        }

        mMapView.onSaveInstanceState(mapViewBundle)

    }

    private fun searchAddress(map: GoogleMap) {

        val address = binding.searchLocation.text.toString()
        Timber.e("O Endereço é $address")

        Timber.e("!Botão ${placeRegisterButton.text} clicado!")
        val context = context
        val coder = Geocoder(context, Locale.getDefault())

        try {
            addressList = coder.getFromLocationName(address,1)
            val location = addressList[0]
            Timber.e(" a location é $location")

            locationLatLng = LatLng(location.latitude, location.longitude)

            setMarkerPosition(map, locationLatLng)

            map.moveCamera(CameraUpdateFactory.newLatLng(locationLatLng))

            Timber.e("$addressList")
        } catch (ex: IOException) {

            ex.printStackTrace()
        }
    }


    override fun onResume() {
        super.onResume()
        mMapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        mMapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mMapView.onStop()
    }


    override fun onPause() {
        mMapView.onPause()
        super.onPause()
    }

    override fun onDestroy() {
        mMapView.onDestroy()
        super.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mMapView.onLowMemory()
    }


    companion object {
        private val MAPVIEW_BUNDLE_KEY = "MapViewBundleKey"
    }

}