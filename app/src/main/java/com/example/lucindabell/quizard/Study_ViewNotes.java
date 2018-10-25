package com.example.lucindabell.quizard;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class Study_ViewNotes extends AppCompatActivity {
Button createNote;
ListView lv;
Cursor ans;
static TextView viewTitle;

//This displays the list of notes which have been created and from here they can click on an item
    //and view/edit/delete a note
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes_main);
        final Study_DBHelper_Notes db = new Study_DBHelper_Notes(this);
        ans = db.getNotes();
        final ArrayList<HashMap<String, String>> noteList = new ArrayList<>();
        final ArrayList<String> titles = new ArrayList<>();
        while (ans.moveToNext()){
            HashMap<String,String> note = new HashMap<>();
            note.put("id",ans.getString(0));
            note.put("title", ans.getString(1));
            note.put("note",ans.getString(2));
            titles.add(0,ans.getString(1));
            noteList.add(note);
        }
        lv = findViewById(R.id.note_list);
        final ListAdapter adapter = new SimpleAdapter(Study_ViewNotes.this, noteList, R.layout.listviewcontent,new String[]{"title"}, new int[]{R.id.viewTitle});

//This sends the title of a note for when the user clicks on the row item
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent1 = new Intent(getApplicationContext(),Study_CreateNotes.class);
                intent1.putExtra("title", titles.get(i));
                startActivity(intent1);}

        });
        createNote = findViewById(R.id.createNote);

        //This allows the user to create a note
        createNote.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(Study_ViewNotes.this, Study_CreateNotes.class);
            Study_ViewNotes.this.startActivity(myIntent);
        }});

       }}
