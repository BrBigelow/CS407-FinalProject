package edu.ccsu.cs407.finalproject;

public class StrongArm implements BodyComponent 
{

	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * StrongArm provides large additional blocking abilities
	 * @return Additional defense in final calculation
	 */
	public int getTotalDefense() 
	{
		return 40;
	}

	/**
	 * StrongArm provides large additional attacking abilities
	 * @return Additional offense in final calculation
	 */
	public int getTotalOffense() 
	{
		return 40;
	}

	/**
	 * StrongArm provides no speed boost
	 * @return No additional speed in final calculation
	 */
	public int getTotalSpeed() 
	{
		return 0;
	}

}
