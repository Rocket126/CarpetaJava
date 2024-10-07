package Ejercicios;

public class Departamento {
	String nombreDepartamento;
	String jefeDepartamento;
	
	
	Departamento(String nombreDepartamento, String jefeDepartamento) {

		this.nombreDepartamento = nombreDepartamento;
		this.jefeDepartamento =jefeDepartamento;
	}
	
	@Override
	public String toString()
	{
		return "Nombre Depar.: "+nombreDepartamento+", JefeDepartamento: "+jefeDepartamento;
	}
}
