package com.example.lucindabell.quizard;
// code from the navigation feature was supported by https://github.com/vikesh8860/QuizBook

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        b = (Button) findViewById(R.id.visit_website);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //to be used when the user chooses to visit the quizard site

                String url = "https://thequizardapp.weebly.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                Intent chooser = Intent.createChooser(intent, "Open with");
                startActivity(chooser);

            }
        });

    }
}