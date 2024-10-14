package game;

import java.util.Scanner;

public class Gameplay {
	private int numberToGuess;
    private int numberOfAttempts;
    private boolean hasGuessedCorrect;
    private int playerGuess;
	
	public Gameplay(int numberToGuess) {
		// TODO Auto-generated constructor stub
		this.numberToGuess = numberToGuess;
        this.numberOfAttempts = 0;
        this.hasGuessedCorrect = false;
	}

	public void play() {
		/**
		 * method name : play <br/>
		 * method description : takes user input and specifies if its too high or too low from the actual value.
		 *                      the user gets better idea to guess the number correctly.<br/> 
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to guess the number game!");
		System.out.println("I have selected a number between 1 and 50");
		System.out.println("Try to guess it");
		System.out.println("You will have 5 attemts to correctly guess the number");
		
		while(numberOfAttempts != 5 ) {
			System.out.print("Enter your guess : ");
			playerGuess = scanner.nextInt();

			numberOfAttempts++;
			
			
			if(playerGuess < numberToGuess) {
				System.out.println("Too low try again");
			}
			else if(playerGuess > numberToGuess) {
				System.out.println("Too high try again");
			}
			else {
				System.out.println("Congratulations! you have guessed the number right");
				hasGuessedCorrect = true;
				System.out.println("It took you " + numberOfAttempts + " attempts to guess the number right");
				break;
			}
			
			
			System.out.println("You have " + (5 - numberOfAttempts) + " attempts remaining!\n");
			
			
		}
		scanner.close();
		
		if (!hasGuessedCorrect && numberOfAttempts >= 5) {
			System.out.println("You have already used 5 attempts...... Better luck next time.");
		}
		
	}

}
