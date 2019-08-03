package com.ddapps.itarugby.models

class Confirmation {

    var name: String? = null
    var confirmation: Int? = null

    constructor(){}

    constructor(confirmation: Int){
        this.confirmation = confirmation
    }

    constructor(name: String, confirmation: Int){
        this.name = name
        this.confirmation = confirmation
    }
}