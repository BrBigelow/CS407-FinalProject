package edu.ccsu.cs407.finalproject;

public class PlantFactory implements PlantFactoryInterface 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * Static Singleton instance of a PlantFactory
	 */
	public static PlantFactory instance;
	
	/**
	 * Static method to return the instance of the PlantFactory. If instance does not exist, creates it.
	 * @return instance of PlantFactory
	 */
	public static PlantFactory getInstance()
	{
		if (instance == null)
		{
			instance = new PlantFactory();

		}
		
		return instance;
	}
	
	/**
	 * Create a plant based off string input
	 * @param type - The type of the Plant to create
	 * @return A new Plant
	 */
	public Plant create(String type)
	{
		Plant plant;
		
		if(type == "R")
		{
			plant = new RedPlant();
		}
		else if(type == "B")
		{
			plant = new BluePlant();
		}
		else
		{
			plant = new BluePlant();
		}
		
		return plant;
	}
	
}
