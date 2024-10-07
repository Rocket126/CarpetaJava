package ejercicios;

public class Ejercicios {

	public static void main(String[] args) {
		
		Coche coche = new Coche();
		
		coche.setAnio(2022);
		coche.setMarca("Toyota");
		coche.setModelo("Auris");
		coche.setPrecio(0);
		
		System.out.println(coche.getModelo());//Para imprimir un valor solo de un atributo
		
		System.out.println(coche);//impriendo todos los datos del coche
		
		
		
		
		//Ejercicio 2
		
		Empleado empleado = new Empleado();
		
		//insertando valores a los atributos
		empleado.setEdad(90);
		empleado.setNombre("Javier");
		empleado.setSalario(1000);
		
		//imprimiendo valores a los atributos
		System.out.println("Nombre emp: "+empleado.getNombre());//Accediendo al atributo publico nombre del empleado
		System.out.println("Edad emp: "+empleado.getEdad());
		//System.out.println(empleado.edad);//atributo privado
		
		System.out.println(empleado);//accediendo a todos los valores del empleado 
		
		
	}

}
