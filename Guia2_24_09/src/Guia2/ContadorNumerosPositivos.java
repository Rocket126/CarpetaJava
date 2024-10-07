package Guia2;

import java.util.Scanner;

public class ContadorNumerosPositivos {

	public static void main(String[] args) {
		
		int positivo=0, negativo=0, cero=0, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 10 numeros enteros");

		for(int i=1;i<=10;i++)	
		{	
			System.out.println("numero "+i);
			
			n = sc.nextInt();
			if(n>0)
			{
				positivo++;
			}
			else if(n==0)
			{
				cero++;
			}
			else
			{
				negativo++;
			}
		}
		
		sc.close();
		System.out.println("cantidad numeros positivos: "+positivo);
		System.out.println("cantidad numeros negativos: "+negativo);
		System.out.println("cantidad numeros cero: "+cero);
		
		
		

	}

}
