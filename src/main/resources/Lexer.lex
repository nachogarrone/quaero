package com.ucu.teoria.dos.quaero.parser;

import java_cup.runtime.Symbol;

%%

%unicode
%line
%column
%public
%class Lexer
%cupsym Tokens
%cup
%implements Tokens

%{
	/* Embedded lexer class code */
%}

%%
// Tokens.

true		{ return new Symbol(TRUE); }
false		{ return new Symbol(FALSE); }

[a-zA-Z_][a-zA-Z0-9_]*  { return new Symbol(TAG, yyline, yycolumn, yytext()); }
[0-9]*                  { return new Symbol(NUM, yyline, yycolumn, yytext()); }
[a-zA-Z0-9_]*           { return new Symbol(STR, yyline, yycolumn, yytext()); }

,		{ return new Symbol(COMMA); }
:		{ return new Symbol(COLON); }
\(		{ return new Symbol(LPAREN); }
\)		{ return new Symbol(RPAREN); }

"$" 	{ return new Symbol(ROOT); }
"/" 	{ return new Symbol(ELEMENTS); }
"~" 	{ return new Symbol(RE); }
"." 	{ return new Symbol(POINT); }
"&" 	{ return new Symbol(INTERSEC); }
"|" 	{ return new Symbol(UNION); }
"+" 	{ return new Symbol(CONCAT); }
"-" 	{ return new Symbol(DIFERENCIA); }


.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!");
	}

[ \t\r\n\f]+ {}