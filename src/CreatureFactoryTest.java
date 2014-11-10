package edu.ccsu.cs407.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreatureFactoryTest {

	@Test
	public void test() 
	{
		FactorySingleton fs = FactorySingleton.getInstance();
		
		assertTrue(fs.getCreatureFactory().create("G") instanceof Gargoyle);
		assertTrue(fs.getCreatureFactory().create("B") instanceof Banshee);
	}

}
