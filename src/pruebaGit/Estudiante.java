package pruebaGit;

public class Estudiante {
	private String DNI;
	private String nombre;
	private String apellido;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String DNI, String nombre, String apellido) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;		
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Estudiante: \nDNI = " + DNI + " \nNombre = " + nombre + " \nApellido = " + apellido;
	}
	
	
	//GETTER & SETTER
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	
}
