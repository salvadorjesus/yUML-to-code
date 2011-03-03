package dataModel;

import antlr.collections.AST;

public class SFClass
{
	public static String translateVisibility (AST visibility)
	{
		String vi = "";		
		if (visibility.getText().equals("+"))
			vi = "public";
		else if (visibility.getText().equals("-"))
			vi = "private";
		else if (visibility.getText().equals("#"))
			vi = "protected";
		
		return vi;
	}
	
}
