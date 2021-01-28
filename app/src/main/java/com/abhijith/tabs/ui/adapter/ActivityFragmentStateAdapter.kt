package com.abhijith.tabs.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.abhijith.tabs.ui.fragment.FirstFragment
import com.abhijith.tabs.ui.fragment.SecondFragment

class ActivityFragmentStateAdapter(fragment: FragmentActivity) :
    FragmentStateAdapter(fragment) {

    private val firstFragment = FirstFragment()
    val secondFragment = SecondFragment()

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                firstFragment
            }
            else -> {
                secondFragment
            }
        }
    }
}