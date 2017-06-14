package br.com.seniorchallenge.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.seniorchallenge.model.Mars;

public class MarsTests {
	
	Mars mars;
	
	@Before
	public void setMars(){
		mars = new Mars();
	}

	@Test
	public void robotRotationRight() throws Exception{
		String outputposition = mars.parseCommand("MMRMMRMM");
		assertEquals(outputposition, "(2, 0, S)");
	}
	
	@Test
	public void robotRotationLeft() throws Exception{
		String outputposition = mars.parseCommand("MML");
		assertEquals(outputposition, "(0, 2, W)");
	}
	
	@Test
	public void robotInvalidCommand() throws Exception{	
		try {
			mars.parseCommand("AAA");
			assertFalse(true);							
		} catch (Exception e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void robotInvalidPosition() throws Exception{
		try {
			mars.parseCommand("MMMMMMMMMMMMMMMMMMMMMMMMM");
			assertFalse(true);							
		} catch (Exception e) {
			assertTrue(true);
		}		
	}
	
}
