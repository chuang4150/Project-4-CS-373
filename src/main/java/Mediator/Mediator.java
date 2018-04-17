package Mediator;

import Bridge.CreateSurvey;
import Bridge.Question.QuestionType;
import Bridge.Survey;

import java.util.ArrayList;

public interface Mediator {

    void setResponse(String response, QuestionType questionType);

    String getQuestion(QuestionType questionType);

    ArrayList getAnswer(QuestionType questionType);

    void setQuestionType(String question, ArrayList answer, String response, QuestionType questionType);

    QuestionType getQuestionType(QuestionType questionType);

}
