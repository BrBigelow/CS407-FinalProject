package edu.ccsu.cs407.finalproject;

public class CreatureFactory implements CreatureFactoryInterface
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	public static CreatureFactory instance;
	
	public static CreatureFactory getInstance()
	{
		if (instance == null)
		{
			instance = new CreatureFactory();

		}
		
		return instance;
	}
	
	//Predefined
	public Creature create(String type, String move)
	{
		Creature creature;
		MoveStrategy strat;
		
		//Set new move strategy
		if(move == "Random")
		{
			strat = new Random();
		}
		else if(move == "Fight")
		{
			strat = new Fight();
		}
		else if(move == "Flight")
		{
			strat = new Flight();
		}
		else
		{
			//Default
			strat = new Flight();
		}
		
		//Create Creature
		if(type == "G")
		{
			creature = new Gargoyle(strat);
		}
		else if(type == "B")
		{
			creature = new Banshee(strat);
		}
		else
		{
			//Default
			creature = new Gargoyle(strat);
		}
		
		//Return the new creature
		return creature;
	}
	
}
