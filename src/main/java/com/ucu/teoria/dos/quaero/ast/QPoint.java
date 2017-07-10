package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QPoint extends Exp {
    private Exp operator;

    public QPoint(Exp operator) {
        this.operator = operator;
    }

    @Override
    public List<Object> evaluate() {        
        List<Object> result = new ArrayList<>();
        List<Object> evaluate = operator.evaluate();
        evaluate.forEach(item -> {
            if (item instanceof NodeQ) {
            	result.add(item);
            }
        });
        return result;
    }
    
    
    
    
}
