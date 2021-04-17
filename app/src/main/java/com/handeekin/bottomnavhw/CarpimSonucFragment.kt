package com.handeekin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_carpim_sonuc.view.*


class CarpimSonucFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val tasarim = inflater.inflate(R.layout.fragment_carpim_sonuc, container, false)

        val bundle:CarpimSonucFragmentArgs by navArgs()
        val carpSonuc = bundle.number2

        tasarim.textView2.text = "Multiplication Result : " + carpSonuc.toString()
        return tasarim
    }


}