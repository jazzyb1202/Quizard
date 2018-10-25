package com.example.lucindabell.quizard;

public class QuestionBank_CodeSummary {


    //array of questions
    private String textQuestions [] = {
            "1. The onRestart() activity callback is always followed by _____",
            "2. A service is bound when the _____ method is called",
            "3. To declare a service in the manifest, add a ____ element as a child of the ____ element",
            "4. Which is the correct method for a content provider to display query results?",
            "5. A content provider uses ______ to update data",
            "6. isOrderedBroadcast() returns true if the receiver is _______",
            "7. What method would you use if you want to interact with a service that is already running?",
            "8. If a user navigates back to an activity after onStop(), which method is called?"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"onStart()", "onResume()","onStop()","onOpen()"},
            {"onClick()", "bindService()","onResume()","Intent filter"},
            {"<service> , <application>","<service>, <declareservice>","<intent>, <service>","None of the above"},
            {"requestQuery()","getQuery()","Provider.query()","ContentResolver.query()"},
            {"ContentResolver.update()", "ContentValue.update()","onUpdate()", "getData()"},
            {"Currently processing an ordered broadcast", "Is ordered correctly" ,"The broadcast has been destroyed","None of the above"},
            {"onRun()","onRequest()","getService(Context, Intent)","peekService(Context, Intent)"},
            {"onRestart()", "onStart()","onResume()","onRecover()"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"onStart()", "bindService()", "<service> , <application>", "ContentResolver.query()", "ContentResolver.update()", "Currently processing an ordered broadcast","peekService(Context, Intent)","onRestart()" };

    //return number of questions
    public int getLength() {return textQuestions.length;}

    //return question based on index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {

        String choice0 = multiplechoice[index][num-1];
        return choice0;
    }

    //get correct answer

    public String getCorrectAnswer (int a) {

        String answer = mCorrectAnswers[a];
        return answer;
    }

}
