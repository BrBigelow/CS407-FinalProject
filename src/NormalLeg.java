package edu.ccsu.cs407.finalproject;

public class NormalLeg implements BodyComponent 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	/**
	 * NormalLeg provides minor defense boost from dodging
	 * @return Additional defense in final calculation
	 */
	public int getTotalDefense() 
	{
		return 10;
	}

	/**
	 * NormalLeg provides offense boost from kicking
	 * @return Additional offense in final calculation
	 */
	public int getTotalOffense() 
	{
		return 20;
	}
	
	/**
	 * NormalLeg provides medium speed boost
	 * @return Additional speed in final calculation
	 */
	public int getTotalSpeed() 
	{
		return 30;
	}

}
