package com.example.lucindabell.quizard;
// code from the navigation feature was supported by https://github.com/vikesh8860/QuizBook

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class Study extends NavigationActivity {
    Button btnFlash, btnNotes, btnRes, btnPQs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study);
        btnFlash = findViewById(R.id.btnFlash);
        btnNotes = findViewById(R.id.btnNotes);
        btnPQs = findViewById(R.id.btnPQs);
        btnRes = findViewById(R.id.btnRes);

        //navigate to the Flashcard section
        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study.this, Study_ViewCreateFlash.class);
                Study.this.startActivity(myIntent);

            }});

        //Navigate to the Resources section
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study.this, Study_ResourcesMain.class);
                Study.this.startActivity(myIntent);

            }});

        //Navigate to the Practise Questions section
        btnPQs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study.this, Study_PractiseQuestions.class);
                Study.this.startActivity(myIntent);
            }});

        //Navigate to the Notes section
        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Study.this, Study_ViewNotes.class);
                Study.this.startActivity(myIntent);
            }});
    }
}
