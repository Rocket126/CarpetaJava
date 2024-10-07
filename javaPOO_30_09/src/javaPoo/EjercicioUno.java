package javaPoo;

public class EjercicioUno {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Pedro",22,'M'); 
		
		System.out.println(persona.nombre+" "+ persona.edad+" "+persona.genero);

	}
	
}

class Persona
{
	String nombre;
	int edad;
	char genero;
	
	
	
	//Constructor
	
	Persona(String nombre, int edad, char genero)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
}	
