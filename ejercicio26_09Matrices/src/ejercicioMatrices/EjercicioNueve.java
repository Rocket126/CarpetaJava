package ejercicioMatrices;

import java.util.Scanner;

public class EjercicioNueve {

	public static void main(String[] args) {
		
		double[][] estudiante = new double[3][3];
		
		Scanner sc = new Scanner(System.in);
		
		double promedio=0, suma=0;
		//PROMEDIO DE NOTAS 3 ESTUDIANTES
		
		//LLENAMOS EL FOR
		for(int i=0; i<estudiante.length; i++)
		{
			for(int j=0; j<estudiante.length; j++)
			{
				System.out.print("Estudiante "+ (i+1) + " Ingresa la nota "+j+ ": " );
				estudiante[i][j] = sc.nextDouble();
			}
		}
		
		//recorriendo la matriz por fila y su promedio por alumno
		for(int i=0; i<estudiante.length; i++)
		{
			suma=0;
			
			for(int j=0; j<estudiante.length; j++)
			{
			  suma+=estudiante[i][j];
			}
			System.out.println("Promedio estudiante "+(i+1)+" es "+ suma/estudiante.length);
		}
		

	}

}
