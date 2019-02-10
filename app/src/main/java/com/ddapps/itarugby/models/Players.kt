package com.ddapps.itarugby.models

import com.google.firebase.firestore.ServerTimestamp
import java.util.*

class Players {
    var uID: String? = null
    var name: String? = null
    var weight: Int? = null
    var hight: Int? = null
    var position: String? = null
    var gamesPlayed: Int? = null
    var drillsAttended: Int? = null

    var playerSince: String? = null
    var injured: Boolean? = null
    var yellowCards: Int? = null
    var redCards: Int? = null
    var activePlayer: Boolean? = null
    var lastDrill: String? = null
    var photo: String? = null
    var born: String? = null
    var contact: String? = null

    constructor() {}

    constructor(name: String, weight: Int, hight: Int, position: String, gamesPlayed: Int, drillsAttended: Int, playerSince: String, injured: Boolean, yellowCards: Int, redCards: Int) {
        this.name = name
        this.weight = weight
        this.hight = hight
        this. position = position
        this.gamesPlayed = gamesPlayed
        this.drillsAttended = drillsAttended
        this.playerSince = playerSince
        this.injured = injured
        this.yellowCards = yellowCards
        this.redCards = redCards
    }


}