package aleatorio;

//import java.util.Arrays;
public class Menu {

	private int item;
	private int[] id;
	private int count;
	private String name;
	Generador generador[] = new Generador[10];

	public Menu(int item) {
		this.item = item;
		this.count = 0;
		for (int i = 0; i < generador.length; i++) {
			generador[i] = new Generador(-1, "");
		}
	}

	//SETTER AND GETTER
	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

	public Generador[] getGenerador() {
		return generador;
	}

	public void setGenerador(Generador[] generador) {
		this.generador = generador;
	}

	//Left methods
	public void showMenu() {
		System.out.println("********** Bienvenido al sistema de registro estudiantil **********");
	}

	public void showItems() {
		System.out.println("1. Ingresar");
		System.out.println("2. Mostrar");
		System.out.println("3. Salir");
		System.out.print("Ingresa una opción: ");
	}

	public void inData() {
		if (count < 10) {
			System.out.print("Ingrese su nombre: ");
			name = input.next();
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

	}

	public void exitMenu() {
		System.out.println("\nProcesando petición...");
		System.out.println("Cerrando el menú...\n");
		System.out.println("********* Sistema cerrado correctamente *********");
		System.out.close();
	}

}
