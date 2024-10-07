package octubre0110;

public class Producto {

	String nombre;
	int precio;
	
	Producto(String nombre, int precio)
	{
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	@Override
	public String toString()
	{
		return "nombre: "+nombre+" precio: "+precio;
	}
}
