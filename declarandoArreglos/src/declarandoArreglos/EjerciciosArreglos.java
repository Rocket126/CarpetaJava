package declarandoArreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArreglos {

	public static void main(String[] args) {
		
		int miArreglo[]= {8,4,5,6};
		
		System.out.println("largo del arreglo: "+miArreglo.length);
		System.out.println(Arrays.toString(miArreglo));
		
		
		
		//-----------segunda forma de declarar una array enteros
		
		//para hacer un array dinamico o de de tamaño N, con el tamaño ingresado por el usuario
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ingresa el tamaño para el vector");
		int N = sc.nextInt();
		
		int[] arreglo2 = new int[N];//asignamos el tamaño al vector introduciendo N en los corchetes
		

		System.out.println("largo del arreglo 2: "+arreglo2.length);
		

	}

}
