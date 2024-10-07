package clienteCompras;

public class Producto {
	String nombre;
	double precio;
	Categoria categoria;
	
	Producto(String nombre, double precio, Categoria categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	double getPrecioConDescuento()
	{
		return precio - (precio * categoria.getDescuento());
	}//devuelve el precio del producto despues de aplicar el descuento de la categoría
	
	
	@Override
	public String toString()
	{
		return "Nombre Prod: "+nombre+", Precio: "+precio+", "+categoria.toString();
	}
}
