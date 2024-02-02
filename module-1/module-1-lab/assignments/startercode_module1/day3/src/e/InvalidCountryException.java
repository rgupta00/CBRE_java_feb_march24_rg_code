package e;

public class InvalidCountryException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCountryException(String message) {
		super(message);
	}
}
