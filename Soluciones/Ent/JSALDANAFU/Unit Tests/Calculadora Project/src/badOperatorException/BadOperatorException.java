package badOperatorException;

public class BadOperatorException extends Exception {
	public BadOperatorException (String msg) {
		super(msg);
	}
	
	public String getMessage() {
		return super.getMessage();
	}
}
