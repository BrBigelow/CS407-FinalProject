package finalProject;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantFactoryTest {

	/**
	 * @author	Bryan Bigelow, Aaron Zamojski, Nick Artymiak, Joseph Boling
	 */
	
	@Test
	public void test() 
	{
		PlantFactory pf = PlantFactory.getInstance();
		PlantFactory pf2 = PlantFactory.getInstance();
		assertTrue(pf instanceof PlantFactory);
		
		//Test not re-created
		assertTrue(pf == pf2);
		
		//Test correct types returned
		assertTrue(pf.create("R") instanceof RedPlant);
		assertTrue(pf.create("B") instanceof BluePlant);
	}

}
