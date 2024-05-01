grammar chessGrammar;

options {
  language = Java;
  k = 15;		
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

	public semanticHandler getHandler () {
		return cc.sh;
	}
	
	 public void displayRecognitionError(String[] tokenNames,
                                       RecognitionException e) {
		// in tokenNames c'è la lista dei token che si sarebbe voluto trovare
		// token che genera l'errore
		Token tk = input.LT(1);
    // header e corpo dell'errore gestito automaticamente da ANTLR
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		
		// passo tutto all'handler che lo 
		cc.sh.handleError(tokenNames, tk, e, hdr, msg);
  }

}

PIECE : ('R' | 'B' | 'N' | 'Q' | 'K' | 'P');
COLUMN  : 'a'..'h';
INT  : '0'..'9'+;
MINUS : '-';
PLUS : '+';
EQUALS : '=';
HASH : '#';
TAKE : ('x' | ':');
CASTLE : 'O';
EP : ' ep';
TAB : '\t';
POINT : '.';
NEWLINE	: '\r'? '\n';
OPEN	: '[';
CLOSE	: ']';
TURN : ('white' | 'black');
SC : ';';


//FRAGMENTED RULES
preamble
	:
	t=TURN {cc.setPrambleStartTurn($t);}
	EQUALS 
	OPEN 
	(p=PIECE c=COLUMN r=INT SC {cc.checkPreamblePlacement($p,$t,$r,$c);})* 
	(p1=PIECE c1=COLUMN r1=INT {cc.checkPreamblePlacement($p1,$t,$r1,$c1);}) 
	CLOSE
	;	

turnNum	:	
	v=INT {
		cc.setTurnNumber($v);
    		cc.isTurnCorrect();
    		}
	;
	
moveFrom :  
	(p=PIECE {cc.setPiece($p);}
	(c=COLUMN {cc.setColFrom($c);})?
	(r=INT {cc.setRowFrom($r);})?
	((t=TAKE | t=MINUS) {cc.setTake($t);})?)  |
	((c=COLUMN t=TAKE)	{cc.setTake($t);
	   			 cc.setColFrom($c);})
;
moveTo	: 
	c=COLUMN {cc.setColTo($c);}
	r=INT {cc.setRowTo($r);
		cc.setLastToken($r); }
;

enPassant: EP	{cc.setEnpassant();};

check	: PLUS {cc.setChecks();}
	 (PLUS {cc.setChecks();})?
	  ;
	  
checkmate : HASH {cc.setCheckMate();};

promotion : EQUALS p=PIECE {cc.setPromotion($p);};	
 		
castleRule: 
	t=CASTLE {cc.setLastToken($t);} 
	MINUS {int i=1;}
	CASTLE 
	(MINUS CASTLE {i = 2;})?
	
	{cc.setCastle(i);};

//COMPLETE RULE to check with Java class

startRule 
    : (preamble NEWLINE preamble NEWLINE)? {cc.checkChessboard();}
    (blackStartingTurn flag=(NEWLINE | EOF))? {cc.checkCorrectStartingTurn();
	    					if($flag != null){
	    					    	cc.processMove();
	    					 	cc.nextTurn();
	    					}		
						}
    (turn (NEWLINE | EOF) )*
    (lastTurn EOF)?;
    
turn
    : turnNum 
    	POINT 
    	TAB 
    	move {cc.processMove();
    		cc.nextTurn();} 
    	TAB 
    	move {cc.processMove();
    		cc.nextTurn();};
    
lastTurn
	: turnNum 
    		POINT 
    		TAB 
    		move {cc.processMove();
    			cc.nextTurn();}
    			;

blackStartingTurn
    : turnNum 
    	POINT 
    	TAB 
    	TAB 
    	move {cc.setBlackStarting();};
    
move
    : ((moveFrom? 
    		moveTo 
    		(enPassant | promotion)? 
    		(check | checkmate)?) 
    	| castleRule) ;
