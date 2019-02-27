package com.ddapps.itarugby.ui.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ddapps.itarugby.R
import com.ddapps.itarugby.adapters.EventViewRecycler
import com.ddapps.itarugby.databinding.FragmentHomeBinding
import com.ddapps.itarugby.models.Event
import com.ddapps.itarugby.models.Players
import com.github.fabtransitionactivity.SheetLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ListenerRegistration
import com.google.firebase.firestore.Query
import com.wangjie.androidbucket.utils.ABTextUtil
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import timber.log.Timber
import java.util.*


class HomeFragment : Fragment(), RapidFloatingActionContentLabelList.OnRapidFloatingActionContentLabelListListener<Any>, SheetLayout.OnFabAnimationEndListener  {


    private var dataBase: FirebaseFirestore = FirebaseFirestore.getInstance()
    private lateinit var binding: FragmentHomeBinding
    private var firestoreListener: ListenerRegistration? = null
    private val currentTime = Calendar.getInstance().time!!
    var userName: String? = null

    private var rfaLayout: RapidFloatingActionLayout? = null
    private var rfaBtn: RapidFloatingActionButton? = null
    private var rfabHelper: RapidFloatingActionHelper? = null
    lateinit var fabContent: RapidFloatingActionContentLabelList
    lateinit var sheetLayout: SheetLayout
    lateinit var homeRecycler : RecyclerView
    var fabItemClicked: Int? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        // floating action button
        sheetLayout = binding.bottomSheet
        sheetLayout.setFabAnimationEndListener(this)
        fabContent = RapidFloatingActionContentLabelList(context!!)
        fabContent.setOnRapidFloatingActionContentLabelListListener(this)
        rfaLayout = binding.activityMainRfal
        rfaBtn = binding.activityMainRfab

        val items: ArrayList<RFACLabelItem<Any>> = arrayListOf()

        // Adiciona os icones do fab
        items.add(RFACLabelItem<Any>().setLabel("Cadastrar novo local").setResId(R.drawable.icon_location_48)
            .setIconNormalColor(-10510688).setIconPressedColor(-16741493).setWrapper(0))

        items.add(RFACLabelItem<Any>().setLabel("Criar novo evento").setResId(R.drawable.icons8_calendar_plus_48)
            .setIconNormalColor(-10510688).setIconPressedColor(-16741493).setWrapper(1))

        items.add(RFACLabelItem<Any>().setLabel("Cadastrar novo jogador").setResId(R.drawable.icons8_rugby_sevens_48)
            .setIconNormalColor(-10510688).setIconPressedColor(-16741493).setWrapper(3))

        fabContent.setItems(items).setIconShadowRadius(ABTextUtil.dip2px(context, 5F))
            .setIconShadowColor(-10510688).setIconShadowDy(ABTextUtil.dip2px(context, 5F))

        rfabHelper = RapidFloatingActionHelper(context, rfaLayout, rfaBtn, fabContent).build()
        binding.activityMainRfal.bringToFront()


        getUserName()
        loadEvents()

        setHasOptionsMenu(true)
        return binding.root

        TODO("As informações das telas estão sendo atualizadas quando as telas são re abertas, sem necessidade real do real time, que consome bastante reads do banco")
        //REAL TIME DATA
        //        firestoreListener = dataBase.collection("teste").whereEqualTo("canceled", false)
        //            .addSnapshotListener(EventListener { documentSnapshots, e ->
        //                if (e != null) {
        //                    Timber.e("Listen failed! $e")
        //                    return@EventListener
        //                }
        //                val eventList = mutableListOf<Event>()
        //;/
        //                for (doc in documentSnapshots!!) {
        //                    val event = doc.toObject(Event::class.java)
        //                    event.docID = doc.id
        //
        //                    eventList.add(event)
        //                    Timber.i("${eventList.size} eventos serão carregados")
        //
        //                }
        ////                binding.recyclerViewHome.layoutManager = LinearLayoutManager(this.context)
        ////
        ////                binding.recyclerViewHome.itemAnimator = DefaultItemAnimator()
        //                binding.recyclerViewHome.adapter = EventViewRecycler(eventList, dataBase, userId)
        //            })

    }

    private fun getUserName() {
        val userId = FirebaseAuth.getInstance().currentUser!!.uid
        Timber.e("UserId = $userId")
        dataBase.collection("male_team").whereEqualTo("uID", userId).get().addOnCompleteListener {
            if (it.isSuccessful) {
                if (it.result?.size() != 0) {
                    val playerData = it.result!!.toObjects(Players::class.java)
                    userName = playerData[0].name
                } else {
                    Toast.makeText(context!!, "Falta cadastro na equipe", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    private fun loadEvents() {
        homeRecycler = binding.recyclerViewHome
        val screenWidth = resources.displayMetrics.widthPixels
        val screenHeight = resources.displayMetrics.heightPixels

        dataBase.collection("events").whereGreaterThan("timeStamp", currentTime)
            .orderBy("timeStamp", Query.Direction.ASCENDING).get()
            .addOnSuccessListener { task ->
                if (task.isEmpty) {
                    Toast.makeText(context, "Sem eventos futuros", Toast.LENGTH_LONG).show()
                    Timber.i("Lista de eventos FUTUROS está vazia!")
                } else {
                    val eventList = mutableListOf<Event>()
                    for (document in task) {
                        val event = document.toObject(Event::class.java)
                        event.docID = document.id
                        eventList.add(event)
                    }

                    homeRecycler.layoutManager = LinearLayoutManager(this.context)
                    // Recycler Animations
                    val alphaAdapter = AlphaInAnimationAdapter(
                        EventViewRecycler(
                            eventList,
                            dataBase,
                            userName,
                            screenWidth,
                            screenHeight
                        )
                    ).apply {
                        setDuration(720)
                    }
                    homeRecycler.adapter = alphaAdapter
                }
            }
    }

    override fun onDestroy() {
        super.onDestroy()
//        firestoreListener!!.remove()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Home"
        super.onResume()
    }

    override fun onRFACItemLabelClick(position: Int, item: RFACLabelItem<Any>?) {
        Timber.i("Clicou aqui: $position")
        rfabHelper!!.toggleContent()
    }

    override fun onRFACItemIconClick(position: Int, item: RFACLabelItem<Any>?) {
        Timber.e("Clicou aqui: $position")
        Toast.makeText(context, "Clicou aqui: $position", Toast.LENGTH_SHORT).show()
        fabItemClicked = position
        sheetLayout.setFab(binding.trasitionFab)
        sheetLayout.expandFab()
        sheetLayout.setFabAnimationEndListener(this)
        rfabHelper!!.toggleContent()
    }

    override fun onFabAnimationEnd() {

        when (fabItemClicked) {

            0 -> findNavController().navigate(R.id.action_homeFragment_to_placeRegisterFragment)
            1 -> findNavController().navigate(R.id.action_homeFragment_to_newEventFragment)
            2 -> findNavController().navigate(R.id.action_homeFragment_to_registerPlayerFragment)

            else -> Timber.e("Algo está errado, não foi passada int")

        }


    }

}



































