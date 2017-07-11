package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QTag extends Exp {
    private Exp operator;
    private String tag;

    public QTag(Exp operator, String tag) {
        this.operator = operator;
        this.tag = tag;
    }


    @Override
    public List<Object> evaluate() {
        List<Object> result = new ArrayList<>();
        List<Object> evaluate = operator.evaluate();
        evaluate.forEach(item -> {
            if (item instanceof NodeQ) {
                if (((NodeQ) item).tag.equals(tag)) result.add(item);
            }
        });
        return result;
    }
}
