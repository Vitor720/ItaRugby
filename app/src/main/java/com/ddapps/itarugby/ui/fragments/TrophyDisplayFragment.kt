package com.ddapps.itarugby.ui.fragments


import android.app.Activity
import android.content.Context
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.ddapps.itarugby.R
import com.ddapps.itarugby.adapters.AdapterImageSlider
import com.ddapps.itarugby.databinding.FragmentTrophyDisplayBinding
import com.ddapps.itarugby.util.load
import com.ddapps.itarugby.models.Trophy
import com.ddapps.itarugby.ui.FirestoreViewModel
import kotlinx.android.synthetic.main.fragment_trophy_display.*
import kotlinx.android.synthetic.main.item_slider_image.view.*
import java.util.ArrayList

class TrophyDisplayFragment : Fragment() {

    lateinit var binding: FragmentTrophyDisplayBinding
    private var trophy = Trophy()
    private lateinit var pager: ViewPager
    private lateinit var layoutDots: LinearLayout
    private lateinit var adapterImageSlider: AdapterImageSlider
    private lateinit var trophyID: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,  savedInstanceState: Bundle? ): View? {

        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_trophy_display, container, false)

        val fireStoreViewModel =  ViewModelProviders.of(this).get(FirestoreViewModel::class.java)

        //Get the trophyID from bundle args and save it in a variable
        val args = TrophyDisplayFragmentArgs.fromBundle(arguments)
        trophyID = args.trophyID

        //Uses ViewModel to get the trophy object matching its ID and loads it to the screen
        fireStoreViewModel.getSavedTrophys().observe(this, Observer {
            for (i in it){
                if (i.fileName == trophyID){
                    binding.trophyName.text = i.trophyName
                    binding.trophyDate.text = i.trophyDate
                    binding.trophyDescription.text = i.trophyDescription
                    val imageList = mutableListOf<String>()
                    imageList.addAll(i.trophyImage!!.map { x -> x.value })

                    initComponent(imageList)
                }
            }
        })

        return binding.root
    }


    private fun initComponent(listOfImages: MutableList<String>) {
        layoutDots  = binding.layoutDots
        pager = binding.pager
        adapterImageSlider = AdapterImageSlider(this.activity!!, listOfImages)

//        adapterImageSlider.setItems(listOfImages)
        pager.adapter = adapterImageSlider

        // displaying selected image first
        pager.currentItem = 0
        addBottomDots(layoutDots, adapterImageSlider.count, 0)
        pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(pos: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(pos: Int) {
                addBottomDots(layout_dots, adapterImageSlider.count, pos)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })
    }

    private fun addBottomDots(layout_dots: LinearLayout, size: Int, current: Int) {
        val dots = arrayOfNulls<ImageView>(size)

        layout_dots.removeAllViews()
        for (i in dots.indices) {
            dots[i] = ImageView(context!!)
            val width_height = 15
            val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams(width_height, width_height))
            params.setMargins(10, 10, 10, 10)
            dots[i]!!.layoutParams = params
            dots[i]!!.setImageResource(R.drawable.shape_circle)
            dots[i]!!.setColorFilter(ContextCompat.getColor(context!!, R.color.overlay_dark_10), PorterDuff.Mode.SRC_ATOP)
            layout_dots.addView(dots[i])
        }

        if (dots.isNotEmpty()) {
            dots[current]!!.setColorFilter(
                ContextCompat.getColor(context!!, R.color.colorPrimaryLight),
                PorterDuff.Mode.SRC_ATOP
            )
        }
    }

    override fun onResume() {
        (activity as AppCompatActivity).supportActionBar?.title = "Informações da conquista"
        super.onResume()
    }

}
