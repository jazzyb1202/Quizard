package com.example.lucindabell.quizard;

public class QuestionBank_ActivityLifecycle {


    //array of questions
    private String textQuestions [] = {
            "1. Within the lifecycle callback methods, you can declare how your activity _____",
            "2. Which of the following is NOT one of the core 6 callback methods?",
            "3. Does an activity need to implement ALL of the lifecycle methods?",
            "4. Which method is called when the activity is first created?",
            "5. When the activity enters the Resumed state, it comes to the _____",
            "6. What is the most common reason an activity enters a paused state - onPause()?",
            "7. What state has an activity entered when it is no longer visible?",
            "8. Which of the following is NOT a technique to preserve UI state after an activity is destroyed?"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"Looks", "Behaves","Permits users","None of the above"},
            {"onCreate()", "onStart()","onResume()","onActive()"},
            {"Probably not, but depends on the complexity","Yes","No","An activity does not implement methods"},
            {"onStart()","onCreate()","onNew()","startActivity()"},
            {"onCreate() method", "Backstack","Background", "Foreground"},
            {"An event interrupts app execution", "Poorly written code" ,"Time runs out","None of the above"},
            {"onStop()","onPause()","endActivity()","Paused state"},
            {"viewModel()", "onSaveInstanceState()","Local storage","onRecover()"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"Behaves", "onActive()", "Probably not, but depends on the complexity", "onCreate()", "Foreground", "An event interrupts app execution","onStop()","onRecover()" };

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

