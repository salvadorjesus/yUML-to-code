package gui;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

import antlr.RecognitionException;
import antlr.TokenStreamException;
import antlr.collections.AST;
import antlr.debug.misc.ASTFrame;
import antlrGeneratedEngine.*;


public class GuiController
{
	static String generateCode(String input)
	{
		String ret = "";
		
		StringReader in = new StringReader (input);
		Analex analex = new Analex(in);
		
		Anasint anasint = new Anasint(analex);
		
		try
		{
			anasint.uml_specification();
		
			AST arbol = anasint.getAST();
			
			arbol = anasint.getAST();
		
//			ASTFrame frame= new ASTFrame(nombreEntrada,arbol); 
//			frame.setVisible(true);
		
			SpecificationTreeParser treeParser = new SpecificationTreeParser();
			List listOfClases = treeParser.uml_specification(arbol);
		
			
			Iterator it = listOfClases.iterator();
			
			while(it.hasNext())
			{
				Object clase = it.next();
				ret = ret + clase.toString();
			}
		
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TokenStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		return ret;
	}
	

}
