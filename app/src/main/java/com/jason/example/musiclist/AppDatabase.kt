package com.jason.example.musiclist

import androidx.room.RoomDatabase
import androidx.room.Database
import com.jason.example.musiclist.dao.DAO
import com.jason.example.musiclist.model.MusicList

@Database(entities = [MusicList::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun DAO() : DAO
}