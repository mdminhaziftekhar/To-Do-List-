package com.example.todolistapp;

import androidx.cardview.widget.CardView;

import com.example.todolistapp.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
