package com.handeekin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_toplama_sonuc.view.*


class ToplamaSonucFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_toplama_sonuc, container, false)


        val bundle: ToplamaSonucFragmentArgs by navArgs()
        val sonucToplam = bundle.number

        tasarim.textView.text = "Addition Result : " + sonucToplam.toString()



        return tasarim
    }


}