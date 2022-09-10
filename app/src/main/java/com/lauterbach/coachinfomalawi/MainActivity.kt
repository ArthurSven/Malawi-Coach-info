package com.lauterbach.coachinfomalawi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Indexing Fragments
        val firstFragment = BusFragment()
        val secondFragment = DepartureFragment()
        val thirdFragment = DepotFragment()

        //Calling bottom nav
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_nav_menu)

            //Setting default screen Fragment
        setCurrentFragment(firstFragment)

        /*Setting fragments to appear based on
         selected bottom nav item */
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.buses -> setCurrentFragment(firstFragment)
                R.id.departures -> setCurrentFragment(secondFragment)
                R.id.depots -> setCurrentFragment(thirdFragment)
            }; true
        }




    }
    //Function to display current fragment
    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.busFragment, fragment)
            commit()
        }
    }
}