package com.lauterbach.coachinfomalawi.Kwezy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.coachinfomalawi.R

class KwezyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kwezy)

        //Setting back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}