package Guia2;

import java.util.Scanner;

public class EjercicioCinco {

	public static void main(String[] args) {
		
		int nota, cantidad, contador=0, suma=0, pro;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese La cantidad de notas a promediar: ");
		cantidad = sc.nextInt();
		
		while(cantidad>0)
		{
			System.out.println("Ingrese nota "+contador);
			nota = sc.nextInt();
			suma+=nota;
			
			contador++;
			if(contador==cantidad)
			{
				break;
			}
		}
		
		pro = suma/cantidad;
		System.out.println("El promedio es: "+pro);
		
		
		
	}

}
