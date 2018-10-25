package com.example.lucindabell.quizard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Study_PractiseQuestions extends AppCompatActivity {
//this class will define the different practice questions to be displayed on the screen
    Button button;
    TextView q1, q2, q3, q4, q5, TextView2, textview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_questions);
        button = findViewById(R.id.button5);
        ScrollView scroll = findViewById(R.id.scrollView2);
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);
        q5 = findViewById(R.id.q5);
        textview3 = findViewById(R.id.textView3);
        TextView2 = findViewById(R.id.textView2);



}}
