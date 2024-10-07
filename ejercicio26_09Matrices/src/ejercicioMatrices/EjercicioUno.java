package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		int[] miArreglo = new int[5];
		
		Scanner sc = new Scanner(System.in);
		int par=0;
		
		
		for(int i=0;i<5;i++)
		{
			System.out.print(i+" Ingresa el numero: ");
		
			miArreglo[i]=sc.nextInt();
		}
		
		//Verificar si es par
		for(int i=0;i<5;i++)
		{
			
			if(miArreglo[i]%2 == 0)
			{
				par++;
			}
		}
		
		System.out.println("Total numeros pares: "+ par);
		
		
	}

}
