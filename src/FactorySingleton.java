package edu.ccsu.cs407.finalproject;

public class FactorySingleton 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public static FactorySingleton instance;
	private Factory[] factories = new Factory[2];
	
	public static FactorySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new FactorySingleton();
			instance.factories[0] = new CreatureFactory();
			instance.factories[1] = new PlantFactory();
		}
		
		return instance;
	}
	
	public Factory getCreatureFactory()
	{
		return this.factories[0];
	}
	
	public Factory getPlantFactory()
	{
		return this.factories[1];
	}

}
