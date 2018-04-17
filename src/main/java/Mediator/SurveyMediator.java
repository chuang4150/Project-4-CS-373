package Mediator;

import Bridge.Question.QuestionType;
import Bridge.Survey;

import java.util.ArrayList;
import java.util.List;

public class SurveyMediator implements Mediator {



    public void setResponse(String response, QuestionType questionType){
        questionType.setResponse(response);
    }


    public String getQuestion(QuestionType questionType){
        return questionType.getQuestion();
    }

    public ArrayList getAnswer(QuestionType questionType) {
        return questionType.getAnswer();
    }

    public void setQuestionType(String question, ArrayList answer, String response, QuestionType questionType){
        questionType.setQuestion(question);
        questionType.setAnswer(answer);
        questionType.setResponse(response);
    }

    public QuestionType getQuestionType(QuestionType questionType) {
        return questionType;
    }


}
