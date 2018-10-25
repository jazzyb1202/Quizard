package com.example.lucindabell.quizard;

public class QuestionBank_Services {


    //array of questions
    private String textQuestions [] = {
            "1. A service does not provide a _____",
            "2. Which of the following is not a type of Service?",
            "3. What is the method used for a Bound service?",
            "4. You implement a service as a subclass of the ____ class",
            "5. Which is a correct method to stop a Service?",
            "6. A started service has a lifestyle independent from the ____ that started it ",
            "7. ______ can be used to start a service",
            "8. Which of the following is a correct technique to notify the user of events when a service is running"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"User Interface", "Permission","Layout","Intent"},
            {"Foreground", "Background","Bound","Runtime"},
            {"onCreate()","getService()","bindService()","getBound()"},
            {"Service","AppCompatability",	"Main",	"User"},
            {"stopSelf()",	"stopBound()","stopRun()", "onStop()"},
            {"User", "Component" ,"Permissions","Layout"},
            {"Intents",	"Cameras","Intent filters","None of the above"},
            {"Toast Notifications", "App Notifications","onClick()","Feature Notifications"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"User Interface", "Runtime", "bindService()", "Service", "stopSelf()", "Component","Intents","Toast Notifications" };

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
