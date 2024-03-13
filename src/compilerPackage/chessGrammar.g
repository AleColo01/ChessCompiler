grammar chessGrammar;

options {
  language = Java;
  k = 1;		
}

@lexer::header{
package compilerPackage;
}

@lexer::members{
}

@header{
package compilerPackage;
}
 
@members {
}

PIECE : ('T' | 'A' | 'C' | 'D' | 'R' | 'P');
COLUMN  : 'a'..'h' ;
ROW  : '1'..'8' ;
MINUS : '-';
PLUS : '+';
EQUALS : '=';
HASH : '#';
TAKE : ('x' | ':');
CASTLE : 'O';
EP : 'ep';

startRule: longNotation | castleRule;
longNotation: PIECE COLUMN ROW (TAKE | MINUS) COLUMN ROW;
//ARROCCO
castleRule: CASTLE MINUS CASTLE (MINUS CASTLE)?;	 

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/