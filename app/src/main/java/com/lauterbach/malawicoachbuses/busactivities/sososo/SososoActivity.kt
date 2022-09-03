package com.lauterbach.malawicoachbuses.busactivities.sososo

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.lauterbach.malawicoachbuses.R

class SososoActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sososo)

        val bottomNavigationView : BottomNavigationView
        val firstFragment = SososoHomeFragment()
        val secondFragment = SososoDepartureFragment()
        val thirdFragment = SososoContactFragment()
        val fourthFragment = SososoPriceFragment()

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.home -> setCurrentFragment(firstFragment)
                R.id.departure -> setCurrentFragment(secondFragment)
                R.id.contact -> setCurrentFragment(thirdFragment)
                R.id.fare -> setCurrentFragment(fourthFragment)
            }
            true
        }


    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.sososoFragment, fragment)
            commit()
        }
    }
}