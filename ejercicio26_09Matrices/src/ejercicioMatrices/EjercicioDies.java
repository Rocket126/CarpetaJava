package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioDies {

	public static void main(String[] args) {
		
		int[] numeros =  new int[10];
		Scanner sc = new Scanner(System.in);
		int positivo=0,negativo=0;
		
		//llenamos el array
		for(int i=0; i<numeros.length;i++)
		{
			System.out.print(i+" Ingresa el valor: ");
			numeros[i] = sc.nextInt();
		}//fin for
		
		for(int i=0; i<numeros.length;i++)
		{	
		
			if(numeros[i]>0)
			{
				positivo++;
			}
			else
			{
				negativo++;
			}
		}//fin for
		
		sc.close();
		System.out.println("cantidad numeros positivos: "+positivo);
		System.out.println("cantidad numeros negativos: "+negativo);


	}

}
