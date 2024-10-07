package Guia2;

import java.util.Scanner;

public class EjercicioSeis {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero positivo");
		n=sc.nextInt();
		
		if(n>0)
		{
			if(n<2)
			{
				System.out.println("Los numeros menores a 2 no son primos");
			}
			else
			{
				for(int i=2;i<n;i++)
				{
					if(i%1==0)
					{
						if(i%2==0)
						{
							System.out.println("Los numeros primos son: "+i);
						}
						
					}
				}
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
