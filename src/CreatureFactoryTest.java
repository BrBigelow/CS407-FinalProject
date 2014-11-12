package edu.ccsu.cs407.finalproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreatureFactoryTest {

	@Test
	public void test() 
	{
		
		CreatureFactory cf = CreatureFactory.getInstance();
		CreatureFactory cf2 = CreatureFactory.getInstance();
		assertTrue(cf instanceof CreatureFactory);
		assertTrue(cf == cf2);
		
		assertTrue(cf.create("G", "R") instanceof Gargoyle);
		assertTrue(cf.create("B", "F") instanceof Banshee);
	}

}
