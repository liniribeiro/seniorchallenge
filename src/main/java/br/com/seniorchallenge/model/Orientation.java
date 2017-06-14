package br.com.seniorchallenge.model;

public enum Orientation {

	NORTH('N'), SOUTH('S'), EAST('E'), WEST('W');
	
	private char orientation;
	
	private Orientation(char orientation) {
		this.orientation = orientation;
	}
	
	public char getValue() {
		return orientation;
	}

}
