package Guia2;

import java.util.Scanner;

public class PromedioVersionDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int contador =1, cantidad;
		float nota,suma=0,promedio;
		
		System.out.println("Ingrese la cantidad de notas a promediar");
		cantidad = sc.nextInt();
		
		if(cantidad>0)
		{
			while(contador<=cantidad)
			{
				System.out.println("Ingrese la nota "+contador);
				nota=sc.nextInt();
				suma+=nota;
				
				contador++;
			}
			
			promedio = suma/cantidad;
			System.out.println("El promedio es "+ promedio);
		}
		else {
			System.out.println("Ingrese una cantidad de notas mayor a 0");
		}
		
		

	}

}
