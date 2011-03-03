package dataModel;

import java.util.Iterator;
import java.util.List;

import antlr.collections.AST;

public class Interface extends Entity
{

	
	public Interface (AST name, List listOfAtributes, List listOfMethods)
	{
		super(name, listOfAtributes, listOfMethods);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void merge(Interface i)
	{
		super.merge(i);
	}
	
	public String toString()
	{
		String returnString;
		returnString = "public interface " + name +"\n{\n";
		
		//Print atributes
		
		if (!listOfAtributes.isEmpty())
		{
			Iterator it = listOfAtributes.iterator();
			while (it.hasNext())
			{
				Atribute a = (Atribute) it.next();
				
				returnString= returnString +"\t" + a.toString(true) + ";\n";
			}
			
			returnString= returnString +"\n";
		}
		
		if (!listOfMethods.isEmpty())
		{
			
			Iterator it = listOfMethods.iterator();
			while (it.hasNext())
			{
				Method m = (Method) it.next();				
				returnString= returnString + "\t"+ m.toString(true) + ";\n";
			}
			
		}
		
		returnString = returnString + "\n}\n";
		
		return returnString;

	}	

	public boolean equals(Object o)
	{
		return ((o instanceof Interface) && super.equals(o) ); 
	}
}
