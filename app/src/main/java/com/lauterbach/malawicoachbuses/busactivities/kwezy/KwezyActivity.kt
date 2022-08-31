package com.lauterbach.malawicoachbuses.busactivities.kwezy

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.lauterbach.malawicoachbuses.R

class KwezyActivity : AppCompatActivity() {

    private lateinit var kwezyTabLayout: TabLayout
    private lateinit var kwezyViewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kwezy)

        kwezyTabLayout = findViewById(R.id.kwezyTabs)
        kwezyViewPager = findViewById(R.id.kwezyviewpager)

        kwezyViewPager.adapter = KwezyAdapter(this)
        TabLayoutMediator(kwezyTabLayout, kwezyViewPager){ tab, index ->
            tab.text = when(index){
                0 -> {"Home"}
                1 -> {"Departures"}
                2 -> {"Contacts"}
                3 -> {"Fares"}
                else -> {throw Resources.NotFoundException("Position not found")}
            }
        }.attach()
    }
}