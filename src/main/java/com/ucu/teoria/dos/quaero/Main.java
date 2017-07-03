package com.ucu.teoria.dos.quaero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by nachogarrone on 7/3/17.
 */
public class Main {
    public static void showParse(String input) throws Exception {
//        Exp exp = (Exp) (Parser.parse(input).value);


//        System.out.println(exp);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder source = new StringBuilder();
        for (String line = stdIn.readLine(); line != null; line = stdIn.readLine()) {
            if (line.length() > 0) {
                source.append(line).append("\n");
            } else { // Empty line means input ends.
//                showTokens(source.toString());
                showParse(source.toString());
            }
        }
    }
}
