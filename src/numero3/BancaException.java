package numero3;

public class BancaException extends Exception {

	private String message;

	public BancaException(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
