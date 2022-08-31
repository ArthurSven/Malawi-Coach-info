package com.lauterbach.malawicoachbuses.busactivities.axa

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AxaAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
      return when(position){
          0 -> { homeFragment() }
          1 -> { DepartureFragment() }
          2 -> { contactFragment() }
          else -> {throw Resources.NotFoundException("Position not found")}
      }
    }

    override fun getItemCount() = 3
}