package lab5;

import java.util.*;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Model 
{
	
	private ArrayList<String> stringList;
	public ArrayList<ChangeListener> listeners;
	

	public Model(ArrayList<String> list) 
	{
		stringList = list;
		listeners = new ArrayList<ChangeListener>();
	}
	

	public void add(String str) 
	{
		stringList.add(str);
		for (ChangeListener l : listeners) 
		{
			l.stateChanged(new ChangeEvent(this));
		}
	}
	

	public ArrayList<String> getList()
	{
		return stringList;
	}
	

	public void addChangeListner(ChangeListener l) 
	{
		listeners.add(l);
	}
	
}
