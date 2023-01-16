package numero1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static Scanner scan = new Scanner(System.in);
	public static int[] valori = new int[5];
	public static Random numeroRandom = new Random();

	public static void main(String[] args) {
		
		generaArray();
		sostituisciValori();
		
	}
	
	public static void generaArray() {
		for(int i = 0; i < valori.length; i++) {
			valori[i] = numeroRandom.nextInt(1, 11);
		}
		
		System.out.println("Array iniziale");
		System.out.println(Arrays.toString(valori));
	}
	
	public static void sostituisciValori() {
		int nuovoValore = 0;

		do {
			try {
				System.out.println("Inserisci il numero da aggiungere");
				nuovoValore = scan.nextInt();
			}  catch(InputMismatchException e) {
				System.out.println("Il formato del numero non è valido.");
				System.exit(0);
			}
				
			try {
				System.out.println("In che posizione?");
				int index = scan.nextInt();
				
				valori[index] = nuovoValore;
				
				System.out.println("Nuovo array");
				System.out.println(Arrays.toString(valori));
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("L'indice inserito supera il numero massimo di valori dell'array.");
			}
		} while(nuovoValore != 0);

	}

}
