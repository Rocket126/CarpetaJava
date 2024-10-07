package ejercicios;

public class ClasesPrivatePublic {

		public static void main(String[] args) {
			//
			Producto producto = new Producto();
			//publica
			producto.setCantidad(-1);
			producto.precio=100;
			
			//private
			producto.setNombre("laptop");
			System.out.println(producto.getNombre());
			producto.setNombre("pc");
			System.out.println(producto.getNombre());
			
			System.out.println("cantidad: "+producto.getCantidad());
		
		}
	}

