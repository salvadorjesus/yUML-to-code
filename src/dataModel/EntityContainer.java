package dataModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EntityContainer
{
	private List <Class> classList = new ArrayList<Class>();
	private List <Interface>interfaceList = new ArrayList<Interface>();
	
	public void add (Entity e)
	{
		if (e instanceof dataModel.Class)
		{
			Class c = (Class)e;
			
			int index = classList.indexOf(c);
			if (index==-1)
				classList.add(c);
			else
				classList.get(index).merge(c);
		}
		else if (e instanceof dataModel.Interface)
		{
			Interface i = (Interface)e;
			
			int index = interfaceList.indexOf(i);
			if (index==-1)
				interfaceList.add(i);
			else
				interfaceList.get(index).merge(i);
		}
	}
	
	public void addAll(List l)
	{
		Iterator it = l.iterator();
		
		while(it.hasNext())
		{
			this.add((Entity)it.next());
		}
	}
	
	
	public List getEntityList()
	{
		List rl = new ArrayList();
		
		rl.addAll(classList);
		rl.addAll(interfaceList);
		
		return rl;
	}
}
