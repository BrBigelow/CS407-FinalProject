package edu.ccsu.cs407.finalproject;

public class PlantFactory implements PlantFactoryInterface 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public static PlantFactory instance;
	
	public static PlantFactory getInstance()
	{
		if (instance == null)
		{
			instance = new PlantFactory();

		}
		
		return instance;
	}
	
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
