package com.example.lucindabell.quizard;

public class QuestionBank_ModuleSummary {


    //array of questions
    private String textQuestions [] = {
            "1. There are usually ____ dependencies among activities in an app",
            "2. Which feature can you use to launch activities based on implicit AND explicit requests",
            "3. A started service has a lifestyle independent from the ____ that started it",
            "4. A ______ is a URI that identifies data in a content provider",
            "5. When the activity enters the Resumed state, it comes to the _____",
            "6. What state has an activity entered when it is no longer visible?",
            "7. What method would you use if you want to interact with a service that is already running?",
            "8. Why do CursorLoader objects rely on content providers?"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"Always many",	"No","Somtimes many", "Minimal - they are loosely bound"},
            {"Permissions","onStart()","Intent filters","All of the above"},
            {"User", "Component" ,"Permissions","Layout"},
            {"Data URI","Access URI","ID URI","Content URI"},
            {"onCreate() method", "Backstack","Background", "Foreground"},
            {"onStop()","onPause()","endActivity()","Paused state"},
            {"onRun()","onRequest()","getService(Context, Intent)","peekService(Context, Intent)"},
            {"To use app features",	"To run asynchronous queries","To block access permissions", "To stop data flow"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"Minimal - they are loosely bound", "Intent filters", "Component", "Content URI", "Foreground", "onStop()","peekService(Context, Intent)","To run asynchronous queries" };

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

