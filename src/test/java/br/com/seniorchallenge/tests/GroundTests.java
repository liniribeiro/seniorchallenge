package br.com.seniorchallenge.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.seniorchallenge.model.MarsGround;
import br.com.seniorchallenge.model.Orientation;
import br.com.seniorchallenge.model.Robot;

public class GroundTests {
	
	@Test
	public void hasColidedTest() throws Exception{
		Robot robot = new Robot();
		MarsGround marsGround = new MarsGround();
		robot.setOrientation(Orientation.EAST);
		robot.move();
		assertFalse(marsGround.hasCollided(robot.getPosition()));
		robot.setOrientation(Orientation.SOUTH);
		robot.move();
		try {
			marsGround.hasCollided(robot.getPosition());			
			assertFalse(true);
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
