package pruebaGit;

public class Main {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("73423978Q", "Jose Luis", "García");
		
		System.out.println(e1.getNombre());
		System.out.println(e1.getApellido());
		System.out.println(e1.getDNI());
		System.out.println("********************************************");
		System.out.println(e1.toString());

	}

}
