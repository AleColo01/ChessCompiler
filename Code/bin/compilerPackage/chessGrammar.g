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
compilerChecker cc = new compilerChecker();
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
EP : ' ep';
NEWLINE	: '\n';

//FRAGMENTED RULES
moveFrom: (PIECE COLUMN ROW | PIECE COLUMN | PIECE ROW | COLUMN ROW | COLUMN | ROW | PIECE)(TAKE | MINUS)? ;  
moveTo	: COLUMN ROW;
enPassant: EP {};
check	: PLUS PLUS?;
checkmate : HASH;
promotion : EQUALS PIECE;		 		
castleRule: CASTLE MINUS CASTLE (MINUS CASTLE)?;	

//COMPLETE RULE to check with Java class
startRule 
	: (((moveFrom? moveTo (enPassant | promotion)? (check | checkmate)? ) | castleRule)  NEWLINE)*; 

