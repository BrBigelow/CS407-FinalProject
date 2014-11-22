package finalProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreatureFactoryTest 
{

	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	@Test
	public void test() 
	{
		
		CreatureFactory cf = CreatureFactory.getInstance();
		CreatureFactory cf2 = CreatureFactory.getInstance();
		assertTrue(cf instanceof CreatureFactory);
		
		//Test not re-created
		assertTrue(cf == cf2);
		
		//Test correct types returned
		assertTrue(cf.create("G", "R") instanceof Gargoyle);
		assertTrue(cf.create("B", "F") instanceof Banshee);
	}

}
