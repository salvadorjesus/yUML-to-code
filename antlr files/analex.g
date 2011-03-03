/////////////////////////////// 
// Analizador léxico 
/////////////////////////////// 
 
class Analex extends Lexer; 

options
{k=3;
 importVocab = anasint;	
}


tokens
{NOTE = "note:";
 INTERFACE_TOKEN = "interface";
}
 
WHITE: (' '|'\t'|"\r\n") {$setType(Token.SKIP);}; 

protected LETTER : ('a'..'z')|('A'..'Z')|'_'; 
 
protected DIGIT : '0'..'9';

TEXT: '\"' (options {greedy = false; }:.)* '\"' ;

NUMBER : (DIGIT)+; 

IDENT : LETTER(LETTER|DIGIT)*;

OSB : '[';
CSB : ']';
PLUS : '+';
MINUS : '-';
HASH : '#';
VB: '|';
SC : ';';
COLON : ':';
OP : '(';
CP : ')';
COMA : ',';
LESS : '<';
GREATER : '>';
LINE : '-';
CIRCUNFLEX : '^';
DOTED_LINE : "-.-";
COMPOSITION_SIMBOL : "<>";
AGREGATION_SIMBOL : "++-";
ASTERISC: '*';


// PLUS: '+';
// PLUSPLUS:"++";
// MINUS:"-";


//ARROW	:'<'
//		|'>'
	//	|MAS_FLECHA
		//|MAS_FLECHA MAS_FLECHA
//		|"<>"
//		|'^'
//		;
		
//CARDINALITY:'1'|'*'|"1..*";

//Poner K=2
//LINEA:"-.-"
//	;
	
//CA:'[';
//CC:']';


//¿No determinismo con flecha?
//ALMOHADILLA:'#';
//SEPARADOR:'|';
//INTERFAZ:"<<interface>>";
//PA:'(';
//PC:')';
//DP:':';
//PyC: ';';
 
 
 
 
 
