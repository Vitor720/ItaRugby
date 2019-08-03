package com.ddapps.itarugby.models

class Trophy {

    var trophyID: String? = null

    var trophyName: String? = null
    var trophyDate: String? = null
    var trophyDescription: String? = null
    var trophyPosition: Int? = null

    var trophyImage: Map<String, String>? = null

    var fileName: String? = null


    constructor(name: String, date: String, description: String, position: Int, trophyImage: Map<String, String>, trophyID: String){
        this.trophyID = trophyID
        this.trophyImage = trophyImage
        this.trophyPosition = position
        this.trophyName = name
        this.trophyDate = date
        this.trophyDescription = description
    }

    constructor()

}