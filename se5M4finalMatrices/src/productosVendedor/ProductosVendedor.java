package productosVendedor;

import java.util.Scanner;

public class ProductosVendedor {

	public static void main(String[] args) {
		
		String[] nombre = new String[7];
		int[] valor = new int[7];
		String[] descripcion = new String[7];
		
		Scanner sc = new Scanner(System.in);
		int contador=0, opn;
		int iterador=0;
		
		String r="s";
		
		
		do {
			
			System.out.println("Elija una opcion");
			System.out.println("1.- Ver productos");
			System.out.println("2.- Agregar Productos");
			System.out.println("3.- Modificar Producto");
			System.out.println("4.- Salir");
			opn=sc.nextInt();
			
			
			switch(opn)
			{
				case 1:
					//imprimir lo que esta dentro de nuestros arreglos
					if(contador != 0)
					{
						for(int i=0; i<contador;i++)//contador almacena la cantidad de veces que se inserto un producto
						{
						System.out.println((i+1) +" Producto: "+nombre[i]+" - valor: "+valor[i]+" - Descripcion: "+descripcion[i] );
						}
						System.out.println("Cantidad productos: "+contador);
					}
					else
					{
						System.out.println("no hay productos que listar");
						System.out.println("Cantidad productos: "+contador);
					}
					
					
					
					break;
				
				case 2:
					r="s";
					
					if(contador<7)
					{
						while(r.charAt(0) == 's')//charAt es un metodo para obtener un caracter por medio de su indice y comparar.
						{
							System.out.println("Ingresa el nombre del producto");
							nombre[iterador]=sc.next();
							
							System.out.println("Ingresa el valor del producto");
							valor[iterador]=sc.nextInt();
							
							System.out.println("Ingresa la descripcion del producto");
							descripcion[iterador]=sc.next();
							
							contador++;//contador de productos ingresados
							iterador++;//indice 0 a 6 para almancenar productos[]
							
							
							
							if(iterador==7)
							{
								System.out.println("Alcanzaste tu limite de inserciones");
								break;//rompemos la iteracion
							}
							
							
							System.out.println("¿Desea agregar mas productos?, responda  's' para si y 'n' para no");
							r=sc.next();
							
							
						
						}//fin while
					}
					else
					{//si llega al limite de inserciones por medio del contador, se mostrara el mensaje
						System.out.println("llegaste al limite de inserciones");
					}
						
					
					break;
					
				case 3:
					
					int posicion;
					//modificar un producto
					System.out.println("Ingresa la posicion del producto entre 1 y "+contador);
					posicion = sc.nextInt();
					
					System.out.println("Ingrese el precio del producto ");
					valor[posicion-1] = sc.nextInt();
					
					System.out.println("Valor modificado exito");
					
					break;
					
				case 4:
					System.out.println("Saliendo");
					break;
			}
			
			
			
			
			
		}while(opn != 4);
		
		System.out.println("Saliendo");
		
		
		
		
		
		
		
	}

}
