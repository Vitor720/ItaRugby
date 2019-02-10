package com.ddapps.itarugby.models

import com.google.firebase.firestore.GeoPoint
import java.util.HashMap

class PLACES  {
//    private var id: String? = null
     var placeAdress: String? = null
     var placeDetails: String? = null

     var geoPoint: GeoPoint? = null
     var placeName: String? = null


    constructor()

    constructor( place_name: String, place_details: String, geo_point: GeoPoint, placeAdress: String){
        this.placeName = place_name
        this.placeDetails = place_details
        this.geoPoint = geo_point
        this.placeAdress = placeAdress

    }

    fun toMap(): Map<String, Any?> {
        val result = HashMap<String, Any?>()
//        result.put("id", id!!)
        result["placeName"] = placeName
        result["placeDetails"] = placeDetails
        result["geoPoint"] = geoPoint
        result["placeAdress"] = placeAdress

        return result
    }

    override fun toString(): String {
        return """
            $placeName
            $placeDetails
            $geoPoint
            $placeAdress

        """.trimIndent()
    }
}