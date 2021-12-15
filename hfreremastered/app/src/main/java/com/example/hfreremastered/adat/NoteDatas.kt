package com.example.hfreremastered.adat

import android.media.Image
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "notes")
data class NoteDatas(
    @ColumnInfo(name = "id") @PrimaryKey(autoGenerate = true) var id: Long? = null,
    @ColumnInfo(name = "notename") var name: String,
    @ColumnInfo(name = "text") var description: String,
    @ColumnInfo(name = "images") var category: Image
)
