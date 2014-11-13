package edu.ccsu.cs407.finalproject;

public class Gargoyle extends CreatureTemplate 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	MoveStrategy ms;
	
	Gargoyle(MoveStrategy strat)
	{
		this.ms = strat;
	}

	/**
	 * Evolves a creature by swapping components or by adding decorators
	 */
	public void evolve() 
	{
		
	}
	
	/**
	 * Moves according to its MoveStrategy and its movement points
	 * @see MoveStrategy
	 * @see CreatureTemplate
	 */
	public void move() 
	{
		
	}
	
	public int determineNumberOfOffspring(){}

	/**
	 * Defends against attack based off defensive ability from creature components
	 */
	public void defend()
	{
		
	}

	protected void copyCreature() 
	{
		
	}

	protected void placeCreature() 
	{
		
	}
}
