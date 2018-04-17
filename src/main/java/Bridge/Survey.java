package Bridge;

import Bridge.Question.QuestionType;
import Mediator.Mediator;

import java.util.ArrayList;
import java.util.Observer;

//Abstract Class for creating a survey question takes a mediator to handle survey interaction

public abstract class Survey {

    protected QuestionType questionType;
    protected Mediator mediator;

    protected Survey(final QuestionType questionType, Mediator mediator){
        this.questionType = questionType;
        this.mediator = mediator;
    }

    public abstract String getQuestion();

    public abstract ArrayList getAnswer();

    public abstract void setQuestionType();

    public abstract QuestionType getQuestionType();

    public abstract void setResponse(String response);


}
