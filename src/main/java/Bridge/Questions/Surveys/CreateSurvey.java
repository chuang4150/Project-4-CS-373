package Bridge.Questions.Surveys;

import Bridge.Questions.QuestionType;

import java.util.ArrayList;

public class CreateSurvey extends Survey {

    private String question;
    private ArrayList answer;

    public CreateSurvey(final String question, final  ArrayList answer,
                        final QuestionType questionType){
        super(questionType);
        this.question = question;
        this.answer = answer;
        //setQuestionType();
    }

    public void setQuestionType(){
        questionType.setQuestion(question);
        questionType.setAnswer(answer);
    }

    public String getQuestion(){
        return questionType.getQuestion();
    }

    public ArrayList getAnswer() {
        return questionType.getAnswer();
    }


}
