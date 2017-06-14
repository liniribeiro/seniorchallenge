package br.com.seniorchallenge.model;

public class Robot {

	private Position position = new Position();
	private Orientation orientation = Orientation.NORTH;
	
	public Orientation getOrientation() {
		return orientation;
	}
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public void turnRight() {
		switch (orientation) {
		case SOUTH:
			orientation = Orientation.WEST;
			break;
		case NORTH:
			orientation = Orientation.EAST;
			break;
		case EAST:
			orientation = Orientation.SOUTH;
			break;
		case WEST:
			orientation = Orientation.NORTH;
		default:
			break;
		}
	}
	
	public void turnLeft() {
		switch (orientation) {
		case SOUTH:
			orientation = Orientation.EAST;
			break;
		case NORTH:
			orientation = Orientation.WEST;
			break;
		case EAST:
			orientation = Orientation.NORTH;
			break;
		case WEST:
			orientation = Orientation.SOUTH;
		default:
			break;
		}
	}
	
	public void move(){
		switch (orientation) {
		case SOUTH:
			position.setCoordinateY(position.getCoordinateY() - 1);
			break;
		case NORTH:
			position.setCoordinateY(position.getCoordinateY() + 1);
			break;
		case EAST:
			position.setCoordinateX(position.getCoordinateX() + 1);
			break;
		case WEST:
			position.setCoordinateX(position.getCoordinateX() - 1);
		default:
			break;
		}
	}
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

}
