package edu.ccsu.cs407.finalproject;

public class Banshee extends CreatureTemplate implements Creature
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
MoveStrategy ms;
	
	Banshee(MoveStrategy strat)
	{
		this.ms = strat;
	}

	@Override
	public void evolve() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public int determineNumberOfOffspring(){}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}
}
