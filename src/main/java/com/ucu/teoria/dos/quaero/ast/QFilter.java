package com.ucu.teoria.dos.quaero.ast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QFilter extends Exp {
    private Exp operator;
    private String regex;
    
    public QFilter(Exp operator, String regex) {
        this.operator = operator;
        this.regex = regex;
    }
    

    @Override
    public List<Object> evaluate() {
        List<Object> result = new ArrayList<>();
        List<Object> evaluate = operator.evaluate();
        Pattern pattern = Pattern.compile(regex);   		
        evaluate.forEach(item -> {
            if (item instanceof NodeQ) {
                ((NodeQ) item).attributes.forEach((k,v)->{            		
            		Matcher m = pattern.matcher(k);
            		if (m.find()) result.add(item);
            	});                
            }
        });
        return result;
    }
}
