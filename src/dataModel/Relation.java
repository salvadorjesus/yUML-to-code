package dataModel;

import java.util.ArrayList;
import java.util.List;

import antlr.collections.AST;

public class Relation
{
	public static final int DEPENDENCY = 0;
	public static final int ASSOCIATION = 1;
	public static final int COMPOSITION = 2;
	public static final int AGREGATION = 3;
	public static final int GENERALIZATION = 4;
	public static final int IMPLEMENTATION = 5;
	
	int type=-1;
	String leftCardinality="";
	String rightCardinality="";
	boolean rightToLeft = false;
	boolean leftToRight = false;
	
	/**Constructor for dependencies*/
	public Relation(int type)
	{
		this.type = type;
	}
	
	/**Constructor for generalization, implementation, Composition and Agregation*/
	public Relation (int type, AST parameter)
	{
		this(type);
		
		String parameterString = "";
		if(parameter != null)
			parameterString = parameter.getText();
		
		if(parameterString.equals("LEFT_TO_RIGHT"))
			leftToRight = true;
		else if (parameterString.equals("RIGHT_TO_LEFT"))
			rightToLeft = true;
		else
			rightCardinality =parameterString;
	}
	
	/**Constructor for associations*/
	public Relation (int type, AST less, AST leftCardinality, AST rightCardinality, AST greater)
	{
		this(type);
		
		if (less != null)
			this.rightToLeft = true;
		if (leftCardinality != null)
			this.leftCardinality = leftCardinality.getText();
		if (rightCardinality != null)
			this.rightCardinality = rightCardinality.getText();
		if (greater != null)
			this.leftToRight = true;
	}
	
	/**Change clases according to the relation*/
	public List joinClasses(Entity c1, Entity c2)
	{
		List l = new ArrayList();
		
		//Aggregations or compositions
		if((c1 instanceof Class) && (type == AGREGATION || type == COMPOSITION))
		{
			link(c1, c2, rightCardinality);	
		}
		
		//Associations
		else if(type == ASSOCIATION)
		{
			if (rightToLeft == leftToRight) //<-> OR -
			{
				if( c1 instanceof Class )
					link(c1,c2,rightCardinality);
				if(c2 instanceof Class)
					 link(c2,c1,leftCardinality);	
			}
			else if (leftToRight && (c1 instanceof Class))
				link(c1,c2,rightCardinality);
			else if (rightToLeft && (c2 instanceof Class))
				link(c2,c1,leftCardinality);
		}
		
		//Extensions and implementation
		else if (type == GENERALIZATION || type == IMPLEMENTATION)
		{
			if(rightToLeft && (c2 instanceof Class))
			{
				if(c1 instanceof Class)
					((Class)c2).implement((Class)c1);
				else if (c1 instanceof Interface)
					((Class)c2).extend((Interface)c1);
			}
			else if (leftToRight && (c1 instanceof Class))
			{
				if(c2 instanceof Class)
					((Class)c1).implement((Class)c2);
				else if (c2 instanceof Interface)
					((Class)c1).extend((Interface)c2);
			}
		}
		
		
		//Prepare the return list and return it.
		l.add(c1);
		l.add(c2);
		
		return l;
		
	}

	/**Create a type c2 atribute on c1.*/
	private void link(Entity c1, Entity c2, String car)
	{
		if (car.equals("*"))
			c1.addAtribute(new Atribute("listOf"+c2.name, "List", "private"));
		else
		{	
			int n;
			
			if(car.equals(""))
				n=1;
			else
				n = Integer.parseInt(car);
			
			if (n>1)
				c1.addAtribute(new Atribute("arrayOf"+c2.name, c2.name +"["+n+"]", "private"));
			else
				c1.addAtribute(new Atribute("object"+c2.name, c2.name, "private"));
		}
	}
	
}
