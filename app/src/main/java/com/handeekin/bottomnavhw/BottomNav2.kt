package com.handeekin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_bottom_nav1.*
import kotlinx.android.synthetic.main.fragment_bottom_nav1.view.*
import kotlinx.android.synthetic.main.fragment_bottom_nav2.view.*


class BottomNav2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_bottom_nav2, container, false)

        tasarim.buttonCarp.setOnClickListener {

            var carpimSonuc = 0

            try {
                val firstNumber = Integer.parseInt(tasarim.carpBir.text.toString())
                val secondNumber = Integer. parseInt(tasarim.carpİki.text.toString())
                carpimSonuc = firstNumber * secondNumber
            }

            catch (e: NumberFormatException){
                carpimSonuc = 0
            }
            val gecis = BottomNav2Directions.actionCarpmaToCarpimSonucFragment(carpimSonuc)
            Navigation.findNavController(it).navigate(gecis)
        }


        return tasarim


    }


}