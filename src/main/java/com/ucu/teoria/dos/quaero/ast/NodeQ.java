package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nachogarrone on 7/3/17.
 */
public class NodeQ {
    public static NodeQ ROOT;
    public String tag;
    public List<Object> elements = new ArrayList<>();
    public Map<String, Object> attributes = new HashMap<>();

    @Override
    public String toString() {
        return "NodeQ{tag: " + tag + ", elems: " + elements + ", attrs: " + attributes + "}";
    }
}
