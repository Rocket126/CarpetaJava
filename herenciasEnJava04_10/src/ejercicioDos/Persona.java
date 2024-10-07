package ejercicioDos;

public class Persona {

	protected String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	//metodo saludar 
	public void saludar()
	{
		System.out.println("Hola, buen fin de semana "+nombre);
	}
}
