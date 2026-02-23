class GuessValidator{
	public static String validateGuess(int guess,int target){
		if(guess == target) return "Correct";
		if(guess<target) return "Low";
		return "High";
	}
}