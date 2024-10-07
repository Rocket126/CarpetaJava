package clienteCompras;

public class Compra {
	Cliente cliente;
	Producto producto;
	
	public Compra(Cliente cliente, Producto producto) {
		this.cliente = cliente;
		this.producto = producto;
	}
		

	
	// Metodo para calcular el precio total con descuento por edad mas el descuento anterior del producto
	//realizado en la clase producto
	double calcularPrecioTotal()
	{ 
		double descuentoEdad = cliente.obtenerDescuentoPorEdad();
		
		return producto.getPrecioConDescuento() - (producto.getPrecioConDescuento() * descuentoEdad);

	}
	
	
	@Override
	public String toString()
	{
		return "\n"+cliente.toString()+"\n"+producto.toString();
	}
	
	
}
