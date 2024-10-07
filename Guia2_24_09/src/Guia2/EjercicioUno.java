package Guia2;

import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		n = sc.nextInt();
		
		if(n>0)
		{
			for(int i=0; i<=n; i=i+2) 
			{
				System.out.println(i);
			}
		}
		

	}

}
