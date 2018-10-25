package com.example.lucindabell.quizard;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Study_ViewFlashcards extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
        Button btnFlip, btnNext, btnCreate;
        TextView FrontText;
        Study_DBHelper_Flash myDb;
        String keyword;

        //This is where flashcards are reviewed by the user for study

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.carddisplay);
            myDb = new Study_DBHelper_Flash(this);
            btnFlip = findViewById(R.id.btnFlip);
            btnNext = findViewById(R.id.btnNext);
            FrontText = findViewById(R.id.FrontText);
            btnCreate = findViewById(R.id.btnCreate);

            // Reference the database and get all the flashcards
            Cursor res = myDb.getRandomKey();
            StringBuffer buffer = new StringBuffer();
            while (res.moveToNext()) {
                buffer.append(res.getString(0));
            }
            keyword = buffer.toString();
            FrontText.setText(buffer.toString());

            viewAns();
            viewNext();

            //This provides the option for the user to create new flashcards directly from the current activity
            btnCreate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myIntent = new Intent(Study_ViewFlashcards.this, Study_CreateFlashcards.class);
                    Study_ViewFlashcards.this.startActivity(myIntent);

                }});

        }

        //This displays the back of the flashcard
    public void viewAns() {
        btnFlip.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getBack(keyword);
                        StringBuffer buffer1 = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer1.append(res.getString(2));
                        }
                        FrontText.setText(buffer1.toString());
                    }
                })
;}

    //This displays another random front of a flashcard
    public void viewNext() {
        btnNext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getRandomKey();
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append(res.getString(0));
                        }
                        FrontText.setText(buffer.toString());
                    }
                });}

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

}
