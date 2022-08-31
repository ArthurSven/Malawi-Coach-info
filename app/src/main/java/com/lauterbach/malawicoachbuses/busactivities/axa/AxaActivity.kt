package com.lauterbach.malawicoachbuses.busactivities.axa

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.lauterbach.malawicoachbuses.R

class AxaActivity : AppCompatActivity() {

    private lateinit var axaTabLayout: TabLayout
    private lateinit var axaViewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_axa)

        axaTabLayout = findViewById(R.id.axaTabs)
        axaViewPager = findViewById(R.id.axaviewpager)
        axaViewPager.adapter = AxaAdapter(this)
        TabLayoutMediator(axaTabLayout, axaViewPager){ tab, index ->
            tab.text = when(index){
                0 -> {"Home"}
                1 -> {"Departure"}
                2 -> {"Contact"}
                else -> {throw Resources.NotFoundException("Position not found")}
            }
        }.attach()
    }
}