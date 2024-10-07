package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioCuatro {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		int suma=0;
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.printf(" Ingresa el valor ");
				matriz[i][j] = sc.nextInt(); 
			}
		}
		//suma de matriz
		for(int i=0; i<3; i++)
		{
			suma=0;
			for(int j=0; j<3; j++)
			{
				suma+=matriz[i][j];
			}
			System.out.println();
			System.out.println("La suma en la fila "+i+" es:"+ suma);
			
		}
		
		
	}
}
