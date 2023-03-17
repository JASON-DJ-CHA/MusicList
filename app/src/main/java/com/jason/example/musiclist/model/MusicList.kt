package com.jason.example.musiclist.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MusicList(
    @PrimaryKey val uid: Int?,
    @ColumnInfo(name = "Singer") val Singer: String?,
    @ColumnInfo(name = "Sing") val Sing: String?
)
