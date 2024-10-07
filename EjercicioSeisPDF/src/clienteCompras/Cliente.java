package clienteCompras;

public class Cliente {
	
	String nombre;
	int edad;
	Direccion direccion;
	
	Cliente(String nombre, int edad, Direccion direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		
	}
	
	//obtener descuento por edad. Retorna el porcentaje de descuento si cumple la condicion
	double obtenerDescuentoPorEdad()
	{
		return (edad > 65)? 0.1 : 0;
	}
	
	
	@Override
	public String toString()
	{
		return "Nombre: "+nombre+", Edad: "+edad+", Direccion: "+direccion.toString();
	}

}
