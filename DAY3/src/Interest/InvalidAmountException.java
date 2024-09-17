package Interest;

public class InvalidAmountException extends Exception{

	private String message;
	public InvalidAmountException(String message) {
		super(message);
	}
}
