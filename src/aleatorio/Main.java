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

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int item;
		//To count input item #1
		int i = 0;
		//To save every id
                ArrayList lista = new ArrayList();
		//To ask name and put on scanner
		String nombre;
                int numeroRandom;
                 Random rd = new Random();
       
		//To generate random number
		Generador generador[] = new Generador[10];
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
					if (i < 10) {
						System.out.print("Ingrese su nombre: ");
						//Ask name
						nombre = input.next();
                                                int repetido=0;
                                             
                                                do{
                                                    numeroRandom = rd.nextInt(11);;
                                                    if(lista.contains(numeroRandom)){
                                                        repetido=1;
                                                    }
                                                    else{
                                                        repetido=0;
                                                        lista.add(numeroRandom);
                                                    }
                                                }while(repetido==1);
                                                
						generador[i] = new Generador(numeroRandom, nombre);
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

					} else {
						System.out.println("\nError. límite de usuarios: 10\n");
						item = 0;
					}
					break;

				}
				case 2: {
					if (i == 10) {
                                                Arrays.sort(generador);
						System.out.println("\nConsultado listado...");
						item = 0;
                                                
                                                for (int in=0;in<generador.length;in++) {
							System.out.print("ID: " + generador[in].getId() + " | ");
							System.out.print("Nombre: " + generador[in].getNombre() + "\n");

						}
						System.out.println("");
					} else {
						System.out.println("\nLo sentimos, para mostrar los datos debe ingresar los 10 registros completos\n");
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

		} while (item== 0);
	}

}
