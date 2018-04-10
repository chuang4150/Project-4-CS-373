package Client;

import Bridge.CreateSurvey;
import Bridge.Question.MultipleChoice;
import Bridge.Question.Rate;
import Bridge.Question.TandF;
import Data.Surveys;

import java.util.ArrayList;
import java.util.Arrays;

//Main class that sets AnswerSurvey as an observer to Surveys and create three surveys one after the other to demonstrate the observer

public class main {

    public static void main(final String[] args){

        Surveys surveys = new Surveys();
        AnswerSurvey answerSurvey = new AnswerSurvey();

        surveys.Attach(answerSurvey);


        ArrayList<Boolean> tf = new ArrayList<Boolean>();
        ArrayList<Integer> rate = new ArrayList<Integer>();
        ArrayList<String> mc = new ArrayList<String>();

        tf.addAll(Arrays.asList(Boolean.TRUE,Boolean.FALSE));
        rate.addAll(Arrays.asList(1,2,3,4,5));
        mc.addAll(Arrays.asList("Orange","Pink","Red"));

        CreateSurvey question1 = new CreateSurvey("Is this code awesome", tf, new TandF());
        question1.setQuestionType();

        surveys.addSurvey(question1);

        CreateSurvey question2 = new CreateSurvey("How Cool is this code", rate, new MultipleChoice());
        question2.setQuestionType();

        surveys.addSurvey(question2);

        CreateSurvey question3 = new CreateSurvey("What color is an orange", mc, new Rate());
        question3.setQuestionType();

        surveys.addSurvey(question3);

        //survey.addAll(Arrays.asList(question1,question2,question3));

        /*for (int i = 0; i < survey.size(); i++){
            System.out.println(survey.get(i).getQuestion());
            System.out.println(survey.get(i).getAnswer().toString());
        }*/
    }

}
