package Guia2;

import java.util.Scanner;

public class SumaPrimerosNumeros {

	public static void main(String[] args) {
		int n,suma=0;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Ingrese un numero positivo: ");
		n=sc.nextInt();
		
		if(n>0)
		{
			for(int i=0; i<=n;i++)
			{
				suma+=i;
			}
		}
		System.out.println("suma total: "+suma);
		
	}

}
