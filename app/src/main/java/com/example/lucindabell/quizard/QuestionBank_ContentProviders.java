package com.example.lucindabell.quizard;

public class QuestionBank_ContentProviders {


    //array of questions
    private String textQuestions [] = {
            "1. Content providers help an app manage access to ___",
            "2. Which of the following is one of the biggest advantages of a content provider?",
            "3. Which of te following classes DOES NOT rely on content providers?",
            "4. Can a content provider manage access to both structured and unstructured data sources?",
            "5. Why do CursorLoader objects rely on content providers?",
            "6. To access data in a content provider, you must use the ________ object ",
            "7. A ______ is a URI that identifies data in a content provider",
            "8. Where must you request read access permission for the provider?"
    };

    //an array of multiple choice for each question
    private String multiplechoice [] [] = {

            {"Cameras", "Layouts","Data","App Features"},
            {"Data Security", "Easier code","Access to activities","None of the above"},
            {"AbstractThreadedSyncAdapter","CursorAdapter","CursorLoader","AbstractLoader"},
            {"Yes","No","Sometimes","Only if you have declared permissions"},
            {"To use app features",	"To run asynchronous queries","To block access permissions", "To stop data flow"},
            {"ContentResolver", "onStart()" ,"ContentData","getData"},
            {"Data URI","Access URI","ID URI","Content URI"},
            {"The Java class", "Manifest file","Layout file","Assets"}
    };

    //array of correct answers in same order as questions
    private String mCorrectAnswers [] = {"Data", "Data Security", "AbstractLoader", "Yes", "To run asynchronous queries", "ContentResolver","Content URI","Manifest file" };

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
