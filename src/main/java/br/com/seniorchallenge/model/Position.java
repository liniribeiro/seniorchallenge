package br.com.seniorchallenge.model;

public class Position {

	private int coordinateX;
	private int coordinateY;
	
	public Position() {
		this(0, 0);
	}
	
	public Position(int x, int y) {
		coordinateX = x;
		coordinateY = y;
	}
	
	public int getCoordinateX() {
		return coordinateX;
	}
	
	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}
	
	public int getCoordinateY() {
		return coordinateY;
	}
	
	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}
	
	@Override
	public String toString() {
		return "" + coordinateX + ", " + coordinateY;
	}
}
