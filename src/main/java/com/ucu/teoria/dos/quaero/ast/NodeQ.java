package com.ucu.teoria.dos.quaero.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nachogarrone on 7/3/17.
 */
public class NodeQ {
    public static String tag;
    public static List<Object> elements = new ArrayList<>();
    public static Map<String, Object> attributes = new HashMap<>();

    public NodeQ() {
    }

    @Override
    public String toString() {
        StringBuilder elems = new StringBuilder();
        elements.forEach(elems::append);
        StringBuilder attrs = new StringBuilder();
        attributes.forEach((k, v) -> attrs.append(k + ":" + v));
        return "NodeQ{tag: " + tag + ", elems: " + elems + ", attrs: " + attrs + "}";
    }
}
