package dataModel;

import java.util.Iterator;
import java.util.List;

import antlr.collections.AST;

public class Class extends Entity
{
	String visibility = "";
	
	String extensions = "";
	String implementations = "";

	public Class (AST name, AST visibility, List listOfAtributes, List listOfMethods)
	{
		super(name, listOfAtributes, listOfMethods);
		
		if (visibility != null)
		{
			this.visibility = SFClass.translateVisibility(visibility);
		}

	}
	
	
	public void merge(Class c)
	{		
		super.merge(c);
		
		//Take the less restictive visibility.
		if (visibility.equals("private") && !c.visibility.equals("private"))
			this.visibility = c.visibility;
		else if (visibility.equals("protected") && (c.visibility.equals("") || c.visibility.equals("public")))
			this.visibility = c.visibility;
		else if (visibility.equals("") && c.visibility.equals("public"))
			this.visibility = c.visibility;
		
		if(this.extensions.equals(""))
			this.extensions = c.extensions;
		else if(!c.extensions.equals(""))
			this.extensions = this.extensions +", " + c.extensions;
		
		if(this.implementations.equals(""))
			this.implementations = c.implementations;
		else  if(!c.implementations.equals(""))
			this.implementations = this.implementations +", " + c.implementations;		
	}
	
	public String toString()
	{
		String returnString;
		returnString = visibility +" class " + name;
		
		//Print extensions or implementations, if any
		if(!implementations.equals(""))
			returnString = returnString + " implements "+implementations;
		
		if(!extensions.equals(""))
			returnString = returnString + " extends "+extensions;
		
		returnString = returnString +"\n{\n";
		
		//Print atributes
		if (!listOfAtributes.isEmpty())
		{
			Iterator it = listOfAtributes.iterator();
			while (it.hasNext())
			{
				Atribute a = (Atribute) it.next();
				returnString= returnString +"\t" + a + ";\n";
			}
			
			returnString= returnString +"\n";
		}
		
		//Print Methods
		if (!listOfMethods.isEmpty())
		{			
			Iterator it = listOfMethods.iterator();
			while (it.hasNext())
			{
				Method a = (Method) it.next();				
				returnString= returnString + "\t"+ a + "\n\t{\n\t}\n";
			}
			
		}
		
		returnString = returnString + "\n}\n";
		
		return returnString;
	}
	
	public boolean equals(Object o)
	{
		return ((o instanceof dataModel.Class) && super.equals(o) ); 
	}


	void implement(Class c1)
	{
		if(implementations.equals(""))
			implementations = implementations + c1.name;
		else
			implementations = implementations +", "+ c1.name;
	}


	void extend(Interface i1)
	{
		if(extensions.equals(""))
			extensions = extensions + i1.name;
		else
			extensions = extensions +", "+ i1.name;
	}
}
