package edu.ccsu.cs407.finalproject;

public class NormalArm extends BodyComponent 
{

	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * NormalArm provides additional blocking abilities
	 * @return Additional defense in final calculation
	 */
	public int getTotalDefense() 
	{
		return 20;
	}

	/**
	 * NormalArm provides additional attacking abilities
	 * @return Additional offense in final calculation
	 */
	public int getTotalOffense() 
	{
		return 25;
	}

	/**
	 * NormalArm provides minor speed boost
	 * @return Additional speed in final calculation
	 */
	public int getTotalSpeed() 
	{
		return 10;
	}

}
