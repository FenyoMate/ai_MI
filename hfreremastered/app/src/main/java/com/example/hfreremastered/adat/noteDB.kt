package com.example.hfreremastered.adat

import android.content.Context
import androidx.room.*
import androidx.room.Room.databaseBuilder


@Database(entities = [NoteDatas::class], version = 1)
abstract class noteDB : RoomDatabase() {
    abstract fun NoteDao(): NoteDao

    companion object {
        fun getDatabase(applicationContext: Context): noteDB {
            return databaseBuilder(
                applicationContext,
                noteDB::class.java,
                "shopping-list"
            ).build();
        }
    }
}