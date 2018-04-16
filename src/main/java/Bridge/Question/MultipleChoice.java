package Bridge.Question;

import Visitor.Visitable;
import Visitor.Visitor;

import java.util.ArrayList;

//Multiple Choice Implementation

public class MultipleChoice implements QuestionType, Visitable {

    private String question;
    private ArrayList<String> answer = new ArrayList<String>();
    private String response;

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public void setAnswer(ArrayList answer) {
        this.answer = answer;
    }

    @Override
    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public ArrayList getAnswer() {
        return answer;
    }

    @Override
    public String getResponse() {
        return response;
    }

    @Override
    public Boolean accept(Visitor visitor){
        return visitor.visit(this);
    }
}
