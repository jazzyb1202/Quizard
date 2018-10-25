package com.example.lucindabell.quizard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Study_ViewCreateFlash extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    Button btnNewFlash, btnViewFlash;

//This is where the user can decide whether they want to view their flashcards or create more
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_flash);

        btnNewFlash = findViewById(R.id.btnNewFlash);
        btnViewFlash = findViewById(R.id.btnViewFlash);

        //Navigate to where flashcards are created
        btnNewFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study_ViewCreateFlash.this, Study_CreateFlashcards.class);
                Study_ViewCreateFlash.this.startActivity(myIntent);
            }
        });

        //Navigate to where flashcards are reviewed
        btnViewFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study_ViewCreateFlash.this, Study_ViewFlashcards.class);
                Study_ViewCreateFlash.this.startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }
}
