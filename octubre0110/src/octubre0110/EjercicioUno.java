package octubre0110;

public class EjercicioUno {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("Pedro", 15);
		
		System.out.println(estudiante);
		
		
		//invocar constructor producto
		Producto producto = new Producto("Chocolate", 1500);
		System.out.println(producto);
		
		
		
		//invocar el contructor para crear el objeto autor para luego insertarlo en la clase libro
		Autor autor = new Autor("Juan","Chileno");
		
		Libro libro = new  Libro("Papelucho",autor);
		
		System.out.println(libro);
		
		
		
		//invocando coche
		Coche coche = new Coche("Toyota","Crusier");
		
		Concesionario concesionario = new Concesionario("Salazar israel",coche);
		
		System.out.println(concesionario);
		
		
		//invocando al empleado
		Empleado empleado = new Empleado("Juanito", 1500);
		
		Empresa empresa = new Empresa("Soprole", empleado);
		
		System.out.println(empresa);
	}

}
