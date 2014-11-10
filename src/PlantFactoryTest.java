package edu.ccsu.cs407.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantFactoryTest {

	@Test
	public void test() 
	{
		FactorySingleton fs = FactorySingleton.getInstance();
		
		assertTrue(fs.getPlantFactory().create("R") instanceof RedPlant);
		assertTrue(fs.getPlantFactory().create("B") instanceof BluePlant);
	}

}
