package com.ddapps.itarugby.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.ddapps.itarugby.models.Sponsors
import com.ddapps.itarugby.models.Trophy
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.QuerySnapshot
import timber.log.Timber
import javax.annotation.meta.When

class FirestoreViewModel : ViewModel(){

    val TAG = "FIRESTORE_VIEW_MODEL"
    var firebaseRepository = FirestoreRepository()
    var savedTrophys : MutableLiveData<List<Trophy>> = MutableLiveData()
    var savedSponsors: MutableLiveData<List<Sponsors>> = MutableLiveData()

//    // save address to firebase
//    fun saveAddressToFirebase(trophyItem: Trophy){
//        firebaseRepository.saveAddressItem(trophyItem).addOnFailureListener {
//            Timber.e(TAG,"Failed to save Address!")
//        }
//    }

    // get realtime updates from firebase regarding saved Trophys
    fun getSavedTrophys(): LiveData<List<Trophy>> {
        firebaseRepository.getSavedTrophys().addSnapshotListener(EventListener<QuerySnapshot> { value, e ->
            if (e != null) {
                Timber.e("Listen trophy's failed. $e" )
                savedTrophys.value = null
                return@EventListener
            }

            var savedTrophysList : MutableList<Trophy> = mutableListOf()
            for (doc in value!!) {
                var trophyItem = doc.toObject(Trophy::class.java)
                savedTrophysList.add(trophyItem)
            }
            savedTrophys.value = savedTrophysList
        })

        return savedTrophys
    }

    fun getSavedSponsors(): LiveData<List<Sponsors>> {
        firebaseRepository.getSponsors().addSnapshotListener(EventListener<QuerySnapshot> { value, e ->

            if (e != null){
                Timber.e("Listen sponsors failed. $e" )
                savedSponsors.value = null
                return@EventListener
            }
            var savedSponsorsList : MutableList<Sponsors> = mutableListOf()
            for (doc in value!!) {
                var sponsor = doc.toObject(Sponsors::class.java)
                savedSponsorsList.add(sponsor)
            }
            savedSponsors.value = savedSponsorsList
        })

        return savedSponsors
    }



    // delete an address from firebase
//    fun deleteAddress(addressItem: Trophy){
//        firebaseRepository.deleteAddress(addressItem).addOnFailureListener {
//            Timber.e(TAG,"Failed to delete Address")
//        }
//    }

}