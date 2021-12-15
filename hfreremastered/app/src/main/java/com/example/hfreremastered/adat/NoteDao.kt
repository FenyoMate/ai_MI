package com.example.hfreremastered.adat

import androidx.room.Dao
import androidx.room.*

@Dao
interface NoteDao {
    @Query("SELECT * FROM notes")
    fun getAll(): List<NoteDatas>

    @Insert
    fun insert(noteDatas: NoteDatas): Long

    @Update
    fun update(noteDatas: noteDB)

    @Delete
    fun deleteItem(noteDatas: NoteDatas)
}
