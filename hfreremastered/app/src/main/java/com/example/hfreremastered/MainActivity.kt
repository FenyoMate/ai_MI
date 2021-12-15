package com.example.hfreremastered

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hfreremastered.adat.noteDB
import com.example.hfreremastered.databinding.ActivityMainBinding
import com.example.hfreremastered.rv_adapter.*
import kotlin.concurrent.thread

private lateinit var binding: ActivityMainBinding

private lateinit var database: noteDB
private lateinit var adapterNote: Adapter

class MainActivity : AppCompatActivity(), Adapter.NoteClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        database = noteDB.getDatabase(applicationContext)

        binding.fab.setOnClickListener {
            val noteIntent = Intent(this, NoteActivity::class.java)
            startActivity(noteIntent)
        }



        initRecyclerView()
    }
    private fun initRecyclerView() {
        adapterNote = Adapter(this)
        binding.rvMain.layoutManager = LinearLayoutManager(this)
        binding.rvMain.adapter = adapterNote
        loadItemsInBackground()
    }

    private fun loadItemsInBackground() {
        thread {
            val items = database.NoteDao().getAll()
            runOnUiThread {
                adapterNote.update(items)
            }
        }
    }
    override fun onItemChanged(item: noteDB) {
        thread {
            database.NoteDao().update(item)
            Log.d("MainActivity", "ShoppingItem update was successful")
        }
    }
}