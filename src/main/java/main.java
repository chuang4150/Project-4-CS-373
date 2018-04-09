import Bridge.Questions.QuestionType;
import Bridge.Questions.Surveys.CreateSurvey;
import Bridge.Questions.TandF;

import java.util.ArrayList;

public class main {

    public static void main(final String[] args){
        ArrayList<QuestionType> questions = new ArrayList<>();

        ArrayList<Boolean> test = new ArrayList<Boolean>();

        test.add(Boolean.TRUE);
        test.add(Boolean.FALSE);

        CreateSurvey survey = new CreateSurvey("Test", test, new TandF());
        survey.setQuestionType();

        System.out.println(survey.getQuestion());
        System.out.println(survey.getAnswer().toString());
    }

}
