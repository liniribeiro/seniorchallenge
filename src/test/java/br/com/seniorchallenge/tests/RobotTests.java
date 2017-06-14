package br.com.seniorchallenge.tests;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.seniorchallenge.model.Orientation;
import br.com.seniorchallenge.model.Robot;

public class RobotTests {
	
	Robot robot;
	
	@Before
	public void setRobot() {
		robot = new Robot();
	}
	
	@Test
	public void testInitialState(){
		assertEquals(robot.getPosition().getCoordinateX(), 0);
		assertEquals(robot.getPosition().getCoordinateY(), 0);
		assertEquals(robot.getOrientation(), Orientation.NORTH);
	}
	
	@Test
	public void robotTurnRight(){
		robot.turnRight();
		assertEquals(robot.getOrientation(), Orientation.EAST);
	}
	
	@Test
	public void robotOrientationLeft(){
		robot.turnLeft();
		assertEquals(robot.getOrientation(), Orientation.WEST);
	}
	
	@Test
	public void robotOrientationLeftPersist(){
		robot.setOrientation(Orientation.SOUTH);
		for (int i = 0; i < 4; i++) {
			robot.turnLeft();
		}
		assertEquals(robot.getOrientation(), Orientation.SOUTH);
	}

	
	@Test
	public void robotOrientationRightPersist(){
		for (int i = 0; i < 4; i++) {
			robot.turnRight();
		}
		assertEquals(robot.getOrientation(), Orientation.NORTH);
	}
	
	@Test
	public void move(){
		final int previousY = robot.getPosition().getCoordinateY();
		final int previousX = robot.getPosition().getCoordinateX();
		
		robot.setOrientation(Orientation.EAST);
		robot.move();
		robot.move();
		robot.setOrientation(Orientation.NORTH);
		robot.move();
		assertEquals(previousX + 2, robot.getPosition().getCoordinateX());
		assertEquals(previousY + 1,  robot.getPosition().getCoordinateY());	
	}
	
	@Test
	public void moveY() {
		final int previousY = robot.getPosition().getCoordinateY();
		
		robot.setOrientation(Orientation.SOUTH);
		for (int i = 0; i < 5; i++) {
			robot.move();
		}
		
		assertEquals(previousY - 5, robot.getPosition().getCoordinateY());
	}
}
