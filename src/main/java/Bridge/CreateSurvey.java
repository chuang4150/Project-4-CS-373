package Bridge;

import Bridge.Question.QuestionType;
import Observer.Observer;
import Observer.Subject;

import java.util.ArrayList;

//Refined class or implementation to create a survey with the passed question type

public class CreateSurvey extends Survey{

    private String question;
    private ArrayList answer;
    private String response;

    public CreateSurvey(final String question, final  ArrayList answer,
                        final QuestionType questionType){
        super(questionType);
        this.question = question;
        this.answer = answer;
        this.response = "";
        //setQuestionType();
    }

    public void setQuestionType(){
        questionType.setQuestion(question);
        questionType.setAnswer(answer);
        questionType.setResponse(response);
    }

    public String getQuestion(){
        return questionType.getQuestion();
    }

    public ArrayList getAnswer() {
        return questionType.getAnswer();
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        questionType.setResponse(response);
    }
}
