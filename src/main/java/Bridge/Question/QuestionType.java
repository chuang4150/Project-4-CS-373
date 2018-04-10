package Bridge.Question;

import java.util.ArrayList;

//Interface for the different kinds of questions

public interface QuestionType {

    void setQuestion(String question);

    void setAnswer(ArrayList answer);

    String getQuestion();

    ArrayList getAnswer();

}
