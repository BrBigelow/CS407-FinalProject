package edu.ccsu.cs407.finalproject;

public abstract class CreatureTemplate implements Creature
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	private int movePoints;
	private int size;
	private int health;
	private int hunger;
	private int numberOfOffspring;
	
	public int determineNumberOfOffspring(){}
	
	public void reproduce(){
		numberOfOffspring = determineNumberOfOffspring();
	}
	
	public abstract void defend();
	
	public void eat(){}	
	
	public int getSize(){
		return size;
	}
	
	public int getHealth(){
		return health;
	}
}
