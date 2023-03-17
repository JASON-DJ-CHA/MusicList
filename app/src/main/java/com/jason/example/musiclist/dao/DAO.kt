package com.jason.example.musiclist.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.jason.example.musiclist.model.MusicList

@Dao
interface DAO {
    @Query("SELECT * FROM MusicList")
    fun getAll(): List<MusicList>

    @Insert
    fun insertList(list: MusicList)

    @Query("DELETE FROM MusicList")
    fun deleteAll()

    @Delete
    fun delete(list: MusicList)

}