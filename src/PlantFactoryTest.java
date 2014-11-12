package edu.ccsu.cs407.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantFactoryTest {

	@Test
	public void test() 
	{
		PlantFactory pf = PlantFactory.getInstance();
		PlantFactory pf2 = PlantFactory.getInstance();
		assertTrue(pf instanceof PlantFactory);
		assertTrue(pf == pf2);
		
		assertTrue(pf.create("R") instanceof RedPlant);
		assertTrue(pf.create("B") instanceof BluePlant);
	}

}
