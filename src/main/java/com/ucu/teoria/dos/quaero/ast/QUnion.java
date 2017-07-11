package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QUnion extends Exp {
    private Exp operator1;
    private Exp operator2;

    public QUnion(Exp operator1, Exp operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    @Override
    public List<Object> evaluate() {
        List<Object> result = new ArrayList<>();
        List<Object> evaluate = operator1.evaluate();
        List<Object> evaluate2 = operator2.evaluate();
        evaluate.forEach(item -> {
            if (item instanceof NodeQ) {
                result.addAll(((NodeQ) item).elements);
            }
        });
        evaluate2.forEach(item -> {
            if (item instanceof NodeQ) {
                ((NodeQ) item).elements.forEach(nodo -> {
                    if (!result.contains(nodo)) result.add(nodo);
                });
            }
        });
        return result;
    }


}
