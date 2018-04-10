package Bridge.Question;

import java.util.ArrayList;

//Multiple Choice Implementation

public class MultipleChoice implements QuestionType {

    private String question;
    private ArrayList<String> answer = new ArrayList<String>();

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void setAnswer(ArrayList answer) {
        this.answer = answer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public ArrayList getAnswer() {
        return answer;
    }
}
