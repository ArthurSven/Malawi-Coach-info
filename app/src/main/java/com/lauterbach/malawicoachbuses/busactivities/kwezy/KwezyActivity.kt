package com.lauterbach.malawicoachbuses.busactivities.kwezy


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.lauterbach.malawicoachbuses.R
import com.lauterbach.malawicoachbuses.busactivities.axa.DepartureFragment
import com.lauterbach.malawicoachbuses.busactivities.axa.contactFragment
import com.lauterbach.malawicoachbuses.busactivities.axa.homeFragment
import com.lauterbach.malawicoachbuses.busactivities.axa.priceFragment

class KwezyActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kwezy)

        //Setting back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
//Initialising fragments
        val firstFragment = KwezyHomeFragment()
        val secondFragment = KwezyDepartureFragment()
        val thirdFragment = KwezyContactFragment()
        val fourthFragment = KwezyPriceFragment()

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)

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
            replace(R.id.kwezyFragment, fragment)
            commit()
        }
    }
}