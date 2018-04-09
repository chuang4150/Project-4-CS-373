package Client;

import Bridge.CreateSurvey;
import Bridge.Question.QuestionType;
import Data.Surveys;
import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;
import java.util.Scanner;

public class AnswerSurvey implements Observer {


    private String question;
    private ArrayList answer;
    private String response;
    Scanner scan = new Scanner(System.in);

    public void answerAll(ArrayList<CreateSurvey> surveys){
        for (int i = 0; i < surveys.size(); i++){
            printQuestion(surveys.get(i));
            printAnswer(surveys.get(i));
            getResponse();
        }
    }

    public void answerNew(CreateSurvey survey){
        printQuestion(survey);
        printAnswer(survey);
        getResponse();
    }

    public void printQuestion(CreateSurvey survey){
        System.out.println(survey.getQuestion());
    }

    public void printAnswer(CreateSurvey survey){
        System.out.println(survey.getAnswer().toString());
    }

    public void getResponse(){
        System.out.print("Your Answer:");
        response = scan.next();
    }

    public void update(Object o){
        if (o instanceof Surveys){
            Surveys so = (Surveys) o;
            answerNew(so.surveys.get(so.surveys.size()-1));
        }
    }
}
