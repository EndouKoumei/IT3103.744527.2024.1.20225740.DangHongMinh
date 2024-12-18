//Dang Hong Minh - 20225740 
package AimsProject.hust.soict.hedspi.aims.exception;
public class NonExistingItemException extends Exception {
	public NonExistingItemException() {
	}
	public NonExistingItemException(String message) {
		super(message);
	}
	public NonExistingItemException(Throwable cause) {
		super(cause);
	}
	public NonExistingItemException(String message, Throwable cause) {
		super(message, cause);
	}
	public NonExistingItemException(String message, Throwable cause,
    boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}