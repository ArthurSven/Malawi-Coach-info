package com.lauterbach.coachinfomalawi.Axa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.coachinfomalawi.R

class AxaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_axa)

        //Setting back button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}