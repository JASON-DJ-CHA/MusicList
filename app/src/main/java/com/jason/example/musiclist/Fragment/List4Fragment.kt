package com.jason.example.musiclist.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import com.jason.example.musiclist.R

class List4Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list4, container, false)
        view.findViewById<ImageView>(R.id.iv_edm4).setOnClickListener {
            it.findNavController().navigate(R.id.action_list4Fragment_to_firstFragment)
        }

        view.findViewById<ImageView>(R.id.iv_rock4).setOnClickListener {
            it.findNavController().navigate(R.id.action_list4Fragment_to_list2Fragment)
        }

        view.findViewById<ImageView>(R.id.iv_jazz4).setOnClickListener {
            it.findNavController().navigate(R.id.action_list4Fragment_to_list3Fragment)
        }


        return  view
    }

}