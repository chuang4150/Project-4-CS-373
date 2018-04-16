package Visitor;

import Bridge.Question.MultipleChoice;
import Bridge.Question.Rate;
import Bridge.Question.TandF;

public interface Visitor {

    Boolean visit(Rate rate);

    Boolean visit(TandF tf);

    Boolean visit(MultipleChoice multipleChoice);

}
