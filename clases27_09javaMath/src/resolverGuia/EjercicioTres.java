package resolverGuia;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("ingresa cuantos numeros guardara");
		int N = sc.nextInt(); //
		
		
		int[] vector = new int[N];
		int numero;
			
		
		
		
		for(int i=0; i<vector.length;i++)
		{
			numero = (int) (Math.random() * 100) + 1; //obtener numero aleatorio entre 1 y 100
			
			if(i==0)
			{
				vector[i]=numero;
			}
			//si en la siguiente iteracion si lo que esta en mi indice anterior 0 es igual a mi nuevo valor aleatorio 
			//para la posicion indice 1, insertamos un nuevo valor para la posicion 1
			else if(vector[i-1] == numero)
			{
				vector[i] = (int) (Math.random() * 100) + 1;//Asignamos un nuevo valor al indice 1
			}
			
			else//si no es igual el valor del indice anterior a mi nuevo valor, asignamos
			{
				vector[i]=numero;
			}
		}//fin for
		
		
		System.out.println();
		
		
		//imprimiendo vector
		for(int elemento : vector)
		{
			System.out.println("Los elementos en mi vector son: "+elemento);
		}
		
		
	}

}
