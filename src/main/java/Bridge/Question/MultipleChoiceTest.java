package Bridge.Question;

import Bridge.CreateSurvey;
import Data.Surveys;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTypeTest {

    public ArrayList<CreateSurvey> survey = new ArrayList();

    void createQuestions() {

        ArrayList<Boolean> tf = new ArrayList<Boolean>();
        ArrayList<Integer> rate = new ArrayList<Integer>();
        ArrayList<String> mc = new ArrayList<String>();

        tf.addAll(Arrays.asList(Boolean.TRUE, Boolean.FALSE));
        rate.addAll(Arrays.asList(1, 2, 3, 4, 5));
        mc.addAll(Arrays.asList("Orange", "Pink", "Red"));

        CreateSurvey question1 = new CreateSurvey("Is this code awesome", tf, new TandF());
        question1.setQuestionType();


        CreateSurvey question2 = new CreateSurvey("How Cool is this code", rate, new MultipleChoice());
        question2.setQuestionType();


        CreateSurvey question3 = new CreateSurvey("What color is an orange", mc, new Rate());
        question3.setQuestionType();

        survey.addAll(Arrays.asList(question1, question2, question3));
    }


    @Test
    void getQuestion() {
        createQuestions();
        assertEquals("Is this code awesome", survey.get(0).getQuestion());
    }

    @Test
    void getQuestion2() {
        createQuestions();
        assertEquals("How Cool is this code", survey.get(1).getQuestion());
    }

    @Test
    void getQuestion3() {
        createQuestions();
        assertEquals("What color is an orange", survey.get(2).getQuestion());
    }

    @Test
    void getAnswer() {
        createQuestions();
        assertEquals(Arrays.asList("true", "false"),survey.get(0).getAnswer());}


    @Test
    void getAnswer2() {
        createQuestions();
        assertEquals(Arrays.asList("1", "2", "3", "4", "5"),survey.get(1).getAnswer());}

    @Test
    void getAnswer3() {
        createQuestions();
        assertEquals(Arrays.asList("Orange", "Pink", "Red"),survey.get(2).getAnswer());}
}
//    @Test
//    void getAnswer() {
//        createQuestions();
//        assertArrayEquals(ArrayList<true>, ArrayList<false>), survey.get(0).getAnswer();   }
//}