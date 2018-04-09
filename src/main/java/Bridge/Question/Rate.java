package Bridge.Question;

import java.util.ArrayList;

public class Rate implements QuestionType {

    private String question;
    private ArrayList<Integer> answer = new ArrayList<Integer>();

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
