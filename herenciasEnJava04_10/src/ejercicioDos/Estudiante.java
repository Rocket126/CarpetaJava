package ejercicioDos;

public class Estudiante extends Persona{

	
	
	public Estudiante(String nombre)
	{
		super(nombre);
	}
	
	
	@Override //sobre escribiendo metodo saludar del padre
	public void saludar()
	{
		super.saludar();
		System.out.println("Que descanses bien estos dias :)");
	}
	
	//insertando valor por medio del metodo setter
	//public void setNombre(String nombre)
	//{
	//	this.nombre = nombre;
		//Heredo el atributo "nombre" de la clase super() "Persona" a mi clase Estudiante
	//}
	
}
