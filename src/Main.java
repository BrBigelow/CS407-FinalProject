package edu.ccsu.cs407.finalproject;

public class Main 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */

	CreatureFactoryInterface cFactory = CreatureFactory.getInstance();
	PlantFactoryInterface pFactory = PlantFactory.getInstance();
	
	
	public void main(String[] args) 
	{
		Creature c1 = cFactory.create("G", "R");
		Creature c2 = cFactory.create("B", "F");
		Plant p1 = pFactory.create("R");
		Plant p2 = pFactory.create("B");

	}

}
