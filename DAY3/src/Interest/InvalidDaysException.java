package Interest;

public class InvalidDaysException extends Exception{
    
	private String message;
    public InvalidDaysException(String message) {
    	super(message);
    }
}
