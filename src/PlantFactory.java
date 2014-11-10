package edu.ccsu.cs407.finalproject;

public class PlantFactory implements Factory 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public Organic create(String type)
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
	
	//User defined
	public Plant createPlant()
	{
		Plant plant = new BluePlant();
		
		return plant;
	}

}
