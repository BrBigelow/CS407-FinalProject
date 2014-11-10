package edu.ccsu.cs407.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorySingletonTest {

	@Test
	public void test() 
	{
		FactorySingleton fs = FactorySingleton.getInstance();
		FactorySingleton fs2 = FactorySingleton.getInstance();
		assertTrue(fs instanceof FactorySingleton);
		assertTrue(fs.getCreatureFactory() instanceof CreatureFactory);
		assertTrue(fs.getPlantFactory() instanceof PlantFactory);
		assertTrue(fs == fs2);
	}

}
