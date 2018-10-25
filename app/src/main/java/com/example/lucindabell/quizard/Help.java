package com.example.lucindabell.quizard;
// code from the navigation feature was supported by https://github.com/vikesh8860/QuizBook

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Button help= (Button) findViewById(R.id.help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //will be used when the user chooses to go to site to send message / feedback
                String url = "https://thequizardapp.weebly.com/contact.html";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                Intent chooser = Intent.createChooser(intent, "Open with");
                startActivity(chooser);
            }
        });
    }

}
