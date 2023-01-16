package numero2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Inserisci i chilometri percorsi");
			int km = scan.nextInt();
			
			System.out.println("Inserisci litri consumati");
			int litri = scan.nextInt();
			
			System.out.println("Totale: " + (km / litri));
		} catch(ArithmeticException e) {
			System.out.println("Errore: i litri non possono essere pari a 0");
		} catch(Exception e) {
			System.out.println("Errore: formato non valido");
		} finally {
			scan.close();
		}
	}

}
