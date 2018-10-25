package com.example.lucindabell.quizard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Study_CreateFlashcards extends AppCompatActivity {
    Study_DBHelper_Flash myDb;
    EditText backText, fronttext;
    Button btnInsert;
    TextView cardback, cardfront;

//Create an activity where the user can create their own flashcards through the UX
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newcards);
        myDb = new Study_DBHelper_Flash(this);
        backText = findViewById(R.id.backText);
        fronttext = findViewById(R.id.frontText);
        btnInsert = findViewById(R.id.btnInsert);
        cardfront = findViewById(R.id.cardfront);
        cardback = findViewById(R.id.cardback);

        addData();

    }

    //This is the method which references the Flashcards database to store the front and back card
    public void addData() {
        btnInsert.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick (View v){
                        boolean isInserted = myDb.insertData(fronttext.getText().toString(), backText.getText().toString());

                        if (isInserted = true)
                            Toast.makeText(Study_CreateFlashcards.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Study_CreateFlashcards.this, "Data Not Inserted", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
 }