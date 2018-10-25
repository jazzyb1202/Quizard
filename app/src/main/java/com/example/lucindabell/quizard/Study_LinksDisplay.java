package com.example.lucindabell.quizard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Study_LinksDisplay extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.links_activity);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        final Uri[] uri = new Uri[1];


        //Each button takes the user to an external link for more resources and documentation
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri[0] = Uri.parse("https://developer.android.com/guide/components/fundamentals"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri[0]);
                startActivity(intent);

            }});
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri[0] = Uri.parse("https://developer.android.com/guide/topics/providers/content-providers"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri[0]);
                startActivity(intent);

            }});
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri[0] = Uri.parse("https://docs.oracle.com/javase/7/docs/api/java/security/Provider.Service.html"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri[0]);
                startActivity(intent);

            }});
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri[0] = Uri.parse("https://developer.android.com/reference/android/content/BroadcastReceiver"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri[0]);
                startActivity(intent);

            }});
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uri[0] = Uri.parse("https://stuff.mit.edu/afs/sipb/project/android/docs/guide/components/fundamentals.html"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri[0]);
                startActivity(intent);

            }});


}}
