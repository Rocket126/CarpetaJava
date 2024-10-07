package Ejercicios;

public class Curso {
	String nombreCurso;
	int duracion;
	
	
	 Curso(String nombreCurso,	int duracion) {
		this.nombreCurso = nombreCurso;
		this.duracion = duracion;
				
	}
	 
	 @Override
	public String toString()
	{
		return "Nombre curso: "+nombreCurso+", Duracion: "+duracion;
				
	}
}
