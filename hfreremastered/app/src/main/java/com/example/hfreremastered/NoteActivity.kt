package com.example.hfreremastered

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hfreremastered.adat.noteDB
import com.example.hfreremastered.databinding.ActivityNoteBinding

private lateinit var binding: ActivityNoteBinding
private lateinit var database: noteDB
class NoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        database = noteDB.getDatabase(applicationContext)

        binding.buttonSave.setOnClickListener{
            NewSavingNoteDialogFragment().show(
                supportFragmentManager,
                NewSavingNoteDialogFragment.TAG
            )
        }

    }
}