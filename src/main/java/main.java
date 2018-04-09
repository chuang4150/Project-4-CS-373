import Bridge.Questions.MultipleChoice;
import Bridge.Questions.QuestionType;
import Bridge.Questions.Rate;
import Bridge.Questions.Surveys.CreateSurvey;
import Bridge.Questions.TandF;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(final String[] args){
        ArrayList<CreateSurvey> survey = new ArrayList<>();
        ArrayList<Boolean> tf = new ArrayList<Boolean>();
        ArrayList<Integer> rate = new ArrayList<Integer>();
        ArrayList<String> mc = new ArrayList<String>();

        tf.addAll(Arrays.asList(Boolean.TRUE,Boolean.FALSE));
        rate.addAll(Arrays.asList(1,2,3,4,5));
        mc.addAll(Arrays.asList("Orange","Pink","Red"));

        CreateSurvey question1 = new CreateSurvey("Is this code awesome", tf, new TandF());
        question1.setQuestionType();

        CreateSurvey question2 = new CreateSurvey("How Cool is this code", rate, new MultipleChoice());
        question2.setQuestionType();

        CreateSurvey question3 = new CreateSurvey("What color is an orange", mc, new Rate());
        question3.setQuestionType();

        survey.addAll(Arrays.asList(question1,question2,question3));

        for (int i = 0; i < survey.size(); i++){
            System.out.println(survey.get(i).getQuestion());
            System.out.println(survey.get(i).getAnswer().toString());
        }
    }

}
