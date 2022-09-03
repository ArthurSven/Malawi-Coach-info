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

        //Calling back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        //Initialising fragments
        val bottomNavigationView : BottomNavigationView
        val firstFragment = SososoHomeFragment()
        val secondFragment = SososoDepartureFragment()
        val thirdFragment = SososoContactFragment()
        val fourthFragment = SososoPriceFragment()

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        //Setting current fragment to default screen
        setCurrentFragment(firstFragment)

        //Setting bottom navigation to correspond with chosen fragment
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

    //Function to display current fragment
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.sososoFragment, fragment)
            commit()
        }
    }
}