package edu.ccsu.cs407.finalproject;

public class Body extends BodyComposite 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */

	/**
	 * Body provides minor protection against death
	 * @return Additional defense in final calculation
	 */
	protected int getBaseDefense() 
	{
		return 10;
	}

	/**
	 * Body provides minor offense with tackles and body slams
	 * @return Additional offense in final calculation
	 */
	protected int getBaseOffense() 
	{
		return 5;
	}

	/**
	 * Body does not add speed
	 * @return No additional speed
	 */
	protected int getBaseSpeed() 
	{
		return 0;
	}

}
