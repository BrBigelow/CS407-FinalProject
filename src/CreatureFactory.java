package edu.ccsu.cs407.finalproject;

public class CreatureFactory implements Factory 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	//Predefined
	public Organic create(String type)
	{
		Creature creature;
		MoveStrategy strat;
		
		if(type == "G")
		{
			strat = new Random();
			creature = new Gargoyle(strat);
		}
		else if(type == "B")
		{
			strat = new Fight();
			creature = new Banshee(strat);
		}
		else
		{
			//Default
			strat = new Random();
			creature = new Gargoyle(strat);
		}
		
		//Return the new creature
		return creature;
	}
	
	//User defined
	public Creature createCreature(String moveStrat, String creatureType)
	{
		Creature creature;
		MoveStrategy strat;
		
		//Set new move strategy
		if(moveStrat == "Random")
		{
			strat = new Random();
		}
		else if(moveStrat == "Fight")
		{
			strat = new Fight();
		}
		else if(moveStrat == "Flight")
		{
			strat = new Flight();
		}
		else
		{
			//Default
			strat = new Flight();
		}
		
		//Create Creature
		if(creatureType == "G")
		{
			creature = new Gargoyle(strat);
		}
		else if(creatureType == "B")
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
