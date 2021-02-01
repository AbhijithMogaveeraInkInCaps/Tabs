package com.abhijith.tabs.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.abhijith.tabs.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textview.MaterialTextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tabBar: TabLayout = view.findViewById(R.id.tabBar)


//        var fragment: FragmentContainerView = view.findViewById(R.id.subFragment)
//        fragment = SubFragment()
//        fragment.apply
////            adapter = MyAdapter()
//        }

        var currentTabPosition = 0
        tabBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

                if (tab != null) {
                    if(currentTabPosition==0)
                        (childFragmentManager.findFragmentById(R.id.sub_nav_host) as NavHostFragment).findNavController().navigate(R.id.action_subFragmentONE_to_subFragmentTWO)
                    else
                        (childFragmentManager.findFragmentById(R.id.sub_nav_host) as NavHostFragment).findNavController().navigate(R.id.action_subFragmentTWO_to_subFragmentONE)
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

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.view_holder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }

}

class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val mtv: MaterialTextView = v.findViewById(R.id.mtv)
}