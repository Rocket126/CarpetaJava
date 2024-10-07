package Ejercicios;

public class Profesor {
	
	String nombre; 
	int edad;
	String especialidad; 
	double salario; 
	Curso curso; 
	
	Profesor(String nombre,	int edad, String especialidad, double salario, Curso curso) {
	
		this.nombre = nombre;
		this.edad= edad;
		this.especialidad = especialidad;
		this.salario = salario;
		this.curso = curso;
	
	}
	
	@Override
	public String toString()
	{
		return "nombre: "+nombre+
				", edad: "+ edad+
				", Especialidad: "+ especialidad+
				", Salario: "+salario+
				", "+curso.toString();
	}
	
	
}	
	
	
	