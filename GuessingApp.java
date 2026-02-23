
/*
	Main file of guessing app
	@author Dilpreet
*/


import java.util.*;

public class GuessingApp{
	public static void main(String[] args) throws InvalidInputException{
		System.out.println("Welcome to the Guessing App.");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String player = sc.nextLine();
		
		int attempts = 0;
		int hintCount = 0;
		
		boolean win = false;
		
		try{
			while(attempts < gameConfig.getMaxAttempts()){
				System.out.print("Enter your guess: ");
				int guess = ValidationService.validInput(sc.nextLine());
				attempts++;
				
				String result = GuessValidator.validateGuess(guess,gameConfig.getTargetNumber());
				String hint  = HintService.generateHint(gameConfig.getTargetNumber(),++hintCount);
				
				System.out.println(result);
				if(hintCount<4)System.out.println(hint);
				
				if("Correct".equals(result)){
					win = true;
					break;
				}
			}
		}catch(InvalidInputException e){
			System.out.println(e.getMessage());
		}
		
		StorageService.saveResult(player,attempts,win);
	}
}