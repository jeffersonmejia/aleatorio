/*
Task #2

Subject: Algoritmos y estructura de datos
1

Parallel: "B"

Group #4
-> Delgado Cevallos Brythany Stefania
-> Mejía Chávez Jefferson Paúl
-> Mero García José Manuel
-> Molina Guillem Fernando José
-> Zambrano Bravo Merly Paola
 */
package aleatorio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		*To ask item
		 */
		Scanner input = new Scanner(System.in);

		int item;
		int id;
		int i = 0;
		String nombre;

		Generador generador[] = new Generador[10];
		Generador generadorid = new Generador(-1, "");

		/*
		*item by item
		 */
		System.out.println("**************** Bienvenido al sistema de registro estudiantil ****************");
		do {
			/*
		*To set a item menu
			 */
			System.out.println("1. Ingresar");
			System.out.println("2. Mostrar");
			System.out.println("3. Salir");
			System.out.print("Ingresa una opción: ");
			item = input.nextInt();
			switch (item) {
				case 1: {
					if (i < 10) {
						System.out.print("Ingrese su nombre: ");
						nombre = input.next();
						generador[i] = new Generador(generadorid.setRandom(), nombre);
						generador[i].setNombre(nombre);
						System.out.println("-------------------------------");
						System.out.println("ID: " + generador[i].getId() + " | " + "Nombre: " + generador[i].getNombre());
						System.out.println("¡Guardado con éxito!");
						i++;
						System.out.println("\nRegistrados: " + i);
						System.out.println("-------------------------------");
						item = 0;

						//extra code
						/*for (int j = 1; j < i; j++) {
							//System.out.println("ID 0: " + generador[0].getId() + "\tID loop:" + generador[j].getId());

							if (generador[0].getId() == generador[j].getId()) {
								System.out.println("Coincidencia encontrada");
							}
							for (int x = 0; generador[j].getId() != generador[j].getId(); x++) {
								System.out.println("Buscando otro id...");
								generador[i] = new Generador(generadorid.setRandom(), nombre);
							}

						}*/
					} else {
						System.out.println("\nError. límite de usuarios: 10\n");
						item = 0;
					}
					break;

				}
				case 2: {
					if (i > 0) {
						System.out.println("\nConsultado listado...");
						item = 0;
						for (int j = 0; j < i; j++) {
							System.out.print("ID: " + generador[j].getId() + " | ");
							System.out.print("Nombre: " + generador[j].getNombre() + "\n");
						}
						System.out.println("");
					} else {
						System.out.println("\nLo sentimos, no encontramos datos en el registro\n");
						item = 0;
					}
					break;
				}
				case 3: {
					System.out.println("\nProcesando petición...");
					System.out.println("Cerrando el menú...\n");
					System.out.println("********* Sistema cerrado correctamente *********");
					System.out.close();
					break;
				}
				default: {
					System.out.println("Opción no válida");
					item = 0;
				}
			}

		} while (item
			== 0);
	}
}
