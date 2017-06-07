package edu.coding.samples.game;


public class GameModel {
	Board map;
	Game m_game;
	Joueur j1;

	GameModel(Game game) {
		m_game = game;
		map = new Board((int) 20);
		j1 = new Joueur(1,1);

	}
	
	/**
	 * Simulation step.
	 * 
	 * @param now
	 *            is the current time in milliseconds.
	 */

}
