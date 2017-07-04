package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QAttributes extends Exp {
    private Exp operator;

    public QAttributes(Exp operator) {
        this.operator = operator;
    }

    @Override
    public List<Object> evaluate() {
        List<Object> result = new ArrayList<>();
        List<Object> evaluate = operator.evaluate();
        evaluate.forEach(item -> {
            if (item instanceof NodeQ) {
                result.addAll(((NodeQ) item).attributes.values());
            }
        });
        return result;
    }
}
