package Bridge.Questions;

import java.util.ArrayList;

public interface QuestionType {

    void setQuestion(String question);

    void setAnswer(ArrayList answer);

    String getQuestion();

    ArrayList getAnswer();

}
