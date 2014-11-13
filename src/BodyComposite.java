package edu.ccsu.cs407.finalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class BodyComposite implements BodyComponent 
{

	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * Components on top of the composite piece
	 */
	protected List<BodyComponent> components = new ArrayList<BodyComponent>();
	
	/**
	 * Add new component to the composite
	 * @param b - The component to add to the current composite piece
	 */
	public void add(BodyComponent b)
	{
		components.add(b);
	}
	
	/**
	 * Remove component to the composite
	 * @param b - The component to remove from the current composite piece
	 */
	public void remove(BodyComponent b)
	{
		components.remove(b);
	}
	
	/**
	 * Iterator for moving through an array list of body components
	 * @return Iterator for an array list of type BodyComponent
	 */
	public Iterator<BodyComponent> iterator()
	{
		//Custom iterator
	}
	
	/**
	 * Loops through composite components and sums the defensive strength
	 * @return Integer representing the defensive value of the composite
	 */
	public int getTotalDefense()
	{
		int def = getBaseDefense();
		 
		Iterator<BodyComponent> componentIterate = components.iterator();
		 
		while (componentIterate.hasNext())
		{
			BodyComponent bodyItem = componentIterate.next();
			def += bodyItem.getTotalDefense();
		}
		
		return def;
	}
	
	/**
	 * Loops through composite components and sums the offensive strength
	 * @return Integer representing the offensive value of the composite
	 */
	public int getTotalOffense()
	{
		int off = getBaseOffense();
		 
		Iterator<BodyComponent> componentIterate = components.iterator();
		 
		while (componentIterate.hasNext())
		{
			BodyComponent bodyItem = componentIterate.next();
			off += bodyItem.getTotalOffense();
		}
		    
		return off;
	}
	
	/**
	 * Loops through composite components and sums the speed the composite can move at
	 * @return Integer representing the speed value of the composite
	 */
	public int getTotalSpeed()
	{
		int spd = getBaseSpeed();
		 
		Iterator<BodyComponent> componentIterate = components.iterator();
		 
		while (componentIterate.hasNext())
		{
			BodyComponent bodyItem = componentIterate.next();
			spd += bodyItem.getTotalSpeed();	 
		}
		    
		return spd;
	}
	
	protected abstract int getBaseDefense();
	protected abstract int getBaseOffense();
	protected abstract int getBaseSpeed();
}
