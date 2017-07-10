package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QIntersec extends Exp {
    private Exp operator1;
    private Exp operator2;

    public QIntersec(Exp operator1, Exp operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    @Override
    public List<Object> evaluate() {
        List<Object> result = new ArrayList<>();
        List<Object> evaluate1 = operator1.evaluate();
        List<Object> evaluate2 = operator2.evaluate();
        evaluate1.retainAll(evaluate2);
        
        return evaluate1;
    }
    
    
}
