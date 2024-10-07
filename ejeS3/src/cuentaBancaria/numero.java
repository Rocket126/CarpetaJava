package cuentaBancaria;

import java.util.Scanner;

public class numero {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese un numero");
		n=sc.nextInt();
		
		while(n<0)
		{
			System.out.println("ingrese un numero positivo");
			n = sc.nextInt();
		}
		
		
	}

}
