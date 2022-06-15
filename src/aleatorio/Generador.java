package aleatorio;

/*
* To generate Random values
 */
import java.util.Random;

public class Generador {

	private String nombre;
	private int id;

	public Generador() {
		nombre = "";
		id = -1;
	}

	public Generador(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int setRandom() {
		/*
		*To set a random number
		 */
		Random rand = new Random();
		int from = 0;
		int to = 10;
		int getRandom = rand.nextInt(to);
		/*
		*Verify range 1-10
		 */
		do {
			getRandom = rand.nextInt(to);

		} while (getRandom == from || getRandom > to);
		id = getRandom;

		return id;
	}

}
