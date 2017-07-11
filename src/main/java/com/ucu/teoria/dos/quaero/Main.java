package com.ucu.teoria.dos.quaero;

import com.ucu.teoria.dos.quaero.ast.NodeQ;
import com.ucu.teoria.dos.quaero.ast.QRoot;
import com.ucu.teoria.dos.quaero.parser.Parser;

import java.util.Scanner;

/**
 * Created by nachogarrone on 7/3/17.
 */
public class Main {
    public static void showParse(String input) throws Exception {
        NodeQ nodeQ = (NodeQ) (Parser.parse(input).value);
        System.out.println(nodeQ);
    }

    public static void main(String[] args) throws Exception {
//        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder source = new StringBuilder();
//        for (String line = stdIn.readLine(); line != null; line = stdIn.readLine()) {
//            if (line.length() > 0) {
//                source.append(line).append("\n");
//            } else { // Empty line means input ends.
////                showTokens(source.toString());
//                showParse(source.toString());
//            }
//        }


        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        System.out.println("model: " + model);
        NodeQ nodeQ = (NodeQ) (Parser.parse(model).value);
        System.out.println("parsed: " + nodeQ);

        while (scanner.hasNextLine()) {
            String consulta = scanner.nextLine();
            // process the line
            System.out.println("consulta: " + consulta);
            Object o = (Parser.parse(consulta).value);
//            nodeConsulta;
            System.out.println("consulta: " + o);
        }
        scanner.close();
    }
}
