package br.com.seniorchallenge.model;

public class Mars {

	public Robot robot;
	public MarsGround marsGround;

	public Mars() {
		this.robot = new Robot();
		this.marsGround = new MarsGround();
	}

	public String parseCommand(String command) throws Exception{
		for (int i = 0; i < command.length(); i++) {
			char action = command.toUpperCase().charAt(i);
			switch (action) {
			case 'R':
				robot.turnRight();
				break;
			case 'L':
				robot.turnLeft();
				break;
			case 'M':
				robot.move();
				marsGround.hasCollided(robot.getPosition());
				break;
			default:
				throw new Exception("400 Bad Request");
			}
		}
		return String.format("(%d, %d, %s)", robot.getPosition().getCoordinateX(), robot.getPosition().getCoordinateY(),
				robot.getOrientation().getValue());
	}
}
