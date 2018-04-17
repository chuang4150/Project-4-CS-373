package Bridge;

import Bridge.Question.QuestionType;
import Mediator.Mediator;
import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;

//Refined class or implementation to create a survey with the passed question type

public class CreateSurvey extends Survey{

    private String question;
    private ArrayList answer;
    private String response;

    public CreateSurvey(final String question, final  ArrayList answer,
                        final QuestionType questionType, final Mediator mediator){
        super(questionType, mediator);
        this.question = question;
        this.answer = answer;
        this.response = "";
        //setQuestionType();
    }

    public void setQuestionType(){
        mediator.setQuestionType(question,answer,response,questionType);
    }

    public String getQuestion(){
        return mediator.getQuestion(questionType);
    }

    public ArrayList getAnswer() {
        return mediator.getAnswer(questionType);
    }

    public QuestionType getQuestionType() {
        return mediator.getQuestionType(questionType);
    }

    public void setResponse(String response) {
        mediator.setResponse(response, questionType);
    }
}
