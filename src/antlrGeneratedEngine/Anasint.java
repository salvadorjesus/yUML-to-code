package antlrGeneratedEngine;
// $ANTLR : "anasint.g" -> "Anasint.java"$

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class Anasint extends antlr.LLkParser       implements AnasintTokenTypes
 {

protected Anasint(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public Anasint(TokenBuffer tokenBuf) {
  this(tokenBuf,2);
}

protected Anasint(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public Anasint(TokenStream lexer) {
  this(lexer,2);
}

public Anasint(ParserSharedInputState state) {
  super(state,2);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void uml_specification() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST uml_specification_AST = null;
		
		try {      // for error handling
			list_of_sentences();
			astFactory.addASTChild(currentAST, returnAST);
			match(Token.EOF_TYPE);
			uml_specification_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_0);
			} else {
			  throw ex;
			}
		}
		returnAST = uml_specification_AST;
	}
	
	public final void list_of_sentences() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST list_of_sentences_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1320 = false;
			if (((LA(1)==OSB) && (_tokenSet_1.member(LA(2))))) {
				int _m1320 = mark();
				synPredMatched1320 = true;
				inputState.guessing++;
				try {
					{
					sentence();
					match(COMA);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1320 = false;
				}
				rewind(_m1320);
inputState.guessing--;
			}
			if ( synPredMatched1320 ) {
				sentence();
				astFactory.addASTChild(currentAST, returnAST);
				{
				int _cnt1322=0;
				_loop1322:
				do {
					if ((LA(1)==COMA)) {
						match(COMA);
						sentence();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						if ( _cnt1322>=1 ) { break _loop1322; } else {throw new NoViableAltException(LT(1), getFilename());}
					}
					
					_cnt1322++;
				} while (true);
				}
				if ( inputState.guessing==0 ) {
					list_of_sentences_AST = (AST)currentAST.root;
					list_of_sentences_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(SPECIFICATION,"SPECIFICATION")).add(list_of_sentences_AST));
					currentAST.root = list_of_sentences_AST;
					currentAST.child = list_of_sentences_AST!=null &&list_of_sentences_AST.getFirstChild()!=null ?
						list_of_sentences_AST.getFirstChild() : list_of_sentences_AST;
					currentAST.advanceChildToEnd();
				}
				list_of_sentences_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==OSB) && (_tokenSet_1.member(LA(2)))) {
				sentence();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					list_of_sentences_AST = (AST)currentAST.root;
					list_of_sentences_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(SPECIFICATION,"SPECIFICATION")).add(list_of_sentences_AST));
					currentAST.root = list_of_sentences_AST;
					currentAST.child = list_of_sentences_AST!=null &&list_of_sentences_AST.getFirstChild()!=null ?
						list_of_sentences_AST.getFirstChild() : list_of_sentences_AST;
					currentAST.advanceChildToEnd();
				}
				list_of_sentences_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==EOF)) {
				list_of_sentences_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_0);
			} else {
			  throw ex;
			}
		}
		returnAST = list_of_sentences_AST;
	}
	
	public final void sentence() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST sentence_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1325 = false;
			if (((LA(1)==OSB) && (_tokenSet_1.member(LA(2))))) {
				int _m1325 = mark();
				synPredMatched1325 = true;
				inputState.guessing++;
				try {
					{
					clase();
					roled_relation();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1325 = false;
				}
				rewind(_m1325);
inputState.guessing--;
			}
			if ( synPredMatched1325 ) {
				clase();
				astFactory.addASTChild(currentAST, returnAST);
				roled_relation();
				astFactory.addASTChild(currentAST, returnAST);
				clase();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					sentence_AST = (AST)currentAST.root;
					sentence_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(SENTENCE,"SENTENCE")).add((AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(CLASS_RELATION_CLASS,"CLASS_RELATION_CLASS")).add(sentence_AST))));
					currentAST.root = sentence_AST;
					currentAST.child = sentence_AST!=null &&sentence_AST.getFirstChild()!=null ?
						sentence_AST.getFirstChild() : sentence_AST;
					currentAST.advanceChildToEnd();
				}
				sentence_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==OSB) && (_tokenSet_1.member(LA(2)))) {
				clase();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					sentence_AST = (AST)currentAST.root;
					sentence_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(SENTENCE,"SENTENCE")).add(sentence_AST));
					currentAST.root = sentence_AST;
					currentAST.child = sentence_AST!=null &&sentence_AST.getFirstChild()!=null ?
						sentence_AST.getFirstChild() : sentence_AST;
					currentAST.advanceChildToEnd();
				}
				sentence_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_2);
			} else {
			  throw ex;
			}
		}
		returnAST = sentence_AST;
	}
	
	public final void clase() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST clase_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1328 = false;
			if (((LA(1)==OSB) && (LA(2)==LESS))) {
				int _m1328 = mark();
				synPredMatched1328 = true;
				inputState.guessing++;
				try {
					{
					match(OSB);
					interface_mark();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1328 = false;
				}
				rewind(_m1328);
inputState.guessing--;
			}
			if ( synPredMatched1328 ) {
				match(OSB);
				interface_mark();
				astFactory.addASTChild(currentAST, returnAST);
				visibility();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp4_AST = null;
				tmp4_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp4_AST);
				match(IDENT);
				class_complement();
				astFactory.addASTChild(currentAST, returnAST);
				match(CSB);
				if ( inputState.guessing==0 ) {
					clase_AST = (AST)currentAST.root;
					clase_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(INTERFACE,"INTERFACE")).add(clase_AST));
					currentAST.root = clase_AST;
					currentAST.child = clase_AST!=null &&clase_AST.getFirstChild()!=null ?
						clase_AST.getFirstChild() : clase_AST;
					currentAST.advanceChildToEnd();
				}
				clase_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==OSB) && (_tokenSet_3.member(LA(2)))) {
				match(OSB);
				visibility();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp7_AST = null;
				tmp7_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp7_AST);
				match(IDENT);
				class_complement();
				astFactory.addASTChild(currentAST, returnAST);
				match(CSB);
				if ( inputState.guessing==0 ) {
					clase_AST = (AST)currentAST.root;
					clase_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(CLASS,"CLASS")).add(clase_AST));
					currentAST.root = clase_AST;
					currentAST.child = clase_AST!=null &&clase_AST.getFirstChild()!=null ?
						clase_AST.getFirstChild() : clase_AST;
					currentAST.advanceChildToEnd();
				}
				clase_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_4);
			} else {
			  throw ex;
			}
		}
		returnAST = clase_AST;
	}
	
	public final void roled_relation() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST roled_relation_AST = null;
		
		try {      // for error handling
			role();
			astFactory.addASTChild(currentAST, returnAST);
			relation();
			astFactory.addASTChild(currentAST, returnAST);
			role();
			astFactory.addASTChild(currentAST, returnAST);
			roled_relation_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_5);
			} else {
			  throw ex;
			}
		}
		returnAST = roled_relation_AST;
	}
	
	public final void interface_mark() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST interface_mark_AST = null;
		
		try {      // for error handling
			AST tmp9_AST = null;
			tmp9_AST = astFactory.create(LT(1));
			match(LESS);
			AST tmp10_AST = null;
			tmp10_AST = astFactory.create(LT(1));
			match(INTERFACE_TOKEN);
			AST tmp11_AST = null;
			tmp11_AST = astFactory.create(LT(1));
			match(GREATER);
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_3);
			} else {
			  throw ex;
			}
		}
		returnAST = interface_mark_AST;
	}
	
	public final void visibility() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST visibility_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case PLUS:
			{
				AST tmp12_AST = null;
				tmp12_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp12_AST);
				match(PLUS);
				visibility_AST = (AST)currentAST.root;
				break;
			}
			case MINUS:
			{
				AST tmp13_AST = null;
				tmp13_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp13_AST);
				match(MINUS);
				visibility_AST = (AST)currentAST.root;
				break;
			}
			case HASH:
			{
				AST tmp14_AST = null;
				tmp14_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp14_AST);
				match(HASH);
				visibility_AST = (AST)currentAST.root;
				break;
			}
			case IDENT:
			{
				visibility_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_6);
			} else {
			  throw ex;
			}
		}
		returnAST = visibility_AST;
	}
	
	public final void class_complement() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST class_complement_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case VB:
			{
				atributes();
				astFactory.addASTChild(currentAST, returnAST);
				methods();
				astFactory.addASTChild(currentAST, returnAST);
				class_complement_AST = (AST)currentAST.root;
				break;
			}
			case CSB:
			{
				class_complement_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = class_complement_AST;
	}
	
	public final void atributes() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST atributes_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1333 = false;
			if (((LA(1)==VB) && (_tokenSet_3.member(LA(2))))) {
				int _m1333 = mark();
				synPredMatched1333 = true;
				inputState.guessing++;
				try {
					{
					match(VB);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1333 = false;
				}
				rewind(_m1333);
inputState.guessing--;
			}
			if ( synPredMatched1333 ) {
				match(VB);
				list_of_atributes();
				astFactory.addASTChild(currentAST, returnAST);
				atributes_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==VB) && (LA(2)==CSB||LA(2)==VB)) {
				match(VB);
				atributes_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
		returnAST = atributes_AST;
	}
	
	public final void methods() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST methods_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1341 = false;
			if (((LA(1)==VB) && ((LA(2) >= IDENT && LA(2) <= HASH)))) {
				int _m1341 = mark();
				synPredMatched1341 = true;
				inputState.guessing++;
				try {
					{
					match(VB);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1341 = false;
				}
				rewind(_m1341);
inputState.guessing--;
			}
			if ( synPredMatched1341 ) {
				match(VB);
				list_of_methods();
				astFactory.addASTChild(currentAST, returnAST);
				methods_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==VB) && (LA(2)==CSB)) {
				match(VB);
				methods_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==CSB)) {
				methods_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = methods_AST;
	}
	
	public final void list_of_atributes() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST list_of_atributes_AST = null;
		
		try {      // for error handling
			{
			int _cnt1336=0;
			_loop1336:
			do {
				if ((_tokenSet_3.member(LA(1)))) {
					atribute();
					astFactory.addASTChild(currentAST, returnAST);
					match(SC);
				}
				else {
					if ( _cnt1336>=1 ) { break _loop1336; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt1336++;
			} while (true);
			}
			if ( inputState.guessing==0 ) {
				list_of_atributes_AST = (AST)currentAST.root;
				list_of_atributes_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(LIST_OF_ATRIBUTES,"LIST_OF_ATRIBUTES")).add(list_of_atributes_AST));
				currentAST.root = list_of_atributes_AST;
				currentAST.child = list_of_atributes_AST!=null &&list_of_atributes_AST.getFirstChild()!=null ?
					list_of_atributes_AST.getFirstChild() : list_of_atributes_AST;
				currentAST.advanceChildToEnd();
			}
			list_of_atributes_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_8);
			} else {
			  throw ex;
			}
		}
		returnAST = list_of_atributes_AST;
	}
	
	public final void atribute() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST atribute_AST = null;
		AST v_AST = null;
		Token  i = null;
		AST i_AST = null;
		Token  t = null;
		AST t_AST = null;
		
		try {      // for error handling
			visibility();
			v_AST = (AST)returnAST;
			i = LT(1);
			i_AST = astFactory.create(i);
			match(IDENT);
			{
			switch ( LA(1)) {
			case COLON:
			{
				match(COLON);
				t = LT(1);
				t_AST = astFactory.create(t);
				match(IDENT);
				break;
			}
			case SC:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			if ( inputState.guessing==0 ) {
				atribute_AST = (AST)currentAST.root;
				atribute_AST=(AST)astFactory.make( (new ASTArray(3)).add(i_AST).add(t_AST).add(v_AST));
				currentAST.root = atribute_AST;
				currentAST.child = atribute_AST!=null &&atribute_AST.getFirstChild()!=null ?
					atribute_AST.getFirstChild() : atribute_AST;
				currentAST.advanceChildToEnd();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_9);
			} else {
			  throw ex;
			}
		}
		returnAST = atribute_AST;
	}
	
	public final void list_of_methods() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST list_of_methods_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case IDENT:
			case PLUS:
			case MINUS:
			case HASH:
			{
				{
				int _cnt1344=0;
				_loop1344:
				do {
					if ((_tokenSet_3.member(LA(1)))) {
						method();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						if ( _cnt1344>=1 ) { break _loop1344; } else {throw new NoViableAltException(LT(1), getFilename());}
					}
					
					_cnt1344++;
				} while (true);
				}
				if ( inputState.guessing==0 ) {
					list_of_methods_AST = (AST)currentAST.root;
					list_of_methods_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(LIST_OF_METHODS,"LIST_OF_METHODS")).add(list_of_methods_AST));
					currentAST.root = list_of_methods_AST;
					currentAST.child = list_of_methods_AST!=null &&list_of_methods_AST.getFirstChild()!=null ?
						list_of_methods_AST.getFirstChild() : list_of_methods_AST;
					currentAST.advanceChildToEnd();
				}
				list_of_methods_AST = (AST)currentAST.root;
				break;
			}
			case CSB:
			{
				list_of_methods_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_7);
			} else {
			  throw ex;
			}
		}
		returnAST = list_of_methods_AST;
	}
	
	public final void method() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST method_AST = null;
		AST v_AST = null;
		Token  i = null;
		AST i_AST = null;
		AST l_AST = null;
		Token  t = null;
		AST t_AST = null;
		
		try {      // for error handling
			visibility();
			v_AST = (AST)returnAST;
			i = LT(1);
			i_AST = astFactory.create(i);
			match(IDENT);
			match(OP);
			list_of_parameters();
			l_AST = (AST)returnAST;
			match(CP);
			{
			switch ( LA(1)) {
			case COLON:
			{
				match(COLON);
				t = LT(1);
				t_AST = astFactory.create(t);
				match(IDENT);
				break;
			}
			case SC:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(SC);
			if ( inputState.guessing==0 ) {
				method_AST = (AST)currentAST.root;
				method_AST=(AST)astFactory.make( (new ASTArray(4)).add(i_AST).add(v_AST).add(t_AST).add(l_AST));
				currentAST.root = method_AST;
				currentAST.child = method_AST!=null &&method_AST.getFirstChild()!=null ?
					method_AST.getFirstChild() : method_AST;
				currentAST.advanceChildToEnd();
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_10);
			} else {
			  throw ex;
			}
		}
		returnAST = method_AST;
	}
	
	public final void list_of_parameters() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST list_of_parameters_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1349 = false;
			if (((LA(1)==IDENT) && (LA(2)==COMA||LA(2)==COLON))) {
				int _m1349 = mark();
				synPredMatched1349 = true;
				inputState.guessing++;
				try {
					{
					parameter();
					match(COMA);
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1349 = false;
				}
				rewind(_m1349);
inputState.guessing--;
			}
			if ( synPredMatched1349 ) {
				parameter();
				astFactory.addASTChild(currentAST, returnAST);
				{
				int _cnt1351=0;
				_loop1351:
				do {
					if ((LA(1)==COMA)) {
						match(COMA);
						parameter();
						astFactory.addASTChild(currentAST, returnAST);
					}
					else {
						if ( _cnt1351>=1 ) { break _loop1351; } else {throw new NoViableAltException(LT(1), getFilename());}
					}
					
					_cnt1351++;
				} while (true);
				}
				if ( inputState.guessing==0 ) {
					list_of_parameters_AST = (AST)currentAST.root;
					list_of_parameters_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(LIST_OF_PARAMETERS,"LIST_OF_PARAMETERS")).add(list_of_parameters_AST));
					currentAST.root = list_of_parameters_AST;
					currentAST.child = list_of_parameters_AST!=null &&list_of_parameters_AST.getFirstChild()!=null ?
						list_of_parameters_AST.getFirstChild() : list_of_parameters_AST;
					currentAST.advanceChildToEnd();
				}
				list_of_parameters_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==IDENT) && (LA(2)==COLON||LA(2)==CP)) {
				parameter();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					list_of_parameters_AST = (AST)currentAST.root;
					list_of_parameters_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(LIST_OF_PARAMETERS,"LIST_OF_PARAMETERS")).add(list_of_parameters_AST));
					currentAST.root = list_of_parameters_AST;
					currentAST.child = list_of_parameters_AST!=null &&list_of_parameters_AST.getFirstChild()!=null ?
						list_of_parameters_AST.getFirstChild() : list_of_parameters_AST;
					currentAST.advanceChildToEnd();
				}
				list_of_parameters_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==CP)) {
				list_of_parameters_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_11);
			} else {
			  throw ex;
			}
		}
		returnAST = list_of_parameters_AST;
	}
	
	public final void parameter() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST parameter_AST = null;
		
		try {      // for error handling
			AST tmp26_AST = null;
			tmp26_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp26_AST);
			match(IDENT);
			{
			switch ( LA(1)) {
			case COLON:
			{
				match(COLON);
				AST tmp28_AST = null;
				tmp28_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp28_AST);
				match(IDENT);
				break;
			}
			case COMA:
			case CP:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			parameter_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_12);
			} else {
			  throw ex;
			}
		}
		returnAST = parameter_AST;
	}
	
	public final void role() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST role_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case TEXT:
			{
				AST tmp29_AST = null;
				tmp29_AST = astFactory.create(LT(1));
				match(TEXT);
				break;
			}
			case OSB:
			case MINUS:
			case LESS:
			case CIRCUNFLEX:
			case DOTED_LINE:
			case COMPOSITION_SIMBOL:
			case AGREGATION_SIMBOL:
			case NUMBER:
			case ASTERISC:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_13);
			} else {
			  throw ex;
			}
		}
		returnAST = role_AST;
	}
	
	public final void relation() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST relation_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case COMPOSITION_SIMBOL:
			{
				composition();
				astFactory.addASTChild(currentAST, returnAST);
				relation_AST = (AST)currentAST.root;
				break;
			}
			case AGREGATION_SIMBOL:
			{
				agregation();
				astFactory.addASTChild(currentAST, returnAST);
				relation_AST = (AST)currentAST.root;
				break;
			}
			default:
				if ((_tokenSet_14.member(LA(1))) && (_tokenSet_15.member(LA(2)))) {
					association();
					astFactory.addASTChild(currentAST, returnAST);
					relation_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==MINUS||LA(1)==CIRCUNFLEX) && (LA(2)==MINUS||LA(2)==CIRCUNFLEX)) {
					generalization();
					astFactory.addASTChild(currentAST, returnAST);
					relation_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==CIRCUNFLEX||LA(1)==DOTED_LINE) && (LA(2)==CIRCUNFLEX||LA(2)==DOTED_LINE)) {
					implementation();
					astFactory.addASTChild(currentAST, returnAST);
					relation_AST = (AST)currentAST.root;
				}
				else if ((_tokenSet_16.member(LA(1))) && (_tokenSet_17.member(LA(2)))) {
					dependency();
					astFactory.addASTChild(currentAST, returnAST);
					if ( inputState.guessing==0 ) {
						relation_AST = (AST)currentAST.root;
						relation_AST=(AST)astFactory.make( (new ASTArray(1)).add(astFactory.create(DEPENDENCY,"DEPENDENCY")));
						currentAST.root = relation_AST;
						currentAST.child = relation_AST!=null &&relation_AST.getFirstChild()!=null ?
							relation_AST.getFirstChild() : relation_AST;
						currentAST.advanceChildToEnd();
					}
					relation_AST = (AST)currentAST.root;
				}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = relation_AST;
	}
	
	public final void association() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST association_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1359 = false;
			if (((LA(1)==LESS) && (LA(2)==MINUS||LA(2)==NUMBER||LA(2)==ASTERISC))) {
				int _m1359 = mark();
				synPredMatched1359 = true;
				inputState.guessing++;
				try {
					{
					bidirectional_ass();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1359 = false;
				}
				rewind(_m1359);
inputState.guessing--;
			}
			if ( synPredMatched1359 ) {
				bidirectional_ass();
				astFactory.addASTChild(currentAST, returnAST);
				association_AST = (AST)currentAST.root;
			}
			else {
				boolean synPredMatched1361 = false;
				if (((_tokenSet_14.member(LA(1))) && (_tokenSet_19.member(LA(2))))) {
					int _m1361 = mark();
					synPredMatched1361 = true;
					inputState.guessing++;
					try {
						{
						directional_ass();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched1361 = false;
					}
					rewind(_m1361);
inputState.guessing--;
				}
				if ( synPredMatched1361 ) {
					directional_ass();
					astFactory.addASTChild(currentAST, returnAST);
					association_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==MINUS||LA(1)==NUMBER||LA(1)==ASTERISC) && (_tokenSet_20.member(LA(2)))) {
					adirectional_ass();
					astFactory.addASTChild(currentAST, returnAST);
					association_AST = (AST)currentAST.root;
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
			}
			catch (RecognitionException ex) {
				if (inputState.guessing==0) {
					reportError(ex);
					recover(ex,_tokenSet_18);
				} else {
				  throw ex;
				}
			}
			returnAST = association_AST;
		}
		
	public final void generalization() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST generalization_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case CIRCUNFLEX:
			{
				AST tmp30_AST = null;
				tmp30_AST = astFactory.create(LT(1));
				match(CIRCUNFLEX);
				line();
				if ( inputState.guessing==0 ) {
					generalization_AST = (AST)currentAST.root;
					generalization_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(GENERALIZATION,"GENERALIZATION")).add(astFactory.create(RIGHT_TO_LEFT,"RIGHT_TO_LEFT")));
					currentAST.root = generalization_AST;
					currentAST.child = generalization_AST!=null &&generalization_AST.getFirstChild()!=null ?
						generalization_AST.getFirstChild() : generalization_AST;
					currentAST.advanceChildToEnd();
				}
				break;
			}
			case MINUS:
			{
				line();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp31_AST = null;
				tmp31_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp31_AST);
				match(CIRCUNFLEX);
				if ( inputState.guessing==0 ) {
					generalization_AST = (AST)currentAST.root;
					generalization_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(GENERALIZATION,"GENERALIZATION")).add(astFactory.create(LEFT_TO_RIGHT,"LEFT_TO_RIGHT")));
					currentAST.root = generalization_AST;
					currentAST.child = generalization_AST!=null &&generalization_AST.getFirstChild()!=null ?
						generalization_AST.getFirstChild() : generalization_AST;
					currentAST.advanceChildToEnd();
				}
				generalization_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = generalization_AST;
	}
	
	public final void implementation() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST implementation_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case CIRCUNFLEX:
			{
				AST tmp32_AST = null;
				tmp32_AST = astFactory.create(LT(1));
				match(CIRCUNFLEX);
				AST tmp33_AST = null;
				tmp33_AST = astFactory.create(LT(1));
				match(DOTED_LINE);
				if ( inputState.guessing==0 ) {
					implementation_AST = (AST)currentAST.root;
					implementation_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(IMPLEMENTATION,"IMPLEMENTATION")).add(astFactory.create(RIGHT_TO_LEFT,"RIGHT_TO_LEFT")));
					currentAST.root = implementation_AST;
					currentAST.child = implementation_AST!=null &&implementation_AST.getFirstChild()!=null ?
						implementation_AST.getFirstChild() : implementation_AST;
					currentAST.advanceChildToEnd();
				}
				break;
			}
			case DOTED_LINE:
			{
				AST tmp34_AST = null;
				tmp34_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp34_AST);
				match(DOTED_LINE);
				AST tmp35_AST = null;
				tmp35_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp35_AST);
				match(CIRCUNFLEX);
				if ( inputState.guessing==0 ) {
					implementation_AST = (AST)currentAST.root;
					implementation_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(IMPLEMENTATION,"IMPLEMENTATION")).add(astFactory.create(LEFT_TO_RIGHT,"LEFT_TO_RIGHT")));
					currentAST.root = implementation_AST;
					currentAST.child = implementation_AST!=null &&implementation_AST.getFirstChild()!=null ?
						implementation_AST.getFirstChild() : implementation_AST;
					currentAST.advanceChildToEnd();
				}
				implementation_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = implementation_AST;
	}
	
	public final void composition() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST composition_AST = null;
		
		try {      // for error handling
			AST tmp36_AST = null;
			tmp36_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp36_AST);
			match(COMPOSITION_SIMBOL);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			match(GREATER);
			composition_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = composition_AST;
	}
	
	public final void agregation() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST agregation_AST = null;
		
		try {      // for error handling
			AST tmp38_AST = null;
			tmp38_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp38_AST);
			match(AGREGATION_SIMBOL);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			match(GREATER);
			agregation_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = agregation_AST;
	}
	
	public final void dependency() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST dependency_AST = null;
		
		try {      // for error handling
			boolean synPredMatched1375 = false;
			if (((LA(1)==LESS) && (LA(2)==DOTED_LINE||LA(2)==NUMBER||LA(2)==ASTERISC))) {
				int _m1375 = mark();
				synPredMatched1375 = true;
				inputState.guessing++;
				try {
					{
					bidirectional_dep();
					}
				}
				catch (RecognitionException pe) {
					synPredMatched1375 = false;
				}
				rewind(_m1375);
inputState.guessing--;
			}
			if ( synPredMatched1375 ) {
				bidirectional_dep();
				astFactory.addASTChild(currentAST, returnAST);
				dependency_AST = (AST)currentAST.root;
			}
			else {
				boolean synPredMatched1377 = false;
				if (((_tokenSet_16.member(LA(1))) && (_tokenSet_21.member(LA(2))))) {
					int _m1377 = mark();
					synPredMatched1377 = true;
					inputState.guessing++;
					try {
						{
						directional_dep();
						}
					}
					catch (RecognitionException pe) {
						synPredMatched1377 = false;
					}
					rewind(_m1377);
inputState.guessing--;
				}
				if ( synPredMatched1377 ) {
					directional_dep();
					astFactory.addASTChild(currentAST, returnAST);
					dependency_AST = (AST)currentAST.root;
				}
				else if ((LA(1)==DOTED_LINE||LA(1)==NUMBER||LA(1)==ASTERISC) && (_tokenSet_22.member(LA(2)))) {
					adirectional_dep();
					astFactory.addASTChild(currentAST, returnAST);
					dependency_AST = (AST)currentAST.root;
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
			}
			catch (RecognitionException ex) {
				if (inputState.guessing==0) {
					reportError(ex);
					recover(ex,_tokenSet_18);
				} else {
				  throw ex;
				}
			}
			returnAST = dependency_AST;
		}
		
	public final void bidirectional_ass() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bidirectional_ass_AST = null;
		
		try {      // for error handling
			AST tmp40_AST = null;
			tmp40_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp40_AST);
			match(LESS);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			line();
			astFactory.addASTChild(currentAST, returnAST);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp41_AST = null;
			tmp41_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp41_AST);
			match(GREATER);
			if ( inputState.guessing==0 ) {
				bidirectional_ass_AST = (AST)currentAST.root;
				bidirectional_ass_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ASSOCIATION,"ASSOCIATION")).add(bidirectional_ass_AST));
				currentAST.root = bidirectional_ass_AST;
				currentAST.child = bidirectional_ass_AST!=null &&bidirectional_ass_AST.getFirstChild()!=null ?
					bidirectional_ass_AST.getFirstChild() : bidirectional_ass_AST;
				currentAST.advanceChildToEnd();
			}
			bidirectional_ass_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = bidirectional_ass_AST;
	}
	
	public final void directional_ass() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST directional_ass_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LESS:
			{
				AST tmp42_AST = null;
				tmp42_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp42_AST);
				match(LESS);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				line();
				astFactory.addASTChild(currentAST, returnAST);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				if ( inputState.guessing==0 ) {
					directional_ass_AST = (AST)currentAST.root;
					directional_ass_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ASSOCIATION,"ASSOCIATION")).add(directional_ass_AST));
					currentAST.root = directional_ass_AST;
					currentAST.child = directional_ass_AST!=null &&directional_ass_AST.getFirstChild()!=null ?
						directional_ass_AST.getFirstChild() : directional_ass_AST;
					currentAST.advanceChildToEnd();
				}
				directional_ass_AST = (AST)currentAST.root;
				break;
			}
			case MINUS:
			case NUMBER:
			case ASTERISC:
			{
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				line();
				astFactory.addASTChild(currentAST, returnAST);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp43_AST = null;
				tmp43_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp43_AST);
				match(GREATER);
				if ( inputState.guessing==0 ) {
					directional_ass_AST = (AST)currentAST.root;
					directional_ass_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ASSOCIATION,"ASSOCIATION")).add(directional_ass_AST));
					currentAST.root = directional_ass_AST;
					currentAST.child = directional_ass_AST!=null &&directional_ass_AST.getFirstChild()!=null ?
						directional_ass_AST.getFirstChild() : directional_ass_AST;
					currentAST.advanceChildToEnd();
				}
				directional_ass_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = directional_ass_AST;
	}
	
	public final void adirectional_ass() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST adirectional_ass_AST = null;
		
		try {      // for error handling
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			line();
			astFactory.addASTChild(currentAST, returnAST);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			if ( inputState.guessing==0 ) {
				adirectional_ass_AST = (AST)currentAST.root;
				adirectional_ass_AST=(AST)astFactory.make( (new ASTArray(2)).add(astFactory.create(ASSOCIATION,"ASSOCIATION")).add(adirectional_ass_AST));
				currentAST.root = adirectional_ass_AST;
				currentAST.child = adirectional_ass_AST!=null &&adirectional_ass_AST.getFirstChild()!=null ?
					adirectional_ass_AST.getFirstChild() : adirectional_ass_AST;
				currentAST.advanceChildToEnd();
			}
			adirectional_ass_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = adirectional_ass_AST;
	}
	
	public final void cardinality() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST cardinality_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case NUMBER:
			{
				AST tmp44_AST = null;
				tmp44_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp44_AST);
				match(NUMBER);
				cardinality_AST = (AST)currentAST.root;
				break;
			}
			case ASTERISC:
			{
				AST tmp45_AST = null;
				tmp45_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp45_AST);
				match(ASTERISC);
				cardinality_AST = (AST)currentAST.root;
				break;
			}
			case OSB:
			case MINUS:
			case TEXT:
			case GREATER:
			case DOTED_LINE:
			{
				cardinality_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_23);
			} else {
			  throw ex;
			}
		}
		returnAST = cardinality_AST;
	}
	
	public final void line() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST line_AST = null;
		
		try {      // for error handling
			AST tmp46_AST = null;
			tmp46_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp46_AST);
			match(MINUS);
			line_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_24);
			} else {
			  throw ex;
			}
		}
		returnAST = line_AST;
	}
	
	public final void bidirectional_dep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST bidirectional_dep_AST = null;
		
		try {      // for error handling
			AST tmp47_AST = null;
			tmp47_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp47_AST);
			match(LESS);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp48_AST = null;
			tmp48_AST = astFactory.create(LT(1));
			astFactory.makeASTRoot(currentAST, tmp48_AST);
			match(DOTED_LINE);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp49_AST = null;
			tmp49_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp49_AST);
			match(GREATER);
			bidirectional_dep_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = bidirectional_dep_AST;
	}
	
	public final void directional_dep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST directional_dep_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LESS:
			{
				AST tmp50_AST = null;
				tmp50_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp50_AST);
				match(LESS);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp51_AST = null;
				tmp51_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp51_AST);
				match(DOTED_LINE);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				directional_dep_AST = (AST)currentAST.root;
				break;
			}
			case DOTED_LINE:
			case NUMBER:
			case ASTERISC:
			{
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp52_AST = null;
				tmp52_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp52_AST);
				match(DOTED_LINE);
				cardinality();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp53_AST = null;
				tmp53_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp53_AST);
				match(GREATER);
				directional_dep_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = directional_dep_AST;
	}
	
	public final void adirectional_dep() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST adirectional_dep_AST = null;
		
		try {      // for error handling
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp54_AST = null;
			tmp54_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp54_AST);
			match(DOTED_LINE);
			cardinality();
			astFactory.addASTChild(currentAST, returnAST);
			adirectional_dep_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			if (inputState.guessing==0) {
				reportError(ex);
				recover(ex,_tokenSet_18);
			} else {
			  throw ex;
			}
		}
		returnAST = adirectional_dep_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"SPECIFICATION",
		"SENTENCE",
		"CLASS",
		"INTERFACE",
		"CLASS_RELATION_CLASS",
		"ASSOCIATION",
		"DEPENDENCY",
		"GENERALIZATION",
		"IMPLEMENTATION",
		"LIST_OF_ATRIBUTES",
		"LIST_OF_METHODS",
		"LIST_OF_PARAMETERS",
		"LEFT_TO_RIGHT",
		"RIGHT_TO_LEFT",
		"COMA",
		"OSB",
		"IDENT",
		"CSB",
		"PLUS",
		"MINUS",
		"HASH",
		"VB",
		"SC",
		"COLON",
		"OP",
		"CP",
		"TEXT",
		"LESS",
		"GREATER",
		"CIRCUNFLEX",
		"DOTED_LINE",
		"COMPOSITION_SIMBOL",
		"AGREGATION_SIMBOL",
		"NUMBER",
		"ASTERISC",
		"INTERFACE_TOKEN"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2177892352L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 262146L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 30408704L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 544395755522L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 524288L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 1048576L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 2097152L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 35651584L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 67108864L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 32505856L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 536870912L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 537133056L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 543322275840L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 414472732672L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 417694482432L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 431644213248L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 434865963008L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 1074266112L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 416620216320L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { 413399515136L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { 433791696896L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	private static final long[] mk_tokenSet_22() {
		long[] data = { 430570995712L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_22 = new BitSet(mk_tokenSet_22());
	private static final long[] mk_tokenSet_23() {
		long[] data = { 22557491200L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_23 = new BitSet(mk_tokenSet_23());
	private static final long[] mk_tokenSet_24() {
		long[] data = { 426276028416L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_24 = new BitSet(mk_tokenSet_24());
	
	}
