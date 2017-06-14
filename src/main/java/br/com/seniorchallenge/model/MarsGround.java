package br.com.seniorchallenge.model;

public class MarsGround {
	
	private final int MIN_GROUND_POSITION = 0;
	private final int MAX_GROUND_POSITION = 5;
	
	/**
	 * Foi desenvolvida esta classe para informar quando houve a colisão entre o Robo e o seu limite de exploração.
	 * Nela é verificado se a posição recebida é maior ou menor que a pozição máxima e mínima para a sua exploração.
	 * */

	public boolean hasCollided(Position position) throws Exception {

		if (position.getCoordinateX() > MAX_GROUND_POSITION || position.getCoordinateX() < MIN_GROUND_POSITION
				|| position.getCoordinateY() > MAX_GROUND_POSITION || position.getCoordinateY() < MIN_GROUND_POSITION) {
			throw new Exception("400 Bad Request");
		}
		return false;
	}

}
