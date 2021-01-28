package com.abhijith.tabs.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.abhijith.tabs.R
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {


    val tabBar: TabLayout by lazy {
        findViewById(R.id.tabBar)
    }

    var currentTabPosition:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    if(currentTabPosition==0)
                        findNavController(R.id.nav_host_fragm).navigate(R.id.action_FirstFragment_to_SecondFragment)
                    else
                        findNavController(R.id.nav_host_fragm).navigate(R.id.action_SecondFragment_to_FirstFragment)
                    currentTabPosition = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}