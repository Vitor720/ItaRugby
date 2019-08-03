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
import com.ddapps.itarugby.adapters.AgendaRecycler
import com.ddapps.itarugby.databinding.FragmentAgendaBinding
import com.ddapps.itarugby.models.Event
import com.github.fabtransitionactivity.SheetLayout
import com.google.firebase.firestore.FirebaseFirestore
import com.wangjie.androidbucket.utils.ABTextUtil
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionButton
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionHelper
import com.wangjie.rapidfloatingactionbutton.RapidFloatingActionLayout
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RFACLabelItem
import com.wangjie.rapidfloatingactionbutton.contentimpl.labellist.RapidFloatingActionContentLabelList
import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter
import timber.log.Timber
import java.util.*


class AgendaFragment : Fragment(), RapidFloatingActionContentLabelList.OnRapidFloatingActionContentLabelListListener<Any>, SheetLayout.OnFabAnimationEndListener {
    lateinit var binding: FragmentAgendaBinding
    private val  dataBase = FirebaseFirestore.getInstance()
    private val  currentTime = Calendar.getInstance().time!!
    lateinit var agendaRecycler: RecyclerView

    private var rfaLayout: RapidFloatingActionLayout? = null
    private var rfaBtn: RapidFloatingActionButton? = null
    private var rfabHelper: RapidFloatingActionHelper? = null
    lateinit var fabContent: RapidFloatingActionContentLabelList
    lateinit var sheetLayout: SheetLayout

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Agenda do Clube"
        super.onResume()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_agenda,  container, false)

        loadEvents()

        // floating action button
        sheetLayout = binding.bottomSheet
        sheetLayout.setFabAnimationEndListener(this)
        fabContent = RapidFloatingActionContentLabelList(context!!)
        fabContent.setOnRapidFloatingActionContentLabelListListener(this)
        rfaLayout = binding.agendaRfal
        rfaBtn = binding.agendaRfab

        val items: ArrayList<RFACLabelItem<Any>> = arrayListOf()
        items.add(RFACLabelItem<Any>().setLabel("Criar novo evento").setResId(R.drawable.icons8_calendar_plus_48)
            .setIconNormalColor(-10510688).setIconPressedColor(-16741493).setWrapper(0))

        fabContent.setItems(items).setIconShadowRadius(ABTextUtil.dip2px(context, 5F))
            .setIconShadowColor(-10510688).setIconShadowDy(ABTextUtil.dip2px(context, 5F))

        rfabHelper = RapidFloatingActionHelper(context, rfaLayout, rfaBtn, fabContent).build()
        binding.agendaRfal.bringToFront()

        return binding.root
    }

    private fun loadEvents(){
        agendaRecycler = binding.recyclerViewAgenda

        dataBase.collection("events").whereGreaterThan("timeStamp",  currentTime).get()
            .addOnSuccessListener { task ->
                if (task.isEmpty){
                    Toast.makeText(context!!, "Não existem evento a serem carregados", Toast.LENGTH_LONG).show()
                } else {

                    val eventList = mutableListOf<Event>()
                    for (document in task){
                        val event = document.toObject(Event::class.java)
                        event.docID = document.id
                        eventList.add(event)
                    }

                    Timber.e("Events list fora da interação: ${eventList.size}")
                    agendaRecycler.layoutManager = LinearLayoutManager(context)

                    // Recycler Animations
                    val alphaAdapter = AlphaInAnimationAdapter(AgendaRecycler(eventList, dataBase))
                    agendaRecycler.adapter = alphaAdapter.apply {
                        setDuration(720)
                    }

                }

            }
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }


    override fun onRFACItemLabelClick(position: Int, item: RFACLabelItem<Any>?) {
        Toast.makeText(context, "Clicou aqui: $position", Toast.LENGTH_SHORT).show()
        rfabHelper!!.toggleContent()
    }

    override fun onRFACItemIconClick(position: Int, item: RFACLabelItem<Any>?) {
        sheetLayout.setFab(binding.trasitionFab)
        sheetLayout.expandFab()
        sheetLayout.setFabAnimationEndListener(this)
        rfabHelper!!.toggleContent()

    }

    override fun onFabAnimationEnd() {
        findNavController().navigate(R.id.action_agendaFragment_to_newEventFragment)
    }



}
