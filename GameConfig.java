import java.util.*;
class GameConfig{
	private final int MAX = 100;
	private final int MIN = 1;
	private final int MAX_ATTEMPTS = 7;
	private final int MAX_HINTS = 3;
	
	int targetNumber;
	
	public GameConfig(){
		Random random = new Random();
		this.targetNumber = random.nextInt(MAX-MIN+1) + MIN;
	}
	
	public int getTargetNumber(){
		return targetNumber;
	}
	public int getMaxAttempts(){
		return MAX_ATTEMPTS;
	}
	public int getMaxHints(){
		return MAX_HINTS;
	}
	
	public void showRules(){
		System.out.println("Guess a number between " + MIN + " and " + MAX + ".");
		System.out.println("You have maximum " + MAX_ATTEMPTS + " attempts to guess the number.");
		System.out.println("You will get a hint after each wrong guess.");
		
	}
	
}