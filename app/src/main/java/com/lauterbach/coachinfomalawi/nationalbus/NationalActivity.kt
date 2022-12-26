package com.lauterbach.coachinfomalawi.nationalbus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.coachinfomalawi.R

class NationalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_national)

        //Setting up the back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}