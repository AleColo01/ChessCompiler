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
public compilerChecker cc = new compilerChecker();
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
INT : '0'..'9'+;
SPACE : ' ';
POINT : '.';
NEWLINE	: '\r'? '\n';

//FRAGMENTED RULES
moveFrom :  
	(p=PIECE {cc.setPiece($p);}
	(c=COLUMN {cc.setColFrom($c);})?
	(r=ROW {cc.setRowFrom($r);})?
	((t=TAKE | t=MINUS) {cc.setTake($t);})?)  |
	((c=COLUMN t=TAKE)	{cc.setTake($t);
	   			 cc.setColFrom($c);})
;
moveTo	: 
	c=COLUMN {cc.setColTo($c);}
	r=ROW {cc.setRowTo($r);}
;
enPassant: EP	{cc.setEnpassant();};
check	: PLUS {cc.setChecks();}
	 (PLUS {cc.setChecks();})?
	  ;
checkmate : HASH {cc.setCheckMate();};
promotion : EQUALS p=PIECE {cc.setPromotion($p);};	 		
castleRule: 
	CASTLE 
	MINUS {int i=1;}
	CASTLE 
	(MINUS CASTLE {i = 2;})?
	
	{cc.setCastle(i);};

//COMPLETE RULE to check with Java class
startRule 
    : (turn (NEWLINE | EOF))*;
    
turn
    :  (value+=INT+ POINT SPACE move SPACE move) {cc.setTurnNumber(value);};
    
move
    : ((moveFrom? moveTo (enPassant | promotion)? (check | checkmate)?) | castleRule) {cc.processMove();};
