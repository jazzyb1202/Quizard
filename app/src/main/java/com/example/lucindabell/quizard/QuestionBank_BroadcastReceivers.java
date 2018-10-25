package com.example.lucindabell.quizard;

public class QuestionBank_BroadcastReceivers {


    //array of questions
    private String textQuestions [] = {
            "1. Broadcast receivers do not display a  ________",
            "2. The broadcast receiver message is wrapped in what type of object?",
            "3. Which of the following is one CORRECT way of an app receiving a broadcast?",
            "4. When creating a broadcast receiver, you must subclass what class?",
            "5. To stop receiving broadcasts, you must call ______",
            "6. When a process executes a receiver, it is considered a _______ process ",
            "7. What method can a broadcast receiver use to show that it needs more time to finish after onReceive() is done?",
            "8. Why should you not broadcast sensitive information with an implicit intent?"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"User Interface", "Notification","Message","All of the above"},
            {"Layout", "Java","Intent","String"},
            {"Manifest-declared receivers","Layout registered receivers","getMessage()","None of the above"},
            {"AppCompatability","Manifest","Receiver","BroadcastReceiver"},
            {"unregisterReceiver()", "onStop()","stopCast()", "unregisterCast()"},
            {"Background", "Foreground" ,"Duplicate","Manifested"},
            {"onStop()","timeExtend()","onExtend()","goAsync()"},
            {"It can be read by any app that registers to receive the broadcast", "It will take longer","You must use an explicit intent","None of the above"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"User Interface", "Intent", "Manifest-declared receivers", "BroadCastReceiver", "unregisterReceiver()", "Foreground","goAsync()","It can be read by any app that registers to receive the broadcast" };

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
