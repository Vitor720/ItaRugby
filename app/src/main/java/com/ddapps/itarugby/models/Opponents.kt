package com.ddapps.itarugby.models

class Opponents{
    var name: String? = null
    var city: String? = null

    constructor(){}

    constructor(name: String, city: String){
        this.name = name
        this.city = city
    }
}