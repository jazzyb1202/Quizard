package com.example.lucindabell.quizard;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class HighestScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textscore = (TextView) findViewById(R.id.yourscore);
        TextView textHighestScore = (TextView) findViewById(R.id.highestscore);


        // receive score
        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        textscore.setText("Your score: " + score);

        // save highest score

        SharedPreferences mypref = getPreferences(MODE_PRIVATE);
        int highscore = mypref.getInt("high score", 0);
        if (highscore >= score)
            textHighestScore.setText("High Score: " + highscore);
        else
        {
            textHighestScore.setText("New Highscore: " + score);
            SharedPreferences.Editor editor = mypref.edit();
            editor.putInt("highscore", score);
            editor.commit();
        }


    }

    public void onClick(View view) {
        Intent intent = new Intent (HighestScoreActivity.this, QuizActivity_Activities.class);
        startActivity(intent);
    }


}

