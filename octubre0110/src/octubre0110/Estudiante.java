package octubre0110;

public class Estudiante {

	String nombre; 
	int edad;

	Estudiante(String nombre, int edad)//Constructor para crear mi objeto con los valores pasados por parametros
	{
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	public String toString()//Metodo String que solo retorna mis atributos en forma de cadena
	{
		return "nombre: "+nombre+" edad: "+edad; 
	}

}
