package Visitor;

import Bridge.Question.MultipleChoice;
import Bridge.Question.Rate;
import Bridge.Question.TandF;

import java.util.ArrayList;

public class AnswerCheckVisitor implements Visitor {

    @Override
    public Boolean visit(Rate rate) {
        System.out.println("Rate!");
        if (rate.getAnswer().contains(Integer.parseInt(rate.getResponse())))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    @Override
    public Boolean visit(TandF tf) {
        System.out.println("True False!");
        if (tf.getAnswer().contains(Boolean.parseBoolean(tf.getResponse())))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    @Override
    public Boolean visit(MultipleChoice multipleChoice) {
        System.out.println("Multiple Choice!");
        if (multipleChoice.getAnswer().contains(multipleChoice.getResponse()))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }
}
