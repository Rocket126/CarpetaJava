package sesisonSeisM4;

public class Persona {

	String nombre;
	String contraseña;
	String nombreCompleto;// completo de tipo 
	String fechaNacimiento;
	
	Persona(String Nombre,	String Contraseña, String NombreCompleto, String FechaNacimiento)
	{
		this.nombre = Nombre;	
		this.contraseña	= Contraseña; 
		this.nombreCompleto	= NombreCompleto;
		this.fechaNacimiento = FechaNacimiento;
	}
	
	
	
	
	
	@Override
	public String toString()
	{
		return nombre+" "+contraseña+" "+nombreCompleto+" "+fechaNacimiento;
	}
	
}
