package aleatorio;

class Generador implements Comparable<Generador> {

	private String nombre;
	private int id;

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

        @Override
        public int compareTo(Generador o) {
            if (this.id != o.getId()) {
            return this.id - o.getId();
        }
        return this.nombre.compareTo(o.getNombre());
        }
}



