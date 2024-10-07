package resolverGuia;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		String[] cadena = new String[2];
		
		int opn;
		
		Scanner sc =  new Scanner(System.in);
		
		for(int i=0;i<cadena.length;i++)
		{
			System.out.print(i+" ingresa por consola el texto ");
			cadena[i] = sc.next();//
		}
		
		
		System.out.println("Ingresa la opcion");
		System.out.println("1.- Convertir a mayusculas");
		System.out.println("2.- Convertir a minusculas");
		
		opn = sc.nextInt();
		
		switch(opn)
		{
			case 1:
				//for(int i=0;i<cadena.length;i++)
				//{
					//convertimos a mayusculas
					//System.out.print("convertimos a Mayusculas ");
					//System.out.println(cadena[i].toUpperCase());
				//}
				
				for(String elemento : cadena)
				{
					System.out.print("convertimos a Mayusculas ");
					System.out.println(elemento.toUpperCase());
				}
				
			break;
			
			case 2:
				for(int i=0;i<cadena.length;i++)
				{
					
					//convertimos a minusculas
					System.out.print("convertimos a Minusculas ");
					System.out.println(cadena[i].toLowerCase());
				
				}
				
			break;
			
			default:
				System.out.println("No existe esa opcion");
			break;
		}
		
		
	}

}
