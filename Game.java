package game;

import java.util.Random;

/**
 * <h1>Guess The Number</h1>
 * @author  Shreya Pagui <br/>
 * roll no. : 44 <br/>
 * title : Guess the number game <br/>
 * Description : This is number guessing game where user have to guess the number between 1 and 50, which computer has selected. <br/> 
 */

public class Game {
	/**
	 * class name : Game <br/>
	 * class description : This is the main class. It has 2 methods Game() and play(). 
	 */
	private Gameplay gameplay;

	private int numberToGuess;
	private int numberOfAttempts;
	private boolean hasGuessedCorrect;
	private int playerGuess;
	
	
	public Game(int maxNumber) {
		/**
		 * method name : maxNumber <br/>
		 * method description : This method uses Random() function to select any random number between 1 and maxNumber. <br/>
		 * @param  maxNumber, the maximum range between which a random number can be selected <br/>
		 */
		Random random = new Random();
		numberToGuess = random.nextInt(maxNumber) + 1;
		numberOfAttempts = 0;
		hasGuessedCorrect = false;
		
		gameplay = new Gameplay(numberToGuess);
	}
	
	
	public void start() {
        gameplay.play();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int maxNumber = 50;
        Game game = new Game(maxNumber);
        game.start();
	}

}
