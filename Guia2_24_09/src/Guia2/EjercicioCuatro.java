package Guia2;

import java.util.Scanner;

public class EjercicioCuatro {

	public static void main(String[] args) {
		
		//Math.random al multiplicarlo por 100 obtengo un rango de numeros desde 0 a 99, 
		//luego lo convierto a entero
		int numeroAleatorio = (int) (Math.random() * 101);
		
		int n=0;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("numero aleatorio: "+numeroAleatorio);
		
		while(n != numeroAleatorio)
		{
			System.out.println("Ingrese un numero del 1 al 100");
			n = sc.nextInt();
			
			if(n==numeroAleatorio)
			{
				System.out.println("Acertaste! el numero es: "+ n);
				//break;para detener el ciclo while
				
			}
			else if(n>numeroAleatorio)
			{
				System.out.println("Intente de nuevo");
				System.out.println("El numero aleatorio es menor al que ingresaste");
			}	
			else{
					System.out.println("El numero aleatorio es mayor al numero que ingresaste");
			}
			
		}//fin while
		
		sc.close();
		System.out.println("Saliendo del while");
		
	
		
	
	}

}
