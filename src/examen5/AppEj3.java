package examen5;

import java.util.Scanner;

public class AppEj3 {

	private static final int MAX_STOCK = 100; // declarar tamaño maximo del array
	private static MetodosEj3[] Productos = new MetodosEj3[MAX_STOCK]; // crear array
	private static int contadorProducto = 0; // crear un contador para posterirmente recorrer el array

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion; // Variable para almacenar la opción seleccionada por el usuario
		do {
			mostrarMenu(); // Muestra el menú de opciones
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			// llamadas a metodos
			case 1 -> IntroducirDatos(); // Introducir los datos del producto
			case 2 -> nuevoProducto(); // dar de alta un nuevo producto
			case 3 -> BuscarProducto(); // Buscar un producto
			case 4 -> EliminarProducto(); // Eliminar un producto
			case 5 -> MostarrValor(); // Mostrar el valor de un producto
			case 6 -> InformeRotura(); // informar que un producto ha sobrepasado el limite de rotura
			case 7 -> System.out.println("ha seleccionado salir del programa");// salir del programa

			}
		} while (opcion != 7);
	}

//menu de eleccion 
	private static void mostrarMenu() {
		System.out.println("1. introducir datos nuevo inventario");
		System.out.println("2. Nuevo producto");
		System.out.println("3. Buscar producto");
		System.out.println("4. Eliminar producto");
		System.out.println("5. Mostrar valor del producto");
		System.out.println("6. informar rotura de Stock");
		System.out.println("7. salir");
		System.out.print("Seleccione una opción: ");
	}

	private static void IntroducirDatos() {
		System.out.print("Ingrese el nombre del producto: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese el stock del producto");
		int stock = scanner.nextInt();
		System.out.print("Ingrese el precio ");
		int precio = scanner.nextInt();
		scanner.nextLine();
		Productos[contadorProducto] = new MetodosEj3(nombre, stock, precio); // usamos el constructor creado para
																				// asignar los valores
		contadorProducto++;

	}

	private static void nuevoProducto() {

		System.out.print("Ingrese el nombre del producto: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese el stock del producto");
		int stock = scanner.nextInt();
		System.out.print("Ingrese el precio ");
		int precio = scanner.nextInt();
		scanner.nextLine();
		Productos[contadorProducto] = new MetodosEj3(nombre, stock, precio); // usamos el constructor creado para
																				// asignar los valores
		contadorProducto++;
	}

	private static void BuscarProducto() {
		System.out.print("Cual es el nombre del producto? ");
		String nombre = scanner.nextLine();

		for (int i = 0; i < contadorProducto; i++) {
			if (Productos[i].getNombreProducto().equalsIgnoreCase(nombre)) { // recorremos el array hasta que se
																				// encuentre una coincidencia con el
																				// nombre del producto
				System.out.println("Producto encontrado: " + Productos[i]); // imprimimos si encontrado
				return;
			}
		}
		System.out.println("Producto no encontrado."); // imprimimos si no encontrado

	}

	private static void EliminarProducto() {

		System.out.print("Que producto desea eliminar? ");
		String nombreDelete = scanner.nextLine();
		for (int i = 0; i < contadorProducto; i++) {
			if (Productos[i].getNombreProducto().equalsIgnoreCase(nombreDelete)) { // al igual que anytes recorremos el
																					// array buscando el nombre
																					// introducido
				for (int j = i; j < contadorProducto - 1; j++) {
					Productos[j] = Productos[j + 1];
				} // de encontrarlo, eliminarlo del array y situar en su posicion el objeto
					// siguiente
				Productos[--contadorProducto] = null;
				System.out.println("Producto eliminado exitosamente.");
				return;
			}
		}
		System.out.println("Producto no encontrado."); // imprimimos si no encontrado

	}

	private static void MostarrValor() {
		System.out.print("Cual es el nombre del producto? ");
		String nombreValor = scanner.nextLine();
		for (int i = 0; i < contadorProducto; i++) { // seguimos recorriendo el array

			if (Productos[i].getNombreProducto().equalsIgnoreCase(nombreValor)) {

				System.out.println("El precio del producto seleccionado es: " + Productos[i].getPrecioProducto()); // llamamos
																													// al
																													// set
																													// del
																													// precio
																													// y
																													// lo
																													// imprimimos

				return;
			}
		}
		System.out.println("producto no encontrado"); // imprimimos si no encontrado
	}

	private static void InformeRotura() {
		System.out.print("Cual es el nombre del producto? ");
		String nombreRotura = scanner.nextLine();
		for (int i = 0; i < contadorProducto; i++) { // seguimos recorriendo el array

			if (Productos[i].getNombreProducto().equalsIgnoreCase(nombreRotura)) {

				if (Productos[i].getStockProducto() < 50) { // llamamos al get de stock y comporbamos si es menor que el
															// numero del stock de seguridad

					System.out.println("Se ha roto el Stock de seguridad"); // imprimimos si es menor que 50

				} else {
					System.out.println("el producto está en rango de seguiridad"); // imprimimos si es mayor o igual que
																					// 50
				}

			}
		}
		System.out.println("producto no encontrado"); // imprimimos si no encontrado
	}

}
