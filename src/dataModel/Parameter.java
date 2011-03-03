package dataModel;

import antlr.collections.AST;

public class Parameter 
{
	String name;
	String type;
//	
//	public Parameter(String name, String type)
//	{
//		this.name = name;
//		this.type = type;
//	}

	public Parameter(AST n, AST t)
	{
		this.name = n.getText();
		if (t==null)
			this.type = "";
		else
			this.type = t.getText();
	}

	public String toString()
	{
		if (type == "")
			return "Object "+name;
		else
			return type + " " + name;
	}
}
