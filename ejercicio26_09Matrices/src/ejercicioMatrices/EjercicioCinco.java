package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros =  new int[5];
		
		int n;//numero adicional
		
		//llenamos el array
		for(int i=0; i<numeros.length;i++)
		{
			System.out.print(i+" Ingresa el valor: ");
			numeros[i] = sc.nextInt();
		}//fin for
		
		
		//pedir numero adicional
		System.out.println(" Ingresa el valor a comparar con el array: ");
		n = sc.nextInt();
		
		
		for(int i=0; i<numeros.length;i++)
		{	
		
			if(n==numeros[i])
			{
				System.out.println("el numero "+ n +" esta presente en el array");
				break;
			}
			
		}//fin for
	}

}
