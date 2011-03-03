package dataModel;

import java.util.ArrayList;
import java.util.List;

import antlr.collections.AST;

public abstract class Entity
{

	protected String name;
	
	protected List listOfAtributes = new ArrayList();
	protected List listOfMethods = new ArrayList();

	
	protected Entity  (AST name, List listOfAtributes, List listOfMethods)
	{
		this.name = name.getText();
		
		if(! (listOfAtributes == null))
			this.listOfAtributes.addAll(listOfAtributes);
		
		if(! (listOfMethods == null))
			this.listOfMethods.addAll(listOfMethods);
	}
	
	public String getName()
	{
		return name;
	}
	
	void addAtribute(Atribute a)
	{
		this.listOfAtributes.add(a);
	}
	
	protected void merge(Entity e)
	{
	 this.listOfAtributes.addAll(e.listOfAtributes);
	 this.listOfMethods.addAll(e.listOfMethods);
	}
	
	public boolean equals(Object o)
	{
		return ((o instanceof Entity) && ((Entity)o).getName().equals(name) ); 
	}
}
