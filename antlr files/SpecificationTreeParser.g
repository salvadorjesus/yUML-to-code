/////////////////////////////
// A parser for the Specification tree
/////////////////////////////
header
{
	import dataModel.*;
	import java.util.List;
	import java.util.ArrayList;
}

class SpecificationTreeParser extends TreeParser; 

options
{
	importVocab = Anasint;
}

//Functions
{
	EntityContainer ec = new EntityContainer();
}


//General
uml_specification returns [List l = null;]
				: #(SPECIFICATION (sentence)+) {l = ec.getEntityList();}
				;

sentence {Entity classObject = null; List clasesList = null;}
		: #(SENTENCE (
					   clasesList = class_relation_class  {ec.addAll(clasesList);} 
					 | classObject = clase                {ec.add(classObject);}
					 )
			)  
		;
	
class_relation_class returns[List clasesList = null;] {Entity c1= null; Entity c2 = null; Relation r = null;}
					:#(CLASS_RELATION_CLASS c1=clase r=relation c2=clase) 
					{clasesList = r.joinClasses(c1,c2);}
					;	
	
//Classes		
clase returns[Entity res= null;]{List lac=null, lmc=null, lai=null, lmi=null;}
		: #(CLASS (v:visibility)? ci:IDENT (lac=list_of_atributes)? (lmc=list_of_methods)?)
		       	{res = new dataModel.Class(ci, v, lac, lmc);}
	 	| #(INTERFACE (visibility)? ii:IDENT (lai=list_of_atributes)? (lmi=list_of_methods)?)   
	 			{res = new dataModel.Interface(ii,lai, lmi);}
	 	;
	

	
list_of_atributes returns [List res=new ArrayList();] {Atribute a;}
			: #(LIST_OF_ATRIBUTES (a = atribute {res.add(a);})+)	
			;

atribute returns[Atribute res=null;]
		: #(n:IDENT (t:type)? (v:visibility)?)
		{res = new Atribute(n, t, v);}
		;	

		
list_of_methods returns[List res=new ArrayList();] {Method m;}
		: #(LIST_OF_METHODS (m = method {res.add(m);} )+)
		;

method returns[Method res=null;] {List l = new ArrayList();}
	: #(n:IDENT (v:visibility)? (t:type)? (l=list_of_parameters)?)
	{res = new Method(n, t, v, l);}
	;
		
list_of_parameters returns[List res=new ArrayList();] {Parameter p;}
				  : #(LIST_OF_PARAMETERS (p=parameter {res.add(p);} )+)
				  ;
				  
parameter returns[Parameter res=null;]
		: #(n:IDENT (t:type)?)
		{ res = new Parameter(n,t);	}
		;
		 
//Relations		 
relation returns [Relation res=null;]
		: #(ASSOCIATION (l:LESS)? (lca:cardinality)? MINUS (rca:cardinality)? (g:GREATER)?  )
																{res = new Relation(Relation.ASSOCIATION, l, lca, rca, g);}
		| #(DEPENDENCY .)										{res = new Relation(Relation.DEPENDENCY);}
		| #(COMPOSITION_SIMBOL (rcc:cardinality)?)				{res = new Relation(Relation.COMPOSITION, rcc);}
		| #(AGREGATION_SIMBOL (rcag:cardinality)?)  			{res = new Relation(Relation.AGREGATION, rcag);}
		| #(GENERALIZATION dg:direction)						{res = new Relation(Relation.GENERALIZATION, dg);}
		| #(IMPLEMENTATION di:direction)						{res = new Relation(Relation.IMPLEMENTATION, di);}
		;
		
//Misc.
visibility: PLUS|MINUS|HASH;
type: IDENT;
cardinality:NUMBER|ASTERISC;
direction:RIGHT_TO_LEFT|LEFT_TO_RIGHT;
		
		
		 