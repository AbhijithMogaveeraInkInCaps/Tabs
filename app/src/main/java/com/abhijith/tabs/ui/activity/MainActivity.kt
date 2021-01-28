package com.abhijith.tabs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.abhijith.tabs.R
import com.abhijith.tabs.ui.adapter.ActivityFragmentStateAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

//    val viewPager: ViewPager2 by lazy {
//        findViewById(R.id.vp)
//    }
    val tabBar: TabLayout by lazy {
        findViewById(R.id.tabBar)
    }

    var intPosition:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        viewPager.adapter = ActivityFragmentStateAdapter(this)
        tabBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    if(intPosition==0)
                        findNavController(R.id.nav_host_fragm).navigate(R.id.action_FirstFragment_to_SecondFragment)
                    else
                        findNavController(R.id.nav_host_fragm).navigate(R.id.action_SecondFragment_to_FirstFragment)
                    intPosition = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}