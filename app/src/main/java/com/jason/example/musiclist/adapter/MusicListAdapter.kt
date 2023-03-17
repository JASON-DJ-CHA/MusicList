package com.jason.example.musiclist.adapter

import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import com.jason.example.musiclist.R
import com.jason.example.musiclist.model.edmdata

class MusicListAdapter(val items: MutableList<edmdata>): RecyclerView.Adapter<MusicListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, veiwType: Int): MusicListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent,false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: MusicListAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])

    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)  {
        fun bindItems(item : edmdata){

            // 각 뷰 연결결
            val rvSinger = itemView.findViewById<TextView>(R.id.rvSinger)
            rvSinger.text = item.singer

            val rvSing = itemView.findViewById<TextView>(R.id.rvSong)
            rvSing.text = item.song

        }
    }
}