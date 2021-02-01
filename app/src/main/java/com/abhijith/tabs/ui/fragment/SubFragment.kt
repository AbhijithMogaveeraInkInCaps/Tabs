package com.abhijith.tabs.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.abhijith.tabs.R

class SubFragmentONE:Fragment(R.layout.rv_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.rv).apply {
            adapter = MyAdapter()
        }
    }
}

class SubFragmentTWO:Fragment(R.layout.rv_layout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<RecyclerView>(R.id.rv).apply {
            adapter = MyAdapter()
        }
    }
}