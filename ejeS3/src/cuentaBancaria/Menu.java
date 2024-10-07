package cuentaBancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("1.Sumar dos números");
			System.out.println("2.Restar dos números");
			System.out.println("3.Salir.");
			
			System.out.println("Ingrese una opcion");
			opcion = sc.nextInt();
			
		}while(opcion != 3);
		
		
		System.out.println("Saliendo del programa");
		
		
	}

}
