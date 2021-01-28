package com.abhijith.tabs.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.abhijith.tabs.R
import com.google.android.material.tabs.TabLayout

class FirstFragment : Fragment() {
    var intPosition:Int = 0
    lateinit var tv:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabBar:TabLayout =  view.findViewById(R.id.tabBar)
        tv =  view.findViewById(R.id.tvPoem)
        tabBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    intPosition = tab.position
                    if(intPosition==0)
                        tv.setText(R.string.poemEng)
                    else
                        tv.setText(R.string.poemHindhi)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })


    }
}