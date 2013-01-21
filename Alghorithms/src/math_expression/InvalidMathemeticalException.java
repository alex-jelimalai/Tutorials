package math_expression;

public class InvalidMathemeticalException extends RuntimeException {

	public InvalidMathemeticalException() {
		super();
	}

	public InvalidMathemeticalException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidMathemeticalException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidMathemeticalException(String message) {
		super(message);
	}

	public InvalidMathemeticalException(Throwable cause) {
		super(cause);
	}
	
}
