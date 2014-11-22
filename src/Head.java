package finalProject;

public class Head extends BodyComposite 
{
	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */

	/**
	 * Head provides no protection
	 * @return No additional defense in final calculation
	 */
	protected int getBaseDefense() 
	{
		return 0;
	}

	/**
	 * Head provides minor offense boost for headbutts
	 * @return Additional offense in final calculation
	 */
	protected int getBaseOffense() 
	{
		return 5;
	}

	/**
	 * Head provides no speed boost
	 * @return No additional speed in final calculation
	 */
	protected int getBaseSpeed() 
	{
		return 0;
	}

}
