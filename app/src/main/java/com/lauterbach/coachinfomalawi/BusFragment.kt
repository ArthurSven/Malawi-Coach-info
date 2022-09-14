package com.lauterbach.coachinfomalawi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lauterbach.coachinfomalawi.Axa.AxaActivity
import com.lauterbach.coachinfomalawi.Kwezy.KwezyActivity
import com.lauterbach.coachinfomalawi.databinding.FragmentBusBinding
import com.lauterbach.coachinfomalawi.nationalbus.NationalActivity
import com.lauterbach.coachinfomalawi.post.PostActivity
import com.lauterbach.coachinfomalawi.sososo.SososoActivity


class BusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding = FragmentBusBinding.inflate(layoutInflater)

        //Making axa card clickable
        binding.axa.setOnClickListener {
            val intent = Intent (this@BusFragment.requireContext(), AxaActivity::class.java)
            startActivity(intent)
        }
        //Making kwezy card clickable
        binding.kwezy.setOnClickListener {
            val intent = Intent (this@BusFragment.requireContext(), KwezyActivity::class.java)
            startActivity(intent)
        }
        //Making national bus card clickable
        binding.nationalbus.setOnClickListener {
            val intent = Intent (this@BusFragment.requireContext(), NationalActivity::class.java)
            startActivity(intent)
        }
        binding.post.setOnClickListener {
            val intent = Intent (this@BusFragment.requireContext(), PostActivity::class.java)
            startActivity(intent)
        }
        binding.sososo.setOnClickListener {
            val intent = Intent (this@BusFragment.requireContext(), SososoActivity::class.java)
            startActivity(intent)
        }
        return binding.root


    }
}