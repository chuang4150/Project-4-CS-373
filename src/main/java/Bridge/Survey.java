package Bridge;

import Bridge.Question.QuestionType;

import java.util.ArrayList;

abstract class Survey {

    protected QuestionType questionType;

    protected Survey(final QuestionType questionType){
        this.questionType = questionType;
    }

    public abstract String getQuestion();

    public abstract ArrayList getAnswer();

    public abstract void setQuestionType();

}