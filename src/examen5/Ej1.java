package examen5;


import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer la frase del teclado
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();

        // Separar las palabras de la frase
        String[] palabras = frase.trim().split("\\s+");

        // Variables para contar palabras y determinar las palabras de mayor y menor longitud
        int totalPalabras = palabras.length;
        String palabraMayor = "";
        String palabraMenor = palabras[0]; // Inicializar con la primera palabra

        for (String palabra : palabras) {
            if (palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
            if (palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
        }

        // Imprimir resultados
        System.out.println("Número total de palabras: " + totalPalabras);
        System.out.println("La palabra de mayor longitud es \"" + palabraMayor + "\" con " + palabraMayor.length() + " caracteres.");
        System.out.println("La palabra de menor longitud es \"" + palabraMenor + "\" con " + palabraMenor.length() + " caracteres.");
scanner.close();
}
}
