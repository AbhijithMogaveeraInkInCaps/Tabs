package com.abhijith.tabs.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abhijith.tabs.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.textview.MaterialTextView

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {
    var currentTabPosition:Int = 0
//    lateinit var tv:TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabBar: TabLayout =  view.findViewById(R.id.tabBar)
        val rv: RecyclerView =  view.findViewById(R.id.rv)
        rv.apply {
            adapter = MyAdapter()
        }
//        tv =  view.findViewById(R.id.tvPoem)
        tabBar.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
//                if (tab != null) {
//                currentTabPosition = tab.position
//                    if(currentTabPosition==0)
//                        tv.setText(R.string.poemEng)
//                    else
//                        tv.setText(R.string.poemHindhi)
//                }
//            }
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })    }
}

class MyAdapter:RecyclerView.Adapter<MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_holder,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 20
    }

}
class MyViewHolder(v:View):RecyclerView.ViewHolder(v){
    val mtv: MaterialTextView = v.findViewById(R.id.mtv)
}