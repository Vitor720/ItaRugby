package com.ddapps.itarugby.ui

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class FirestoreRepository {

    val TAG = "FIREBASE_REPOSITORY"
    var firestoreDB = FirebaseFirestore.getInstance()
    var user = FirebaseAuth.getInstance().currentUser


//    // save  to firebase
//    fun saveAddressItem(addressItem: AddressItem): Task<Void> {
//        //var
//        var documentReference = firestoreDB.collection("users").document(user!!.email.toString())
//            .collection("saved_addresses").document(addressItem.addressId)
//        return documentReference.set(addressItem)
//    }

    fun getSponsors(): CollectionReference{
        return firestoreDB.collection("sponsors")
    }

    // get saved trophys from firebase

    fun getSavedTrophys(): CollectionReference {
        return firestoreDB.collection("trophys")
    }

    fun getTrophy(fileName: String): DocumentReference {
        return firestoreDB.collection("trophys").document(fileName)
    }

//    fun deleteAddress(trophyItem: Trophy): Task<Void> {
//        var documentReference =  firestoreDB.collection("trophys")
//            .document(trophyItem.trophyID!!)
//
//        return documentReference.delete()
//    }

}