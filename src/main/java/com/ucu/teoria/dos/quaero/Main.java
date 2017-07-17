package com.ucu.teoria.dos.quaero;

import com.ucu.teoria.dos.quaero.ast.Exp;
import com.ucu.teoria.dos.quaero.ast.NodeQ;
import com.ucu.teoria.dos.quaero.ast.QRoot;
import com.ucu.teoria.dos.quaero.parser.Parser;

import java.util.Scanner;

/**
 * Created by nachogarrone on 7/3/17.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        System.out.println("model: " + model);
        NodeQ nodeQ = (NodeQ) (Parser.parse(model).value);
        NodeQ.ROOT = nodeQ;
        System.out.println("parsed: " + nodeQ);

        while (scanner.hasNextLine()) {
            String consulta = scanner.nextLine();
            // process the line
            System.out.println("consulta: " + consulta);
            //QRoot root = new QRoot();
            //System.out.println("root parsed: " + root.evaluate());
            Exp exp = (Exp) Parser.parse(consulta).value;
            System.out.println("parsed: " + exp.evaluate());
        }
        scanner.close();
    }
}
