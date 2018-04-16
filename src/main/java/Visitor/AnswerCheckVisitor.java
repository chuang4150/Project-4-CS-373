package Visitor;

import Bridge.Question.MultipleChoice;
import Bridge.Question.Rate;
import Bridge.Question.TandF;

public class AnswerCheckVisitor implements Visitor {

    @Override
    public Boolean visit(Rate rate) {
        if (rate.getResponse().toLowerCase() == "true" || rate.getResponse().toLowerCase() == "false")
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    @Override
    public Boolean visit(TandF tf) {
        return null;
    }

    @Override
    public Boolean visit(MultipleChoice multipleChoice) {
        return null;
    }
}
