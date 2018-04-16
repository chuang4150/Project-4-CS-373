package Bridge.Question;

import Visitor.Visitor;

import java.util.ArrayList;

//Interface for the different kinds of questions

public interface QuestionType {

    void setQuestion(String question);

    void setAnswer(ArrayList answer);

    void setResponse(String response);

    String getQuestion();

    ArrayList getAnswer();

    String getResponse();

    Boolean accept(Visitor visitor);

}
