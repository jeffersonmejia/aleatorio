/*
-> Task #2
-> Subject: Algoritmos y estructura de datos
-> Parallel: "B"

Group #4
-> Delgado Cevallos Brythany Stefania
-> Mejía Chávez Jefferson Paúl
-> Mero García José Manuel
-> Molina Guillem Fernando José
-> Zambrano Bravo Merly Paola
 */
package aleatorio;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//To save menu item
		int item;
		//To count input item #1
		int i = 0;
		//To save every id
		int[] array = new int[10];
		//To ask name and put on scanner
		String nombre;

		//To save data on index vector
		Generador generador[] = new Generador[10];
		//To generate random number
		Generador generadorid = new Generador(-1, "");

		System.out.println("**************** Bienvenido al sistema de registro estudiantil ****************");
		do {
			//Show menu
			System.out.println("1. Ingresar");
			System.out.println("2. Mostrar");
			System.out.println("3. Salir");
			System.out.print("Ingresa una opción: ");
			//Save item
			item = input.nextInt();

			switch (item) {
				case 1: {
					//No more that 10 names
					if (i < 10) {
						System.out.print("Ingrese su nombre: ");
						//Ask name
						nombre = input.next();
						//Set a random number
						generador[i] = new Generador(generadorid.setRandom(), nombre);
						//Save name
						generador[i].setNombre(nombre);
						//Show if was saved
						System.out.println("-------------------------------");
						System.out.println("ID: " + generador[i].getId() + " | " + "Nombre: " + generador[i].getNombre());
						System.out.println("¡Guardado con éxito!");
						//Increment 0 -> +1
						i += 1;
						//Show counter
						System.out.println("\nRegistrados: " + i);
						System.out.println("-------------------------------");
						item = 0;
						//Make nothing when counter get 10
					} else {
						System.out.println("\nError. límite de usuarios: 10\n");
						item = 0;
					}
					break;

				}
				case 2: {
					//Just if there are data
					if (i > 0) {
						System.out.println("\nConsultado listado...");
						item = 0;
						//To order array list
						Arrays.sort(array);

						//Assign generator data to array
						for (int j = 0; j < i; j++) {
							array[j] = generador[j].getId();
						}
						//To show 10 times
						for (int x = 0; x < array.length; x++) {
							//just if there are not 0
							if (array[x] > 0) {
								System.out.print("ID: " + array[x] + " | ");
								System.out.print("Nombre: " + generador[x].getNombre() + "\n");
							}
						}
						System.out.println("");
						//Make nothing when there are not data
					} else {
						System.out.println("\nLo sentimos, no encontramos datos en el registro\n");
						item = 0;
					}
					break;
				}
				case 3: {
					//Show close system message
					System.out.println("\nProcesando petición...");
					System.out.println("Cerrando el menú...\n");
					System.out.println("********* Sistema cerrado correctamente *********");
					System.out.close();
					break;
				}
				default: {
					//Show error to item no allowed
					System.out.println("Opción no válida");
					item = 0;
				}
			}
			//Keep menu on all the time
		} while (item == 0);
	}

}
