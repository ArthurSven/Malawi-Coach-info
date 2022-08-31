package com.lauterbach.malawicoachbuses.busactivities.kwezy

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class KwezyAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> { KwezyHomeFragment()}
            1 -> { KwezyDepartureFragment()}
            2 -> {KwezyContactFragment()}
            3 -> {KwezyPriceFragment()}
            else -> {throw Resources.NotFoundException("Position Not found")}
        }
    }

    override fun getItemCount() = 3
}