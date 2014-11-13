package edu.ccsu.cs407.finalproject;

public class CreatureFactory implements CreatureFactoryInterface
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * Static Singleton instance of a CreatureFactory
	 */
	public static CreatureFactory instance;
	
	/**
	 * Static method to return the instance of the CreatureFactory. If instance does not exist, creates it.
	 * @return instance of CreatureFactory
	 */
	public static CreatureFactory getInstance()
	{
		if (instance == null)
		{
			instance = new CreatureFactory();

		}
		
		return instance;
	}
	
	/**
	 * Create a creature based off string inputs
	 * @param type - The type of the Creature to create
	 * @param move - The MoveStrategy to attach to the Creature
	 * @return A new Creature
	 */
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
