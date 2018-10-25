package com.example.lucindabell.quizard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity_BroadcastReceivers extends AppCompatActivity {

    private QuestionBank_BroadcastReceivers mQuestionLibrary = new QuestionBank_BroadcastReceivers();
    private TextView mScoreView; // view total score
    private TextView mQuestionView; //current question to answer
    private Button mButtonChoice1; //multiple choice 1
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer; //correct answer
    private int mScore = 0; //total score
    private int mQuestionBankNumber = 0; //current question number


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiple_choice_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        updateQuestion();
        updateScore(mScore);


    }

    private void updateQuestion () {
        //check if outside array bounds
        if(mQuestionBankNumber<mQuestionLibrary.getLength()){
            //set new question and 4 choices
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionBankNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionBankNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionBankNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionBankNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionBankNumber, 4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionBankNumber);
            mQuestionBankNumber++;

        }
        else {
            Toast.makeText(QuizActivity_BroadcastReceivers.this, "Last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivity_BroadcastReceivers.this, HighestScoreActivity.class);
            // pass current score to second screen
            intent.putExtra("score", mScore);
            startActivity(intent);
        }
    }

    //show total score
    private void updateScore(int point){
        mScoreView.setText("" + mScore + "/" + mQuestionLibrary.getLength());
    }

    public void onClickView(View view) {
        Button answer = (Button) view;

        //if answer correct, increase score
        if (answer.getText() == mAnswer) {
            mScore = mScore + 1;
            Toast.makeText(QuizActivity_BroadcastReceivers.this, "Correct!", Toast.LENGTH_SHORT).show();
        }else
            Toast.makeText(QuizActivity_BroadcastReceivers.this, "Wrong!", Toast.LENGTH_SHORT).show();
        //show score
        updateScore(mScore);

        //move to next question
        updateQuestion();
    }



}
