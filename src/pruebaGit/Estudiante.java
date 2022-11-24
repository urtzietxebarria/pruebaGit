package pruebaGit;

public class Estudiante {
	private String cod_estu;
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String cod_estu, String nombre, String apellido1, String apellido2) {
		this.cod_estu = cod_estu;
		this.nombre = nombre;
		this.apellido1 = apellido1;	
		this.apellido2 = apellido2;
	}

	
	//TO STRING
	@Override
	public String toString() {
		return "Estudiante: \nDNI = " + cod_estu + " \nNombre = " + nombre + " \nPrimer apellido = " + apellido1 
				+" \nSegundo apellido = " + apellido2 ;
	}
	
	
	//GETTER & SETTER
	public String getCod_estu() {
		return cod_estu;
	}

	public void setCod_estu(String cod_estu) {
		this.cod_estu = cod_estu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
		
}
