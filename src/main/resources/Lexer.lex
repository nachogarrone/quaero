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

[a-zA-Z_][a-zA-Z0-9_]* { String $1 = yytext(); return new Symbol(TAG, yyline, yycolumn, $1); }

[a-zA-Z0-9_]* { String $1 = yytext(); return new Symbol(STR, yyline, yycolumn, $1); }
[0-9]* { String $1 = yytext(); return new Symbol(NUM, yyline, yycolumn, $1); }

,		{ return new Symbol(COMMA); }
:		{ return new Symbol(COLON); }
\(		{ return new Symbol(LPAREN); }
\)		{ return new Symbol(RPAREN); }


.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!");
	}

[ \t\r\n\f]+ {}