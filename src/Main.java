package edu.ccsu.cs407.finalproject;

public class Main 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */

	FactorySingleton factory = FactorySingleton.getInstance();
	Factory cFactory = factory.getCreatureFactory();
	Factory pFactory = factory.getPlantFactory();
	
	public static void main(String[] args) 
	{

	}

}
