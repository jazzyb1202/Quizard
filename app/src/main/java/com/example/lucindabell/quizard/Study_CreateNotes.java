package com.example.lucindabell.quizard;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class Study_CreateNotes extends AppCompatActivity {
    Study_DBHelper_Notes myDb;
    EditText editNotes, editTitle;
    Button btnSave, btnDelete, btnBack;
    Cursor answer;
    String receivedNote;

//Create an activity where the user can make notes and this activity also appears when the user
// clicks into the note from the list and they can update/delete the note and it's contents

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newnotes);
        myDb = new Study_DBHelper_Notes(this);
        editNotes = findViewById(R.id.editContent);
        editTitle = findViewById(R.id.editTitle);
        btnSave = findViewById(R.id.btnSave);
        btnDelete = findViewById(R.id.btnDelete);

        //Check if this is creating a new note or viewing/editing and existing one
        // this is done by checking if a row was clicked on in the list.
        Intent intent1 = getIntent();
        String receivedTitle = intent1.getStringExtra("title");
        if (receivedTitle == null) {
            editNotes.setText("");
            editTitle.setText("");
            addData();
            Delete();
        } else {
            answer = myDb.GetNotesContent(receivedTitle);
            StringBuffer buffer = new StringBuffer();
            while (answer.moveToNext()) {
                buffer.append(answer.getString(2));
            }
            receivedNote = buffer.toString();
            editTitle.setText(receivedTitle);
            editNotes.setText(receivedNote);
            addData();
            Delete();
        }
    }

    //This is the method where the note is updated/saved
    public void addData() {
        btnSave.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v){
                        boolean isInserted = myDb.insertData(editTitle.getText().toString(), editNotes.getText().toString());

                        if (isInserted = true)
                        { Toast.makeText(Study_CreateNotes.this, "Data Inserted", Toast.LENGTH_LONG).show();}
                        else
                        {Toast.makeText(Study_CreateNotes.this, "Data Not Inserted", Toast.LENGTH_LONG).show();}

                        Intent myIntent = new Intent(Study_CreateNotes.this, Study_ViewNotes.class);
                        Study_CreateNotes.this.startActivity(myIntent);
                    }
                }

        );
    }

    //This deletes the note
    public void Delete () {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.deleteNote(editTitle.getText().toString());
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append(res.getString(1) + ", ");
                        }
                        Intent myIntent = new Intent(Study_CreateNotes.this, Study_ViewNotes.class);
                        Study_CreateNotes.this.startActivity(myIntent);

                    }
                }
        );
    }
}
