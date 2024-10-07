package clienteCompras;

public class EjercicioExtra {

	public static void main(String[] args) {
		//Objeto Direccion
		Direccion direccion = new Direccion("Principal 123", "Santiago", "Chile");
		//System.out.println(direccion);
		
		//objeto categoria
		Categoria categoria = new Categoria("Electronica", 15);
		//System.out.println(categoria);
		
		//objeto producto
		Producto producto = new Producto("Televisor", 500, categoria);
		//System.out.println(producto);
		
		//objeto cliente
		Cliente cliente = new Cliente("Juan", 70, direccion);
		//System.out.println(cliente);
		
		//creando objeto compra con el cliente y el producto
		Compra compra = new Compra(cliente, producto);
		
		System.out.println("\nDatos comprador y Compra "+compra);//imprimiendo compra con todos los descuentos y datos del cliente
		System.out.println();
		System.out.println("Precio total de la compra: \n"+ compra.calcularPrecioTotal());
		
		
	}

}
