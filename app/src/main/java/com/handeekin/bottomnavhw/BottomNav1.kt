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


class BottomNav1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_bottom_nav1, container, false)


        tasarim.buttonTopla.setOnClickListener {

            var toplamSonuc = 0

            try {
                val firstNumber = Integer.parseInt(tasarim.toplaBir.text.toString())
                val secondNumber = Integer.parseInt(tasarim.toplaİki.text.toString())
                toplamSonuc = firstNumber + secondNumber
            }

            catch (e: NumberFormatException){
                toplamSonuc = 0
            }
            val gecis = BottomNav1Directions.actionToplamaToToplamaSonucFragment(toplamSonuc)
            Navigation.findNavController(it).navigate(gecis)
        }


        return tasarim
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

}