package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		String[] cadena = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3;i++)
		{
			System.out.print(i+" Ingresa el nombre: ");
			cadena[i] = sc.next();
		}
		
		
		
		//Comparar Nombres
			if(cadena[0].equals(cadena[cadena.length-1]))
			{
				
				System.out.println("El nombre En la posicion 0: "+cadena[0]+" y en la posicion 2: "+cadena[2]);
				System.out.println("Son iguales");
			}
			else {
				System.out.println("El nombre En la posicion 0: "+cadena[0]+" y el nombre en la posicion 2: "+cadena[2]);
				System.out.println("No son iguales");
			}

		
	}

}
