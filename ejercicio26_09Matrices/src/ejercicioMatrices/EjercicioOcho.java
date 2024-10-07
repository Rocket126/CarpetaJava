package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioOcho {

	public static void main(String[] args) {
		
		int[] numeros =  new int[8];
		Scanner sc = new Scanner(System.in);
		int minimo=0;
		
		//llenamos el array
		for(int i=0; i<numeros.length;i++)
		{
			System.out.print(i+" Ingresa el valor: ");
			numeros[i] = sc.nextInt();
		}
		
		minimo=numeros[0];
		
		//recorriendo el array
		for(int i=1; i<numeros.length;i++)
		{
			if(numeros[i]<minimo)
			{
				minimo=numeros[i];
			}
		}
		
		System.out.println("El valor minimo en el array es: "+ minimo);
		
		
	}

}
