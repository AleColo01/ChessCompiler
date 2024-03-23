grammar chessGrammar;

options {
  language = Java;
  k = 4;		
}

@lexer::header{
package compilerPackage;
}

@lexer::members{
}

@header{
package compilerPackage;
import compilerPackage.*;
}
 
@members {
compilerChecker cc = new compilerChecker();
}

PIECE : ('R' | 'B' | 'N' | 'Q' | 'K' | 'P');
COLUMN  : 'a'..'h' ;
ROW  : '1'..'8' ;
MINUS : '-';
PLUS : '+';
EQUALS : '=';
HASH : '#';
TAKE : ('x' | ':');
CASTLE : 'O';
EP : ' ep';
NEWLINE	: '\r'? '\n';

//FRAGMENTED RULES
moveFrom
	:  (PIECE COLUMN? ROW? (TAKE | MINUS)?) |
	   (COLUMN TAKE)	

;
moveTo	: 
	COLUMN ROW
;
enPassant: EP;
check	: PLUS PLUS?;
checkmate : HASH;
promotion : EQUALS PIECE;		 		
castleRule: CASTLE MINUS CASTLE (MINUS CASTLE)?;	

//COMPLETE RULE to check with Java class
startRule 
    : (move (NEWLINE | EOF))*;
    
move
    : (moveFrom? moveTo (enPassant | promotion)? (check | checkmate)?) | castleRule;
