package com.ddapps.itarugby.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.ddapps.itarugby.R
import com.ddapps.itarugby.adapters.TrophyRoomRecycler
import com.ddapps.itarugby.databinding.FragmentTrophyRoomBinding
import com.ddapps.itarugby.models.Trophy
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import timber.log.Timber


class TrophyRoomFragment : Fragment() {
    private lateinit var binding: FragmentTrophyRoomBinding
    val dataBase = FirebaseFirestore.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentTrophyRoomBinding>(inflater, R.layout.fragment_trophy_room, container, false)

        loadTrophys()

        return binding.root
    }

    private fun loadTrophys() {
        val trophyRecycler = binding.recyclerViewTrophyRoom

        dataBase.collection("trophys").get().addOnSuccessListener { task: QuerySnapshot ->
            if(task.isEmpty){
                Toast.makeText(context!!, "Não existem troféus a serem carregados", Toast.LENGTH_LONG).show()
            } else {
                val trophyList = mutableListOf<Trophy>()
                for (document in task){
                    val trophy = document.toObject(Trophy::class.java)
                    trophyList.add(trophy)
                }

                trophyRecycler.layoutManager = GridLayoutManager(context!!, 2)

                // Recycler Animations
                val alphaAdapter = AlphaInAnimationAdapter(TrophyRoomRecycler(trophyList)).apply { setDuration(720) }

                trophyRecycler.adapter = alphaAdapter
            }
        }
    }

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Sala de Troféus"
        super.onResume()
    }

}
