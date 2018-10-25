package com.example.lucindabell.quizard;

public class QuestionBank_Activities {

    //array of questions
    private String textQuestions [] = {
            "1. Generally, one activity implements one...?",
            "2. An application will usually have a main",
            "3. An activity provides a ____ for main interaction",
            "4. You implement an activity as a subclass of the ____ class",
            "5. There are usually ____ dependencies among activities in an app",
            "6. You must register information about your apps activities in the ",
            "7. Which feature can you use to launch activities based on implicit AND explicit requests",
            "8. A parent activity cannot launch a child activity unless both activities have the same"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"Button", "Screen","Feature","Intent"},
            {"Activity", "Camera","Button",	"Service"},
            {"Button","Textbox","Screen","Camera"},
            {"Activity","AppCompatability",	"Main",	"User"},
            {"Always many",	"No","Somtimes many", "Minimal - they are loosely bound"},
            {"Main activity", "Manifest file" ,"Beginning",	"Java files"},
            {"Permissions",	"onStart()","Intent filters","All of the above"},
            {"Layout", "Permissions","Features","None of these"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"Screen", "Activity", "Screen", "Activity", "Minimal - they are loosely bound", "Manifest file","Intent filters","Permissions" };

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
