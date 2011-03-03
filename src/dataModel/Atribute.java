package dataModel;

import java.util.List;

import antlr.collections.AST;

public class Atribute
{
	String name;
	String visibility = "";
	String type = "";
	
	public Atribute(AST name, AST type, AST visibility)
	{
		this.name = name.getText();
		
		
		
		if (visibility != null)
			this.visibility = SFClass.translateVisibility(visibility);
			
		
		if (type != null)
			this.type = type.getText();
	}
	
	Atribute(String name, String type, String visibility)
	{
		this.name = name;
		this.visibility = visibility;
		this.type = type;
	}
	
	public String toString()
	{
		String returnString = "";
		
		if (!visibility.equals(""))
			returnString = visibility + " ";
		if (!type.equals(""))
			returnString = returnString + type + " ";
		else
			returnString = returnString + "Object" + " ";
		
		return returnString + name;
	}

	public String toString(boolean forInterface)
	{
		if(!forInterface)
			return this.toString();
		else
		{String returnString = "public static final ";
	
		if (type.equals(""))
			returnString = returnString + "Object ";
		else
			returnString = returnString + type + " ";
		
		return returnString + name;
		
		}		
	}
}
