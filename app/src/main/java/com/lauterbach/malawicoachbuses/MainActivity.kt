package com.lauterbach.malawicoachbuses

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.lauterbach.malawicoachbuses.busactivities.axa.AxaActivity
import com.lauterbach.malawicoachbuses.busactivities.kwezy.KwezyActivity
import com.lauterbach.malawicoachbuses.busactivities.sososo.SososoActivity
import com.lauterbach.malawicoachbuses.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.axa.setOnClickListener {
            Intent(this, AxaActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.kwezy.setOnClickListener {
            Intent(this, KwezyActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.sososo.setOnClickListener {
            Intent(this, SososoActivity::class.java).also {
                startActivity(it)
            }
        }
    }


}