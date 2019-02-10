package com.ddapps.itarugby.models

import com.google.firebase.firestore.GeoPoint
import com.google.firebase.firestore.ServerTimestamp
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

class Event {
    var docID: String? = null
    var name: String? = null
    var date: String? = null
    var location: PLACES? = null
    var userID: String? = null
    var notes: String? = null
    var startTime: String? = null
    var placeDetails: String? = null
    var endTime: String? = null
    @ServerTimestamp
    var timeStamp: Date? = null

    var confirmed: ArrayList<String>? = null
    var mayBe: ArrayList<String>? = null
    var declined: ArrayList<String>? = null



    var gamesQty: String? = null
    var opponents: ArrayList<String>? = null
    var arriveEarly: String? = null
    var gameNotes: String? = null


    var firstOpponent: String? = null
    var secondOpponent: String? = null
    var thirdOpponent: String? = null
    var forthOpponent: String? = null
    var fifthOpponent: String? = null
    var sixthOpponent: String? = null


    var canceled: Boolean = false
    var gameEvent: Boolean? = null



    constructor() {}


//    constructor(year: Int, month: Int, dayOfMonth: Int) {
//        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
//        val date = "$year/$month/$dayOfMonth"
//        val stringToDate = simpleDateFormat.parse(date)
//        this.date = stringToDate
//    }



    constructor(name: String, gameNotes: String, canceled: Boolean, date: String) {
        this.name = name
        this.gameNotes = gameNotes
        this.canceled = canceled
        this.date = date
//        this.place = place

    }

//    fun addDate(year: Int, month: Int, dayOfMonth: Int) {
//        val simpleDateFormat: SimpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
//        val date = "$year/$month/$dayOfMonth"
//        val stringToDate = simpleDateFormat.parse(date)
//        this.date = stringToDate
//    }

    fun addRest(name: String, gameNotes: String, canceled: Boolean) {
//        this.id = id
        this.name = name
        this.gameNotes = gameNotes
        this.canceled = canceled
//        this.place = place

    }

    fun toMap(): Map<String, Any> {
        val result = HashMap<String, Any>()
//        result.put("id", id!!)
        result.put("name", name!!)
        result.put("gameNotes", gameNotes!!)
        result.put("canceled", canceled)
        result.put("date", date!!)

//        result.put("pĺace", place!!)
        return result
    }
}
