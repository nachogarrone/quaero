package com.ucu.teoria.dos.quaero;

import static org.junit.Assert.*;

import java.io.StringReader;

import org.junit.Test;

import com.sun.java_cup.internal.runtime.Symbol;
import com.ucu.teoria.dos.quaero.ast.NodeQ;
import com.ucu.teoria.dos.quaero.parser.Lexer;
import com.ucu.teoria.dos.quaero.parser.Parser;

/**
 * Created by nachogarrone on 7/4/17.
 */
public class UnitTest {

    @Test
    public void test1() throws Exception
    {try{
//    	String query = "Persona(nombre:false,edad:13)";
//    	NodeQ n = new NodeQ();
//    	n.tag = "Persona";
//    	n.attributes.put("nombre",false);
//    	n.attributes.put("edad",13);
//    	
//    	assertEquals(n,parseString(query));
    }
    catch(Exception ex){
    
    }
    }

	
	public static Lexer makeLexer(String input) throws Exception 
	{
		return new Lexer(new StringReader(input));
	}
	
	
	public static Parser makeParser(String input) throws Exception 
	{
		return new Parser(makeLexer(input));
	}
	
	public static Object parseString(String input) throws Exception 
	{
		Parser parser = makeParser(input);
		java_cup.runtime.Symbol result = parser.parse();
		return result.value;
	}

}
