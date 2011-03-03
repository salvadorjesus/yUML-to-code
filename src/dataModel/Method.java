package dataModel;

import java.util.Iterator;
import java.util.List;

import antlr.collections.AST;

public class Method
{
	String name = "";
	String visibility = "";
	String returnType = "";
	
	List listOfParameters;
	
	public Method(AST name, AST returnType, AST visibility, List listOfParameters)
	{
		this.name = name.getText();
		
		if (visibility != null)
			this.visibility = SFClass.translateVisibility(visibility);
		
		if (returnType != null)
			this.returnType = returnType.getText();
		
		this.listOfParameters = listOfParameters;
	}

	public String toString()
	{
		String returnString = "";
		
		if (!visibility.equals(""))
			returnString = visibility + " ";
		if (!returnType.equals(""))
			returnString = returnString + returnType + " ";
		else
			returnString = returnString + "Object" + " ";
		
		returnString = returnString + this.name + parametersToString();
		

		return returnString;
		
		
	}

	public String toString(boolean forInterface)
	{
		if(!forInterface)
			return this.toString();
		else
		{String returnString = "public ";
	
		if (returnType.equals(""))
			returnString = returnString + "Object ";
		else
			returnString = returnString + returnType + " ";
		
		return returnString + name + parametersToString();
		
		}	
	}
	
	private String parametersToString()
	{
		String pString="(";
		
		if(this.listOfParameters != null)
		{
			Iterator it = listOfParameters.iterator();
			
			if(it.hasNext())
			{
				Object p = it.next();
				pString = pString + p;
			}
			while (it.hasNext())
			{
				Object p = it.next();
				pString = pString +","+ p;
			}
		}
		
		return pString + ")";
	}
}
