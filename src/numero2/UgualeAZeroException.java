package numero2;

public class UgualeAZeroException extends Exception {

	private int number;

	public UgualeAZeroException(int number) {
		System.out.println("Il numero di litri " + number + " non è consentito");
	}
	
}
