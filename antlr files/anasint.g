/////////////////////////////// 
// Analizador sintáctico 
/////////////////////////////// 
class Anasint extends Parser; 

options
{k=2;
 buildAST = true; 
}

tokens
{
//Global
SPECIFICATION;
SENTENCE;

//Sentence types
CLASS;
INTERFACE;
CLASS_RELATION_CLASS;

//Relations types
ASSOCIATION;
DEPENDENCY;
GENERALIZATION;
IMPLEMENTATION;

//Lists	
LIST_OF_ATRIBUTES;
LIST_OF_METHODS;
LIST_OF_PARAMETERS;

//Auxiliars
LEFT_TO_RIGHT;
RIGHT_TO_LEFT;

}

uml_specification : list_of_sentences EOF!
				 ;
				 
list_of_sentences: (sentence COMA)=>sentence (COMA! sentence)+ 	{##=#(#[SPECIFICATION,"SPECIFICATION"],##);} 
				| sentence 										{##=#(#[SPECIFICATION,"SPECIFICATION"],##);}
				| //Can be void and valid
				; 
				 
sentence : (clase roled_relation) => clase roled_relation clase {##=#(#[SENTENCE,"SENTENCE"],#(#[CLASS_RELATION_CLASS,"CLASS_RELATION_CLASS"],##));}
		 | clase 												{##=#(#[SENTENCE,"SENTENCE"],##);}
		 ;

//	CLASSES	**************************************************

clase : (OSB interface_mark)=>OSB! interface_mark visibility IDENT class_complement CSB! {##=#(#[INTERFACE,"INTERFACE"],##);}
	  |	OSB! visibility IDENT class_complement CSB! 									   {##=#(#[CLASS,"CLASS"],##);}
	  ;
	  
visibility: PLUS
		  | MINUS
		  | HASH
		  |
		  ;
		  
class_complement: atributes methods
				|
				;		  
		  
atributes : (VB)=> VB! list_of_atributes
		  | VB!
		  ;
		  
list_of_atributes: (atribute SC!)+ {##=#(#[LIST_OF_ATRIBUTES,"LIST_OF_ATRIBUTES"],##);}
				 ;
				 
atribute:! v:visibility i:IDENT ( COLON! t:IDENT )? {##=#(#i,#t,#v);}
		;
		 
methods: (VB)=> VB! list_of_methods
		| VB!
		|
		;
		
list_of_methods: (method)+ {##=#(#[LIST_OF_METHODS,"LIST_OF_METHODS"],##);}
				| //So if there is a bar but no methods, there wont be list_of_methods child
			   ;
			   
method:! v:visibility i:IDENT OP! l:list_of_parameters CP! (COLON! t:IDENT)? SC! {##=#(#i,#v, #t, #l);}
	;
	
list_of_parameters: (parameter COMA) => parameter (COMA! parameter)+ {##=#(#[LIST_OF_PARAMETERS,"LIST_OF_PARAMETERS"],##);}
				| parameter											 {##=#(#[LIST_OF_PARAMETERS,"LIST_OF_PARAMETERS"],##);}
				| //Can be void and valid
				;
				
parameter: IDENT^ (COLON! IDENT)?
		;


//	RELATIONS *************************************************
roled_relation: role relation role;

//Role is for doc purpose only.
role!: TEXT
	|
	;

//False non determinism
relation: association
		| generalization
		| implementation
		| composition
		| agregation
		| dependency 		{##=#(#[DEPENDENCY,"DEPENDENCY"]);} //Dependencies are ignored
		;
	
	
//Associations-------------------------	 							
association: (bidirectional_ass) => bidirectional_ass
			| (directional_ass) => directional_ass
			| adirectional_ass
			;
			
bidirectional_ass: LESS cardinality line cardinality GREATER 	{##=#(#[ASSOCIATION,"ASSOCIATION"],##);}
				;
				
directional_ass: (LESS cardinality line) => LESS cardinality line cardinality					{##=#(#[ASSOCIATION,"ASSOCIATION"],##);}
				| (cardinality line cardinality) => cardinality line cardinality GREATER		{##=#(#[ASSOCIATION,"ASSOCIATION"],##);}
				;
				
adirectional_ass: cardinality line cardinality {##=#(#[ASSOCIATION,"ASSOCIATION"],##);}
				;

//Simpler relations---------------------				
generalization:!  CIRCUNFLEX line 	{##=#(#[GENERALIZATION,"GENERALIZATION"],#[RIGHT_TO_LEFT,"RIGHT_TO_LEFT"]);}
				| line CIRCUNFLEX	{##=#(#[GENERALIZATION,"GENERALIZATION"],#[LEFT_TO_RIGHT,"LEFT_TO_RIGHT"]);}
				;

//http://publib.boulder.ibm.com/infocenter/rtnlhelp/v6r0m0/index.jsp?topic=/com.ibm.xtools.modeler.doc/topics/cgeneral.html				
implementation:! CIRCUNFLEX DOTED_LINE 	{##=#(#[IMPLEMENTATION,"IMPLEMENTATION"],#[RIGHT_TO_LEFT,"RIGHT_TO_LEFT"]);}
			  |  DOTED_LINE CIRCUNFLEX	{##=#(#[IMPLEMENTATION,"IMPLEMENTATION"],#[LEFT_TO_RIGHT,"LEFT_TO_RIGHT"]);}
			  ;
			  
composition: COMPOSITION_SIMBOL^ cardinality GREATER!
			;

agregation: AGREGATION_SIMBOL^ cardinality GREATER!
			;
	
//Dependencies-----------------------
//Dependencies are checked sintaxtically but ignored semantically	
			
dependency: (bidirectional_dep) => bidirectional_dep
			| (directional_dep) => directional_dep
			| adirectional_dep
			;
			
bidirectional_dep: LESS cardinality DOTED_LINE^ cardinality GREATER
				;
				
directional_dep: (LESS cardinality DOTED_LINE) => LESS cardinality DOTED_LINE cardinality
				| (cardinality DOTED_LINE) =>cardinality DOTED_LINE cardinality GREATER
				;
				
adirectional_dep: cardinality DOTED_LINE cardinality
				;

//Misc-----------------

cardinality: NUMBER
			|ASTERISC
			|
			;

line: MINUS;		

interface_mark:! LESS INTERFACE_TOKEN GREATER
		;