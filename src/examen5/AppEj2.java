package examen5;

import java.util.Scanner;

public class AppEj2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int aforo_principal = 1000;
    private static final int aforo_platea = 200;
    private static final int aforo_VIP = 25;

    private static int entradasPrincipal = aforo_principal;
    private static int entradasPlatea = aforo_platea;
    private static int entradasVip = aforo_VIP;

    public static void main(String[] args) {
        int eleccion = 0;
        do {
            mostrarMenu();
            eleccion = leerEntero();

            switch (eleccion) {
                case 1 -> mostrarEntradasDisponibles();
                case 2 -> venderEntradas();
                case 3 -> System.out.println("Ha elegido salir del programa. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (eleccion != 3);
    }

    private static void mostrarMenu() {
        // Imprime el menú de opciones para el usuario
        System.out.println("\n--- Menú Principal ---");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void mostrarEntradasDisponibles() {
        System.out.println("\n--- Entradas Disponibles ---");
        System.out.println("Zona Principal: " + entradasPrincipal);
        System.out.println("Zona Platea: " + entradasPlatea);
        System.out.println("Zona VIP: " + entradasVip);
    }

    private static void venderEntradas() {
        mostrarMenuzonas();
        int zona = leerEntero();
        System.out.print("¿Cuántas entradas desea comprar? ");
        int cantidad = leerEntero();

        switch (zona) {
            case 1 -> procesarVenta("Zona Principal", cantidad, aforo_principal, entradasPrincipal, value -> entradasPrincipal = value);
            case 2 -> procesarVenta("Zona Platea", cantidad, aforo_platea, entradasPlatea, value -> entradasPlatea = value);
            case 3 -> procesarVenta("Zona VIP", cantidad, aforo_VIP, entradasVip, value -> entradasVip = value);
            default -> System.out.println("Zona no válida. Intente de nuevo.");
        }
    }

    private static void mostrarMenuzonas() {
        System.out.println("\n--- Selección de Zona ---");
        System.out.println("1. Zona Principal");
        System.out.println("2. Zona Platea");
        System.out.println("3. Zona VIP");
        System.out.print("Seleccione una zona: ");
    }

    private static void procesarVenta(String zona, int cantidad, int aforo, int disponibles, java.util.function.IntConsumer actualizarDisponibles) {
        if (cantidad <= 0) {
            System.out.println("Debe ingresar una cantidad válida.");
            return;
        }

        if (cantidad > disponibles) {
            System.out.println("No hay suficientes entradas disponibles en " + zona + ". Quedan " + disponibles + " entradas.");
            return;
        }

        actualizarDisponibles.accept(disponibles - cantidad);
        System.out.println("Venta realizada con éxito. Ha comprado " + cantidad + " entradas en " + zona + ".");
    }

    private static int leerEntero() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Intente de nuevo.");
            return -1;
        }
    }
}
