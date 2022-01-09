package com.example.gdsc_app_tkrcet

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity3 : AppCompatActivity() ,INotesRVAdapter{
    lateinit var viewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = NotesRVAdapter(this, this)
        recyclerView.adapter=adapter

        viewModel = ViewModelProvider(this,
            ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(NoteViewModel::class.java)
        viewModel.allNotes.observe(this, Observer { list->
            list?.let{
                adapter.updatelist(it)
            }
        })


    }
    override fun onItemClicked(note:Note){
        viewModel.deleteNode(note)
        Toast.makeText(this,"Your Notes Deleted", Toast.LENGTH_SHORT).show()
    }

    fun submitData(view: android.view.View) {
        val input = findViewById<EditText>(R.id.input)
        val textsai = findViewById<TextView>(R.id.text)
        var noteText = input.text.toString()
        if (noteText.isEmpty()){
            Toast.makeText(this, "Empty Notes cannot be Saved", Toast.LENGTH_SHORT).show()
        }
        else if (noteText.isNotEmpty()) {
            viewModel.insertNode(Note(noteText))
            Toast.makeText(this, "Notes Saved", Toast.LENGTH_SHORT).show()
        }
    }
}