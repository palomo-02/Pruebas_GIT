package examen5;

import java.util.Scanner;

public class AppEj2 {
	private static Scanner scanner = new Scanner(System.in);

	private static final int aforo_principal = 1000;
	private static final int aforo_platea = 200;
	private static final int aforo_VIP = 25;

	private static MetodosEj2[] zonaPrincipal = new MetodosEj2[aforo_principal];
	private static MetodosEj2[] zonaPlatea = new MetodosEj2[aforo_platea];
	private static MetodosEj2[] zonaVip = new MetodosEj2[aforo_VIP];
	private static int contadorEntradas = 0;

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int eleccion = 0;
		do {
			mostrarMenu();
			eleccion = scanner.nextInt();
			scanner.nextLine();

			switch (eleccion) {
			case 1 -> System.out.println("el numero de entradas disponibles es ");
			case 2 -> mostrarMenuzonas();
			case 3 -> System.out.println("ha elegido salir del programa");

			}
		} while (eleccion != 3);
		sc.close();
	}

	private static void mostrarMenu() {
		// Imprime el menú de opciones para el usuario
		System.out.println("1. Mostrar numero de entradas libres");
		System.out.println("2. vender entradas");
		System.out.println("3.salir");

	}

	private static void mostrarMenuzonas() {
		System.out.println("elija la zona donde quiere el espectaculo");
		System.out.println("1.Zona principal ");
		System.out.println("2.Zona Platea");
		System.out.println("3.Zona VIP");

	}

}
