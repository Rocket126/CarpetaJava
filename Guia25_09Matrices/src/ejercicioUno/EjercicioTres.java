package ejercicioUno;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		float[] vector=new float[5];
		
		Scanner sc = new Scanner(System.in);
		
		float suma=0 ;
		
		
		
		for(int i=0; i<5; i++ )
		{
				System.out.print(i+1);
				System.out.println(" Ingresa tu nota estudiante con coma");
				vector[i] = sc.nextFloat();
				
				suma+=vector[i];
		}
		
		
		
		System.out.println("El promedio es: "+ suma/vector.length);
		
		
		

	}

}
