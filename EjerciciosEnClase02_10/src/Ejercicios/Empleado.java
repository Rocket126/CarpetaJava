package Ejercicios;

public class Empleado {

	String nombre;
	int edad;
	double salario;
	String puesto;
	Departamento departamento;
	
	
	Empleado(String nombre,	int edad, double salario, String puesto, Departamento departamento) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.puesto = puesto;
		this.departamento = departamento;
	}
	
	@Override
	public String toString()
	{
		return "Nombre: "+nombre+
				", edad: "+edad+
				", salario: "+salario+
				", puesto: "+puesto+
				", "+departamento.toString();
	}
}
