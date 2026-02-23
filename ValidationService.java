class InvalidInputException extends Exception{
	public InvalidInputException(String message){
		super(message);
	}
}

class ValidationService{
	public static int validInput(String input) throws InvalidInputException{
		try{
			int value = Integer.parseInt(input);
			if(value<1 || value > 100){
				throw new InvalidInputException("Number must be between 1 and 100");
			}
			
			return value;
		}
		catch(NumberFormatException e){
			throw new InvalidInputException("Invalid input, Please enter only numbers.");
		}
	}
}