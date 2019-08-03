package com.ddapps.itarugby.models

class Sponsors {

    var name: String? = null
    var url: String? = null

    constructor(){}

    constructor(name: String, url: String){
        this.name = name
        this.url = url
    }
}