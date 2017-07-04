package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class QRoot extends Exp {
    // Contiene la raiz del nodo $
    @Override
    public List<Object> evaluate() {
        List<Object> res = new ArrayList<>();
        res.add(0, NodeQ.getInstance());
        return res;
    }
}
