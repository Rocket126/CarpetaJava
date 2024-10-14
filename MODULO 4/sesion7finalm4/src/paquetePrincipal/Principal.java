package paquetePrincipal;

import java.util.Scanner;

import modelo.Cocina;//importado para usar clases desde otros paquetes
import modelo.Producto;
import modelo.Refrigerador;//importado para usar clases desde otros paquetes

public class Principal {

	public static void main(String[] args) {
		
		
		//Cocina no se puede resolver a un tipo, por lo tanto se debe importar la clase al main para usar La clase Cocina
		
		//Producto cocinas = new Producto();
		//cocinas.setCantidadDisponible(10);
		//cocinas.setPrecio(150000);
		
		//Producto refrigeradores = new Producto();
		
		
		
		
		Cocina cocinas = new Cocina();
		cocinas.setCantidadDisponible(10);
		cocinas.setPrecio(150000);
		cocinas.setCantQuemadores(4);
		
		Refrigerador refrigeradores = new Refrigerador();
		//herede los metodos setter de la clase padre producto hacia la hija refrigerador
		//por ende puedo setear los valores de la clase producto ya que tambien herede los atributos de la clase padre, 
		//ahora son mis variables y mis metodos en la clase refrigerador
		refrigeradores.setCantidadDisponible(10);
		refrigeradores.setPrecio(200000);
		refrigeradores.setGastoEletrico("A");
		refrigeradores.setNPuertas(2);
		
		//refrigeradores.cambiarPrecio(500000);
		
		//System.out.println(refrigeradores);
		
		
		String cadena;//Para el si o no
		Scanner sc = new Scanner(System.in);
		int opn;
		
		
		
		
		
		do {
			System.out.println("Seleccione el producto que desea comprar");
			System.out.println("1- Cocina");
			System.out.println("2- Refrigerador");
			System.out.println("3- salir");
			opn = sc.nextInt();
			
			switch(opn)
			{
				case 1:
					System.out.println(cocinas);//impriendo cocinas con toString()
					System.out.println("Cantidad disponible: "+cocinas.cantidadDisponible());
					
					System.out.println("Presione Y para continuar. N para cancelar");
					cadena = sc.next();
				
		
					if(cadena.toLowerCase().equals("y"))//convirtiendo la letra a minuscula
					{
					
						cocinas.incluyeGas();
					}
					else {
						//si escribe no (para cancelar la compra) imprime esto
						System.out.println( "Compra Cancelada");
					}
					
				break;
					
				case 2:
					System.out.println(refrigeradores);//impriendo refrigeradores con toString()
					refrigeradores.compraRefrigerador();
					System.out.println("Cantidad disponible: "+refrigeradores.cantidadDisponible());
					
				break;
					
				case 3:
					System.out.println("Saliendo");
				break;
				
				default:
					System.out.println("Opcion no valida");
				break;
					
			}
		}while(opn != 3);
		
		
		sc.close();
		
		
		
		
	}

}
