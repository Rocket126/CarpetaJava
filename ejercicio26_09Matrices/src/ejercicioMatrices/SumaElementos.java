package ejercicioMatrices;

import java.util.Scanner;

public class SumaElementos {

	public static void main(String[] args) {
		
		int[] miArray = new int[10];
		int numero, suma=0;
		
		Scanner sc = new Scanner(System.in);
		
		//pedimos valores 
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" Ingresa el numero: ");
			miArray[i]=sc.nextInt();
			
			suma+=miArray[i];
		}
		

		
		System.out.println("La suma es: "+suma );
		
		
	}

}
