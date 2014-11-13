package edu.ccsu.cs407.finalproject;

public abstract class CreatureTemplate implements Creature
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	protected int movePoints;
	protected int size;
	protected int health;
	protected int hunger;
	protected int numberOfOffspring;
	
	public int determineNumberOfOffspring(){}
	
	/**
	 * Create and place a duplicate of the current Creature based on its individual reproduction method
	 */
	public void reproduce()
	{
		numberOfOffspring = determineNumberOfOffspring();
		copyCreature();
		placeCreature();
	}
	
	protected abstract void copyCreature();
	protected abstract void placeCreature();
	
	public abstract void defend();
	
	public void eat(){}	
	
	public int getSize(){
		return size;
	}
	
	public int getHealth(){
		return health;
	}
}
