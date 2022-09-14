package com.lauterbach.coachinfomalawi.sososo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lauterbach.coachinfomalawi.R

class SososoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sososo)

        //Setting up the back to home screen button
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}