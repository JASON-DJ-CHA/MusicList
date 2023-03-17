package com.jason.example.musiclist.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jason.example.musiclist.R
import com.jason.example.musiclist.adapter.MusicListAdapter
import com.jason.example.musiclist.model.edmdata


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_list1, container, false)


        val items = mutableListOf<edmdata>()
        items.add(edmdata("Alan Walker","Faded"))
        items.add(edmdata("Alan Walker","Alone"))
        items.add(edmdata("deadmau5","Escape"))
        items.add(edmdata("deadmau5","ASDFGHJKL"))



        val rv = view.findViewById<RecyclerView>(R.id.rvEDMList)
        val rvAdapter = MusicListAdapter(items)

        // 연결
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        // 이미지 버튼 구현
        view.findViewById<ImageView>(R.id.iv_rock1).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_list2Fragment)
        }

        view.findViewById<ImageView>(R.id.iv_jazz1).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_list3Fragment)

        }

        view.findViewById<ImageView>(R.id.iv_hiphop1).setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_list4Fragment)

        }
        // 이미지 버튼 구현 완료

        return view
    }


}