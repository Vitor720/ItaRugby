package com.ddapps.itarugby.models

import com.google.firebase.firestore.GeoPoint
import java.util.HashMap

class PLACES  {
//    private var id: String? = null
     var placeAddress: String? = null
     var placeDetails: String? = null

     var geoPoint: GeoPoint? = null
     var placeName: String? = null


    constructor()

    constructor( placeName: String, placeDetails: String, geoPoint: GeoPoint, placeAddress: String){
        this.placeName = placeName
        this.placeDetails = placeDetails
        this.geoPoint = geoPoint
        this.placeAddress = placeAddress

    }

    fun toMap(): Map<String, Any?> {
        val result = HashMap<String, Any?>()
//        result.put("id", id!!)
        result["placeName"] = placeName
        result["placeDetails"] = placeDetails
        result["geoPoint"] = geoPoint
        result["placeAddress"] = placeAddress

        return result
    }

    override fun toString(): String {
        return """
            $placeName
            $placeDetails
            $geoPoint
            $placeAddress

        """.trimIndent()
    }
}