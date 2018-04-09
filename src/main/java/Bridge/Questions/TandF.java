package Bridge.Questions;

import java.util.ArrayList;

public class TandF implements QuestionType {

    private String question;
    private ArrayList<Boolean> answer = new ArrayList<>();

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
    public ArrayList<Boolean> getAnswer() {
        return answer;
    }
}
