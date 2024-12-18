package examen5;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int cont = 0;
		System.out.println("inserte una frase: ");

		String frase = sc.nextLine();

		frase.trim();

		for (int i = 0; i <= frase.length(); i++) {
			cont++;

		}
		System.out.println("la palabra tiene " + cont + " letras");
		sc.close();

	}

}
